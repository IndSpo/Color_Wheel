/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HuePackage;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;




/**
 *
 * @author India 
 */
   

public class ColorWheel extends Application {
    @Override
    public void start (Stage programWindow){
        BorderPane pWindow1 = new BorderPane();    
//         StackPane pWindow2 = new StackPane();
          StackPane top1 = new StackPane();
              VBox colorChoices = new VBox();
                  RadioButton choice1 = new RadioButton("Monologous");
                  RadioButton choice2 = new RadioButton("Analogous");
                  RadioButton choice3 = new RadioButton("Complimentary");
                  RadioButton choice4 = new RadioButton("Triadic");
                  RadioButton choice5 = new RadioButton("Split-Complimentary");
                  RadioButton choice6 = new RadioButton("Double-Complimentary");
              ToggleGroup swap = new ToggleGroup();
                  choice1.setToggleGroup(swap);
                  choice2.setToggleGroup(swap);
                  choice3.setToggleGroup(swap);
                  choice4.setToggleGroup(swap);
                  choice5.setToggleGroup(swap);
                  choice6.setToggleGroup(swap);
              HBox mainButtons = new HBox();    
                Button reset = new Button("Reset");
                Button save = new Button("Save");

              Circle wheelTest = new Circle();
              wheelTest.setRadius(300);

              Image colorPNG = new Image("file:src/HuePackage/colorwheel_more_complete3.png");  
              ImageView colorwheel = new ImageView();
              colorwheel.setImage(colorPNG);
              colorwheel.setFitHeight(300);
              colorwheel.setFitWidth(300);
              colorwheel.setPreserveRatio(true);

              ImageView schemeCover = new ImageView();
              Image monologous = new Image("file:src/HuePackage/monologous_cover2.png");
                  choice1.setOnAction(e ->{ 
                    if (choice1.isSelected()){
                      schemeCover.setImage(monologous);
                      pWindow1.getChildren().add(schemeCover);
                      schemeCover.setFitHeight(650);
                      schemeCover.setFitWidth(650);
                      schemeCover.setOnMouseDragged(a ->{
                           schemeCover.setRotate(25);
                          
                      });
                      
                    }

                });
              top1.getChildren().add(pWindow1);
              colorChoices.getChildren().addAll(choice1,choice2,choice3,choice4,choice5,choice6);
              colorChoices.setPadding(new Insets(50,0,0,20));
              colorChoices.setSpacing(20);

              mainButtons.getChildren().addAll(reset,save);
              mainButtons.setAlignment(Pos.CENTER);
              mainButtons.setPadding(new Insets(20,0,50,0));
              mainButtons.setSpacing(20);

              pWindow1.setLeft(colorChoices);
              pWindow1.setBottom(mainButtons);
              pWindow1.setCenter(colorwheel);


              Scene scene = new Scene(pWindow1);

              programWindow.setScene(scene);
              programWindow.setTitle("Color Wheel");
              programWindow.show();
    }
    
    public static void main(String[] args){
        launch(args);
    }
}
