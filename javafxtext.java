package straightline;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class javafxtext extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Creating a Text object
        Text text=new Text();
        //Setting the text to be added.
        text.setText("hello how are you");
        text.setFont(Font.font("verdena", FontWeight.BOLD, FontPosture.REGULAR,45));
        text.setUnderline(true);
        text.setStrikethrough(true);
        text.setFill(Color.BROWN);
        text.setStrokeWidth(2);
        text.setStroke(Color.BLUE);
        //setting the position of the text
        text.setX(50);
        text.setY(50);
        //Creating a Group object
        Group root=new Group(text);
        //Creating a scene object
        Scene scene=new Scene(root,600,300);
        primaryStage.setTitle("Javafx text");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main (String[]args)
    {
        launch(args);
    }
}
