/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication9sceanb;

import java.util.Comparator;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.print.Collation;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author Educ
 */
public class JavaFXApplication9sceanb extends Application {
   
      Stage window;
    Scene Scene1, Scene2, Scene3;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
      window = primaryStage;
        GridPane gridpane = new GridPane();
         Label Label = new Label("Welcome");
        Label.setId("welcome-text");
        Label Labe2 = new Label("User name");
        TextField myTextField = new TextField();

        Label Labe3 = new Label("Password ");
        TextField myTextField1 = new TextField();

        HBox hbox = new HBox(10, Labe2, myTextField);
        HBox hbox1 = new HBox(10, Labe3, myTextField1);

        Button btn = new Button("Sing in");
        Button btn1 = new Button("Exit");
        HBox hbox11 = new HBox(10, btn, btn1);
        Label laba = new Label();
         gridpane.add(Label, 0, 0);
         gridpane.add(hbox, 0, 1);
         gridpane.add(hbox1, 0, 2);
         gridpane.add(hbox11, 0, 3);
         gridpane.add(laba, 0, 4);
         gridpane.setHgap(10);
         gridpane.setVgap(10);
         gridpane.setAlignment(Pos.CENTER);
         gridpane.setVgap(10);
         gridpane.setHgap(10);
        btn.setOnAction(event -> window.setScene(Scene2));
        btn1.setOnAction(ev -> Platform.exit());
        Scene1 = new Scene(gridpane,300, 250);
        //
         Button bbm = new Button("add student");
         Button bbm1 = new Button("view student");
        bbm.setOnAction(eve -> window.setScene(Scene3));
        ///////////////////
        GridPane la = new GridPane();
        la.add(bbm, 0, 0);
        la.add(bbm1, 0, 1);
        la.setAlignment(Pos.CENTER);
        la.setHgap(10);
        la.setVgap(10);
        Scene2 = new Scene(la, 300, 250);
        ////////////////////////////////////////////////////////////////
        
        GridPane la1 = new GridPane();
        Label std = new Label("student data");
        la1.add(std, 0, 0);
        
        Label id = new Label("id ");
        TextField id1 = new TextField();
        HBox ii = new HBox(10, id ,id1);
        la1.add(ii, 0, 1);
       
        Label name = new Label("Name");
        TextField name1 = new TextField();
        HBox nn = new HBox(10, name ,name1);
         la1.add(nn, 0, 2);
         
        Label maj = new Label("major");
        TextField major  = new TextField();
         HBox ma = new HBox(10, maj ,major);
         la1.add(ma, 0, 3);
         
        Label grade = new Label("grade");
        TextField grade1 = new TextField();
        HBox gr = new HBox(10, grade ,grade1);
        la1.add(gr, 0, 4);
        
        Button ha = new Button("Add");
        Button haa = new Button("Reset");
        Button haan = new Button("Exit");
        HBox but= new HBox(10 , ha , haa , haan);
        la1.add(but, 0, 5);
        GridPane ha1 = new GridPane();
        ListView lv = new ListView();
        la1.add(lv, 1, 1, 1, 5);
       lv.getItems().equals(ha1);
         lv.setOrientation(Orientation.HORIZONTAL);
     
    
            ha.setOnAction(new EventHandler<ActionEvent>() {
             @Override
             public void handle(ActionEvent event) {
            lv.getItems().addAll(id1.getText() ,name1.getText() ,major.getText(),grade1.getText() );
            lv.stream().sorted((o1 ,o2) -> (int) o1.name1.getText() - o2.name1.getText())
            .map(ev -> name1.toUpperCase());
             }
         });
           haa.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                id1.setText("");
                name1.setText("");
                major.setText("");
                grade1.setText("");
            }
        });
        
        haan.setOnAction(event -> Platform.exit());
        
        la1.setAlignment(Pos.CENTER);
        la1.setHgap(10);
        la1.setVgap(10);
        Scene3 = new Scene(la1, 500, 500);
        /////////////////////////////////////////////////
        window.setScene(Scene1);
        window.setTitle("hi ");
        Scene1.getStylesheets().add("addstd.css");
        Scene2.getStylesheets().add("addstd.css");
        Scene3.getStylesheets().add("addstd.css");
        window.show();

        
    }

 
    
}
