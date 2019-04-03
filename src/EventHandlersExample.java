import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class EventHandlersExample extends Application {

   @Override 
   public void start(Stage stage) {
      //Drawing a Box 
      Box box = new Box(); 
      
      //Setting the properties of the Box 
      box.setWidth(150.0); 
      box.setHeight(150.0);   
      box.setDepth(100.0); 
       
      //Setting the position of the box 
      box.setTranslateX(350);  
      box.setTranslateY(150); 
      box.setTranslateZ(50); 
       
      //Setting the text 
        Text text = new Text(
                "Type any letter to rotate the box, and click on the box to stop the rotation");
      
      //Setting the font of the text 
      text.setFont(Font.font(null, FontWeight.BOLD, 15));     
      
      //Setting the color of the text 
      text.setFill(Color.CRIMSON); 
      
      //setting the position of the text 
      text.setX(20); 
      text.setY(50); 
       
      //Setting the material of the box 
      PhongMaterial material = new PhongMaterial();  
      material.setDiffuseColor(Color.DARKSLATEBLUE);  
      
      //Setting the diffuse color material to box 
      box.setMaterial(material);       
       
      //Setting the rotation animation to the box    
      RotateTransition rotateTransition = new RotateTransition(); 
      
      //Setting the duration for the transition 
      rotateTransition.setDuration(Duration.millis(1000)); 
      
      //Setting the node for the transition 
      rotateTransition.setNode(box);       
      
      //Setting the axis of the rotation 
      rotateTransition.setAxis(Rotate.Y_AXIS); 
      
      //Setting the angle of the rotation
      rotateTransition.setByAngle(360); 
      
      //Setting the cycle count for the transition 
      rotateTransition.setCycleCount(50); 
      
      //Setting auto reverse value to false 
      rotateTransition.setAutoReverse(false);  
      
      //Creating a text filed 
      TextField textField = new TextField();   
      
      //Setting the position of the text field 
      textField.setLayoutX(50); 
      textField.setLayoutY(100); 
       
      //Handling the key typed event 
      EventHandler<KeyEvent> eventHandlerTextField = new EventHandler<KeyEvent>() { 
         @Override 
         public void handle(KeyEvent event) { 
            //Playing the animation 
            rotateTransition.play(); 
         }           
      };              
      //Adding an event handler to the text feld 
      textField.addEventHandler(KeyEvent.KEY_TYPED, eventHandlerTextField); 
       
      //Handling the mouse clicked event(on box) 
      EventHandler<javafx.scene.input.MouseEvent> eventHandlerBox = 
         new EventHandler<javafx.scene.input.MouseEvent>() { 
         
         @Override 
         public void handle(javafx.scene.input.MouseEvent e) { 
            rotateTransition.stop();  
         } 
      }; 
      //Adding the event handler to the box  
      box.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, eventHandlerBox);
       
      //Creating a Group object
      Group root = new Group(box, textField, text); 
         
      //Creating a scene object 
      Scene scene = new Scene(root, 600, 300);      
      
      //Setting camera 
      PerspectiveCamera camera = new PerspectiveCamera(false); 
      camera.setTranslateX(0); 
      camera.setTranslateY(0); 
      camera.setTranslateZ(0); 
      scene.setCamera(camera);  
      
      //Setting title to the Stage 
      stage.setTitle("Event Handlers Example"); 
         
      //Adding scene to the stage 
      stage.setScene(scene); 
         
      //Displaying the contents of the stage 
      stage.show(); 
   }

    public static void main(String args[]) {
        launch(args);
    }
}