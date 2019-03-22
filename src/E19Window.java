import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class E19Window extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        // create the root pane and then the scene
        BorderPane root_pane = new BorderPane();
        Scene scene = new Scene(root_pane, 400, 300);
        // ===== Drawing stuff goes here =====
        // Construct a Canvas object and put it in
        // the root pane.
        Canvas canvas = new Canvas(300, 200);
        root_pane.getChildren().add(canvas);
        // Drawing on the canvas, getting a graphics context
        // and calling drawing methods on it.
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.fillText("Text in a Canvas at 30,40", 30, 40);
        gc.fillText("Text in a Canvas at 30,50", 30, 50);

        // ===================================
        // Set the scene on the stage and show the stage.
        stage.setScene(scene);
        stage.show();
    }
}
