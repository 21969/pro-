import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.TextField;

public class les9 extends Application{

        public void start (Stage stage){

            Group rootNode = new Group();

            Scene scene = new Scene (rootNode, 800, 600);

            stage.setScene(scene);


            Group group1 = new Group();

            TextField textfield1 = new TextField("Hello World");
            group1.getChildren().add(textfield1);
            textfield1.relocate(50,100);

            rootNode.getChildren().add(group1);

            stage.show();

        }
    }



