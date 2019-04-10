
/* 
 * TimelineEvent
 * 
 * How can we have each frame of the timeline result in just an
 * event handler being called?
 * 
 * Copied from TimelineAnimation and then modified to use an event
 * to update the location of the rectangle instead of using an
 * animation.
 */
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class TimelineEvent extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        // ------------- Put a rectangle on the stage
        final Rectangle rectBasicTimeline = new Rectangle(100, 50, 100, 50);
        rectBasicTimeline.setFill(Color.RED);

        Group p = new Group();
        Scene scene = new Scene(p);
        stage.setScene(scene);
        stage.setWidth(500);
        stage.setHeight(500);

        p.getChildren().add(rectBasicTimeline);
        stage.show();

        // -------------- Set up a timeline with an event that moves rect
        // Animation
        final Timeline timeline = new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE);

        EventHandler<ActionEvent> onFinished = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                System.out.println("Calling setX");
                rectBasicTimeline.setX(rectBasicTimeline.getX() + 10);
            }
        };

        final KeyFrame kf = new KeyFrame(Duration.millis(1000), onFinished);
        timeline.getKeyFrames().add(kf);
        timeline.play();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
