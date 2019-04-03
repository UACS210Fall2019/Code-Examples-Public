import java.util.Random;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class CatchMeIfYouCan extends Application {

    private static final int CANVAS_WIDTH = 800;
    private static final int CANVAS_HEIGHT = 800;
    private static final int RECT_SIZE = 500;
    private static final int BUFFER = RECT_SIZE / 2 + 50;

    private Rectangle rect;
    private Random generator = new Random();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("CMIYC");

        Group root = new Group();

        Canvas canvas = new Canvas(CANVAS_WIDTH, CANVAS_HEIGHT);
        canvas.addEventHandler(MouseEvent.MOUSE_MOVED, new MovedHandler());

        rect = new Rectangle(CANVAS_WIDTH / 2 - RECT_SIZE / 2,
                CANVAS_HEIGHT / 2 - RECT_SIZE / 2,
                RECT_SIZE, RECT_SIZE);
        rect.setFill(Color.BLUE);
        rect.addEventHandler(MouseEvent.MOUSE_CLICKED, new ClickedHandler());

        root.getChildren().add(canvas);
        root.getChildren().add(rect);

        primaryStage.setScene(new Scene(root));

        primaryStage.show();
    }

    private class ClickedHandler implements EventHandler<MouseEvent> {
        @Override
        public void handle(MouseEvent event) {
            rect.setFill(Color.BLANCHEDALMOND);
        }
    }

    private class MovedHandler implements EventHandler<MouseEvent> {
        @Override
        public void handle(MouseEvent event) {
            double mouseX = event.getX();
            double mouseY = event.getY();
            if (isNear(mouseX, mouseY)) {
                double newX = generator.nextInt(CANVAS_WIDTH - RECT_SIZE);
                if (newX - BUFFER < 0) {
                    newX += BUFFER;
                } else if (newX + RECT_SIZE + BUFFER > CANVAS_WIDTH) {
                    newX -= BUFFER;
                }
                double newY = generator.nextInt(CANVAS_HEIGHT - RECT_SIZE);
                if (newY - BUFFER < 0) {
                    newY += BUFFER;
                } else if (newY + RECT_SIZE + BUFFER > CANVAS_HEIGHT) {
                    newY -= BUFFER;
                }
                rect.setX(newX);
                rect.setY(newY);
            }
        }

        private boolean isNear(double x, double y) {
            double rectCenterX = rect.getX() + RECT_SIZE / 2;
            double rectCenterY = rect.getY() + RECT_SIZE / 2;
            return Math.abs(x - rectCenterX) < BUFFER
                    && Math.abs(y - rectCenterY) < BUFFER;
        }

    }

}