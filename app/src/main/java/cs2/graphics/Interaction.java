package cs2.graphics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Interaction extends Application {
  public void start(Stage stg) {
    Canvas canvas = new Canvas(600,600);
    Scene scene = new Scene(new StackPane(canvas));
    stg.setScene(scene);
    stg.setTitle("Lines!");
    stg.show();

    GraphicsContext g = canvas.getGraphicsContext2D();

    g.strokeLine(300,300, 100,145);

    canvas.setOnMouseDragged((MouseEvent e) -> {
      g.strokeLine(300,300, e.getX(),e.getY());
    });
    canvas.setOnMouseClicked((MouseEvent e) -> {
      g.setFill(Color.AQUAMARINE);
      g.fillOval(e.getX(),e.getY(), 100,100);
    });
    canvas.setOnMouseDragged((MouseEvent e) -> {
      g.fillText("Here", e.getX(),e.getY());
    });
    canvas.setOnKeyPressed((KeyEvent e) -> {
      if(e.getCode() == KeyCode.LEFT) {
        g.setFill(Color.WHITE);
        g.fillRect(0,0, 600,600);
      }
    });
    canvas.requestFocus();


  }
}
