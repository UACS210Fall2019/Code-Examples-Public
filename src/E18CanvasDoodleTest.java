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
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class E18CanvasDoodleTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Resets the canvas to its original look by filling in a rectangle covering
     * its entire width and height. Color.BLUE is used in this demo.
     *
     * @param canvas
     *            The canvas to reset
     * @param color
     *            The color to fill
     */
    private void reset(Canvas canvas, Color color) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(color);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Canvas Doodle Test");
        Group root = new Group();

        // Draw background with gradient
        Rectangle rect = new Rectangle(400, 400);
        drawBackground(rect);
        root.getChildren().add(rect);

        // Create the Canvas, filled in with Blue
        final Canvas canvas = new Canvas(200, 200);
        canvas.setTranslateX(100);
        canvas.setTranslateY(100);
        reset(canvas, Color.BLUE);

        final GraphicsContext gc = canvas.getGraphicsContext2D();

        // Clear away portions as the user drags the mouse
        canvas.addEventHandler(MouseEvent.MOUSE_DRAGGED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent e) {

                        gc.clearRect(e.getX() - 2, e.getY() - 2, 5, 5);
                    }
                });

        // Fill the Canvas with a Blue rectnagle when the user double-clicks
        canvas.addEventHandler(MouseEvent.MOUSE_CLICKED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent t) {
                        if (t.getClickCount() > 1) {
                            reset(canvas, Color.BLUE);
                        }
                    }
                });

        // Add the Canvas to the Scene, and show the Stage
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.show();
    }

    /**
     * Draws the background with a RadialGradient
     * that transitions from Red to Yellow.
     * 
     * @param rect
     *            the Rectangle to draw on the Canvas
     */
    private void drawBackground(Rectangle rect) {
        rect.setFill(new LinearGradient(0, 0, 1, 1, true, CycleMethod.REFLECT,
                new Stop(0, Color.RED), new Stop(1, Color.YELLOW)));
    }
}
