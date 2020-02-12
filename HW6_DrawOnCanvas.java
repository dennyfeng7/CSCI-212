/*
Name: Denny Feng
Task: Canvas Drawing
Description: Create a canvas and demonstrate basic artwork. 
*/

package basics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.stage.Stage;


public class DrawOnCanvas extends Application {
    
    GraphicsContext gc;
    
    Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.BLACK};
    int colorIdx = 0;
    
    public static void main(String[] args) {
        
        //Launch the JavaFX application
        launch(args);
    }
    
    
    
    @Override
    public void start(Stage primaryStage) {
        
        //Give a title to the stage
        primaryStage.setTitle("Draw on the Canvas");
        
        //Use a FlowPane for the root node.
        FlowPane root = new FlowPane();
        
        //Center the nodes in the scene
        root.setAlignment(Pos.CENTER);
        
        //Create a scene.
        Scene scene = new Scene(root, 450, 450);
        
        //Set scene on the stage
        primaryStage.setScene(scene);
        
        //Create a canvas
        Canvas canvas = new Canvas(400, 400);
        
        //Get the graphics context for the canvas
        gc = canvas.getGraphicsContext2D();
        
        //Create a push button
        Button changeColorBtn = new Button("Change Color");
        
        //Handle the action events for the Change Color button.
        changeColorBtn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                
                //set the stroke and fill color
                gc.setStroke(colors[colorIdx]);
                gc.setFill(colors[colorIdx]);
                
                //Redraw the line, text, and filled rectangle in the
                //new color. This leaves the color of other 
                //nodes unchanged.
                
                gc.strokeLine(0, 0, 200, 200);
                gc.fillText("This is drawn on the canvas", 60, 50);
                gc.fillRect(100, 320, 300,  40);
                
                //Change the color.
                colorIdx++;
                if(colorIdx == colors.length) colorIdx = 0;
            }
        });
        
        //Draw initial output on the canvas.
        gc.strokeLine(0, 0, 200, 200);
        gc.strokeOval(100, 100, 200, 200);
        gc.strokeRect(0, 200, 50, 200);
        gc.fillOval(0, 0, 20, 20);
        gc.fillRect(100, 320, 300, 40);
        
        //Set the font size to 20 and draw text
        gc.setFont(new Font(20));
        gc.fillText("This is drawn on the canvas", 60, 50);
        
        //Add the canvas and the button to the scene graph
        root.getChildren().addAll(canvas, changeColorBtn);
        
        //Show the stage and its scene.
        primaryStage.show();
    }
}
