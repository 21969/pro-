//Importeren van gebruikte classes
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.control.TextField;
import javafx.scene.shape.Ellipse;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.animation.TranslateTransition;
import javafx.util.Duration;
import javafx.animation.Timeline;

public class Template extends Application{  //zorg dat de class overerft van Application
  public void start(Stage stage){   //geef de stage mee als argument
    //creeer de "root node" Group
    Group rootNode = new Group();
    //Maak een nieuwe Scene met daarin de "root node" Group (verzameling nodes)
    Scene scene = new Scene(rootNode, 800, 600);
    //plaats de Scene op de Stage
    stage.setScene(scene);

    //inladen van een Image in een ImageView
    Image image = new Image("http://www.zombieplace.com/zombiecats/your-child-watched-too-many-zombie-movies.jpg", true);
    ImageView iv = new ImageView();
    iv.setImage(image);

    //De ImageView toevoegen aan de rootNode Group
    rootNode.getChildren().add(iv);

    //een extra group is optioneel als je meer groepen wilt hebben
    Group group1 = new Group();
    //plaats de extra groep in de root node


    //maak een button aan en plaats deze in de extra group
    Button button = new Button("ik ben een Button");
    button.relocate(50,50);
    rootNode.getChildren().add(button);
    group1.getChildren().add(iv);
    //textfield
    TextField textfield1 = new TextField("Send nudes");
    group1.getChildren().add(textfield1);
    textfield1.relocate(50,100);
    //ellipse
    Ellipse ellipse1 = new Ellipse(1d, 1d, 1d, 1d);
    group1.getChildren().add(ellipse1);
    ellipse1.setFill(Color.PURPLE);
    //circle
    Circle circle1  = new Circle(2000d, 2000d, 2000d, Color.ORANGE);

    rootNode.getChildren().add(circle1);

    rootNode.getChildren().add(group1);
    //circle animation
    TranslateTransition t = new TranslateTransition(Duration.millis(1000), circle1);
    t.setToY(500d);
    t.setCycleCount(Timeline.INDEFINITE);
    t.setAutoReverse(true);
    t.play();


    //laat de stage en inhoud renderen met de show() method
    stage.show();

    //Opdracht 0
    //Lees in de javafx API reference wat alle geimporteerde classes doen.
    //Stel vragen als je iets niet begrijpt.

    //Opdracht 1
    //Wat gebeurt er als je de ImageView iv aan de group1 Group toevoegt,
    //en je de button toevoegt aan de rootNode Group?
    //Probeer het uit en verklaar wat er gebeurt en waarom dat zo is...
    //Zet je verklaring in een comment hieronder...
    //
    //
    //

    //Opdracht 2
    //Zoek uit in de javafx API reference naar de class TextField
    //Kijk in welke package de class zit en importeer deze
    //Maak in de start method een textField aan en plaats deze in de group1 Group
    //Gebruik de relocate() method om het textveld netjes onder de knop te plaatsen

    //Opdracht 3
    //Kies nog een ongebruikt type node uit en plaats deze in het scherm onder het TextField

    //Opdracht 4
    //Teken een cirkel achter je knop en je textField

    //Opdracht 5
    //Lees de volgende tutorial door en laat de cirkel stuiteren tussen de onder- en bovenkant van je scherm
    //Tutorial: http://docs.oracle.com/javase/8/javafx/scene-graph-tutorial/scenegraph.htm#JFXSG107

    //Extra Opdracht 6
    //Zorg dat de cirkel tijdens het stuiteren van kleur verandert

    //Extra Opdracht 7
    //Voor een 10!
    //Zie de uitleg in de presentatie

  }
}
