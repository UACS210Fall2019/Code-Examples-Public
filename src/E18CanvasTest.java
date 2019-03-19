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
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.stage.Stage;

public class E18CanvasTest extends Application {

    private Canvas canvas = new Canvas(200, 200);
    private GraphicsContext gc = canvas.getGraphicsContext2D();
    private Group root = new Group();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Canvas Test");
        moveCanvas(0, 0);
        drawDShape();
        drawRadialGradient(Color.RED, Color.YELLOW);
        drawLinearGradient(Color.BLUE, Color.GREEN);
        drawDropShadow(Color.GRAY, Color.BLUE, Color.GREEN, Color.RED);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.show();
    }

    /**
     * Moves the canvas to a new location within the Scene. This is accomplished
     * by performing a translation transformation on the Canvas object, passing
     * in the desired x and y coordinates. Passing in values of 0,0 will
     * position
     * the Canvas in the upper left corner of the Scene.
     * 
     * @param x
     *            The new x coordinate
     * @param y
     *            The new y coordinate
     */
    private void moveCanvas(int x, int y) {
        canvas.setTranslateX(x);
        canvas.setTranslateY(y);
    }

    /**
     * Draws an area in the shape of a capital letter "D."
     * The user can try substituting numbers
     * of their own in the bezierCurveTo parameters to
     * warp the shape away from the letter "D."
     */
    private void drawDShape() {
        gc.beginPath();
        gc.moveTo(50, 50);
        gc.bezierCurveTo(150, 20, 150, 150, 75, 150);
        gc.closePath();
    }

    /**
     * Draws a radial gradient on the Canvas object, which appears as a series
     * of
     * circles radiating outward. This demo uses RED and YELLOW by default.
     * 
     * @param firstColor
     *            The color used in the first Stop of the gradient.
     * @param lastColor
     *            The color used in the last Stop of the gradient.
     */
    private void drawRadialGradient(Color firstColor, Color lastColor) {
        gc.setFill(new RadialGradient(0, 0, 0.5, 0.5, 0.1, true,
                CycleMethod.REFLECT, new Stop(0.0, firstColor),
                new Stop(1.0, lastColor)));
        gc.fill();
    }

    /**
     * Draws a linear gradient on the Canvas object, which colors the letter "D"
     * from top to bottom. The default colors used in this demo are BLUE and
     * GREEN.
     * 
     * @param firstColor
     * @param secondColor
     */
    private void drawLinearGradient(Color firstColor, Color secondColor) {
        LinearGradient lg = new LinearGradient(0, 0, 1, 1, true,
                CycleMethod.REFLECT, new Stop(0.0, firstColor),
                new Stop(1.0, secondColor));
        gc.setStroke(lg);
        gc.setLineWidth(20);
        gc.stroke();
    }

    /**
     * Draws four separate drop shadows around the letter "D." The default
     * colors used in the demo are GREY, BLUE, GREEN, and RED.
     * 
     * @param firstColor
     * @param secondColor
     * @param thirdColor
     * @param fourthColor
     */
    private void drawDropShadow(Color firstColor, Color secondColor,
            Color thirdColor, Color fourthColor) {
        gc.applyEffect(new DropShadow(20, 20, 0, firstColor));
        gc.applyEffect(new DropShadow(20, 0, 20, secondColor));
        gc.applyEffect(new DropShadow(20, -20, 0, thirdColor));
        gc.applyEffect(new DropShadow(20, 0, -20, fourthColor));
    }
}
