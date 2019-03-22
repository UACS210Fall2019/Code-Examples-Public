import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class E19DrawCircle extends Application {
    @Override
    public void start(Stage stage) {
        // Drawing a Circle
        Circle circle = new Circle();

        // Setting the properties of the circle
        circle.setCenterX(300.0f);
        circle.setCenterY(135.0f);
        circle.setRadius(100.0f);

        // Creating a Group object
        Group root = new Group(circle);

        // Creating a scene object
        Scene scene = new Scene(root, 600, 300);
        // Setting title to the Stage
        stage.setTitle("Drawing a Circle");

        // Adding scene to the stage
        stage.setScene(scene);

        // Displaying the contents of the stage
        stage.show();
    }

    public static void main(String args[]) {
        launch(args);
    }
}