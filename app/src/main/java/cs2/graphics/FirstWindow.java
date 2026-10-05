package cs2.graphics;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class FirstWindow extends Application {
  public void start(Stage stg) {
    Canvas canvas = new Canvas(600,800);
    Scene scene = new Scene(new StackPane(canvas));
    stg.setScene(scene);
    stg.show();

    GraphicsContext g = canvas.getGraphicsContext2D();

    g.setLineWidth(10);
    g.setStroke(Color.DARKSLATEGREY);

    g.strokeRect(100,300, 100,300);
    g.strokeOval(100,300, 100,300);
    g.strokeLine(50,100, 300,400);
    g.fillText("Hellojgypq", 100,300);
  }
}
