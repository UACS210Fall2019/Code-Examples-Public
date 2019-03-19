
/*
 * Copyright (c) 2012 Oracle and/or its affiliates.
 * All rights reserved. Use is subject to license terms.
 *
 * This file is available and licensed under the following license:
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  - Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *  - Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the distribution.
 *  - Neither the name of Oracle nor the names of its
 *    contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LayerTest extends Application {

    private Group root;
    private BorderPane borderPane;
    private Canvas layer1;
    private Canvas layer2;
    private GraphicsContext gc1;
    private GraphicsContext gc2;
    private ChoiceBox cb;

    private void createLayers() {

        // Layers 1&2 are the same size
        layer1 = new Canvas(300, 250);
        layer2 = new Canvas(300, 250);

        // Obtain Graphics Contexts
        gc1 = layer1.getGraphicsContext2D();
        gc1.setFill(Color.GREEN);
        gc1.fillOval(50, 50, 20, 20);
        gc2 = layer2.getGraphicsContext2D();
        gc2.setFill(Color.BLUE);
        gc2.fillOval(100, 100, 20, 20);
    }

    private void handleLayers() {
        // Handler for Layer 1
        layer1.addEventHandler(MouseEvent.MOUSE_PRESSED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent e) {
                        gc1.fillOval(e.getX(), e.getY(), 20, 20);
                    }
                });

        // Handler for Layer 2
        layer2.addEventHandler(MouseEvent.MOUSE_PRESSED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent e) {
                        gc2.fillOval(e.getX(), e.getY(), 20, 20);
                    }
                });
    }

    private void createChoiceBox() {
        cb = new ChoiceBox();
        cb.setItems(FXCollections.observableArrayList("Layer 1 is GREEN",
                "Layer 2 is BLUE"));
        cb.getSelectionModel().selectedItemProperty()
                .addListener(new ChangeListener() {
                    @Override
                    public void changed(ObservableValue o, Object o1,
                            Object o2) {
                        if (o2.toString().equals("Layer 1 is GREEN")) {
                            layer1.toFront();
                        } else if (o2.toString().equals("Layer 2 is BLUE")) {
                            layer2.toFront();
                        }
                    }
                });
        cb.setValue("Layer 1 is GREEN");
    }

    private void addLayers() {
        // Add Layers
        borderPane.setTop(cb);
        Pane pane = new Pane();
        pane.getChildren().add(layer1);
        pane.getChildren().add(layer2);
        layer1.toFront();
        borderPane.setCenter(pane);
        root.getChildren().add(borderPane);
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        // Build GUI
        borderPane = new BorderPane();
        primaryStage.setTitle("Layer Test");
        root = new Group();
        createLayers();
        handleLayers();
        createChoiceBox();
        addLayers();

        // Show Scene
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
