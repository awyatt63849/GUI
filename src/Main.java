import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Inventory Management GUI");
        VBox root = new VBox();
        root.setId("root");
        Scene scene  = new Scene (root , 800 ,600);
        VBox root2 = new VBox();
        root2.setId("root2");
        scene.getStylesheets().add("stylesheet.css");
        root.getChildren().add(root2);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
