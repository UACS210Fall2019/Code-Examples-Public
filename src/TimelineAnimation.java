
/*
 * TimelineAnimation
 * 
 * Example 1-5 from https://docs.oracle.com/javafx/2/animations/basics.htm
 */
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class TimelineAnimation extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        // Put a rectangle on the stage
        final Rectangle rectBasicTimeline = new Rectangle(100, 50, 100, 50);
        rectBasicTimeline.setFill(Color.RED);

        Group p = new Group();
        Scene scene = new Scene(p);
        stage.setScene(scene);
        stage.setWidth(500);
        stage.setHeight(500);

        p.getChildren().add(rectBasicTimeline);
        stage.show();

        // Animation
        final Timeline timeline = new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.setAutoReverse(true);
        final KeyValue kv = new KeyValue(rectBasicTimeline.xProperty(), 300);
        final KeyFrame kf = new KeyFrame(Duration.millis(1000), kv);
        timeline.getKeyFrames().add(kf);
        timeline.play();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
