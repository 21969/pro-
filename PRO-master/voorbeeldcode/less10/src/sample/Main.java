package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;





public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Les10");
        primaryStage.setScene(new Scene(root, 1000, 800));

        Group group1 = new Group();

        Rectangle[] rectangles = new Rectangle[4];

        rectangles[0] = new Rectangle(0, 320, 100, 100);
            rectangles[0].setFill(Color.PURPLE);
        rectangles[1] = new Rectangle(120, 320, 100, 100);
            rectangles[1].setFill(Color.ORANGERED);
        rectangles[2] = new Rectangle(240, 320, 100, 100);
            rectangles[2].setFill(Color.DARKSEAGREEN);
        rectangles[3] = new Rectangle(360, 320, 100, 100);
            rectangles[3].setFill(Color.BLUEVIOLET);




        Button button1 = new Button("Links");
            button1.relocate(0, 540);
        Button button2 = new Button("Rechts");
            button2.relocate(120, 540);
        Button button3 = new Button("Groter");
            button3.relocate(240, 540);
        Button button4 = new Button("Kleiner");
            button4.relocate(360, 540);



        //Rotate links
        button1.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent m) -> {
            rectangles[0].setRotate(rectangles[0].getRotate() - 10);
        });

        button1.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent m) -> {
            rectangles[1].setRotate(rectangles[1].getRotate() - 10);
        });

        button1.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent m) -> {
            rectangles[2].setRotate(rectangles[2].getRotate() - 10);
        });

        button1.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent m) -> {
            rectangles[3].setRotate(rectangles[3].getRotate() - 10);
        });


        //Rotate rechts
        button2.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent m) -> {
            rectangles[0].setRotate(rectangles[0].getRotate() + 10);
        });

        button2.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent m) -> {
            rectangles[1].setRotate(rectangles[1].getRotate() + 10);
        });

        button2.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent m) -> {
            rectangles[2].setRotate(rectangles[2].getRotate() + 10);
        });

        button2.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent m) -> {
            rectangles[3].setRotate(rectangles[3].getRotate() + 10);
        });

        //Groter breedte
        button3.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent m) -> {
            rectangles[0].setWidth(rectangles[0].getWidth() + 10);
        });

        button3.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent m) -> {
            rectangles[1].setWidth(rectangles[1].getWidth() + 10);
        });

        button3.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent m) -> {
            rectangles[2].setWidth(rectangles[2].getWidth() + 10);
        });

        button3.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent m) -> {
            rectangles[3].setWidth(rectangles[3].getWidth() + 10);
        });

        //Groter hoogte
        button3.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent m) -> {
            rectangles[0].setHeight(rectangles[0].getHeight() + 10);
        });

        button3.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent m) -> {
            rectangles[1].setHeight(rectangles[1].getHeight() + 10);
        });

        button3.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent m) -> {
            rectangles[2].setHeight(rectangles[2].getHeight() + 10);
        });

        button3.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent m) -> {
            rectangles[3].setHeight(rectangles[3].getHeight() + 10);
        });

        //Kleiner breedte
        button4.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent m) -> {
            rectangles[0].setWidth(rectangles[0].getWidth() - 10);
        });

        button4.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent m) -> {
            rectangles[1].setWidth(rectangles[1].getWidth() - 10);
        });

        button4.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent m) -> {
            rectangles[2].setWidth(rectangles[2].getWidth()- 10);
        });

        button4.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent m) -> {
            rectangles[3].setWidth(rectangles[3].getWidth() - 10);
        });

        //Kleiner hoogte
        button4.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent m) -> {
            rectangles[0].setHeight(rectangles[0].getHeight() - 10);
        });

        button4.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent m) -> {
            rectangles[1].setHeight(rectangles[1].getHeight() - 10);
        });

        button4.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent m) -> {
            rectangles[2].setHeight(rectangles[2].getHeight() - 10);
        });

        button4.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent m) -> {
            rectangles[3].setHeight(rectangles[3].getHeight() - 10);
        });







        group1.getChildren().addAll(rectangles);
        group1.getChildren().add(button1);
        group1.getChildren().add(button2);
        group1.getChildren().add(button3);
        group1.getChildren().add(button4);

        Scene scene = new Scene(group1, 1000, 700);
        primaryStage.setScene(scene);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
