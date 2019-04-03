import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class SimpleFX extends Application {

    TextField cmd_in = null;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        // (A) ===== set up the scene with a text box and button for input
        BorderPane p = new BorderPane();
        cmd_in = new TextField();
        Button button = new Button("Process");
        final int num_items = 2;
        HBox input_box = new HBox(num_items);
        input_box.getChildren().add(cmd_in);
        input_box.getChildren().add(button);
        p.setBottom(input_box);

        // (B) === Example of how to set up processing input from a text area
        button.setOnAction(new GetText());

        // (C) Connect the border pane into the scene and show the window.
        primaryStage.setTitle("Sample input field");
        primaryStage.setScene(new Scene(p));
        primaryStage.show();
    }

    class GetText implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            // (D)
            System.out.println(cmd_in.getText());
            cmd_in.clear();
        }
    }

}

// (E) User puts “Hello World!” in text field.
// (F) User presses the Button that says “Process”.