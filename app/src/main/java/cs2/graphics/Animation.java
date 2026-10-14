package cs2.graphics;

import cs2.util.Vec2;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Animation extends Application {
    public void start(Stage stg) {
      Canvas canvas = new Canvas(600,600);
      Scene scene = new Scene(new StackPane(canvas));
      stg.setScene(scene);
      stg.setTitle("Bounce Ball!");
      stg.show();

      GraphicsContext g = canvas.getGraphicsContext2D();

      AnimationTimer timer = new AnimationTimer() {
        Vec2 pos = new Vec2(100,200);
        Vec2 vel = new Vec2(Math.random()*4 - 2, Math.random()*4 - 2);
        // double x = 100;
        // double dx = Math.random()*4 - 2;
        // double y = 200;
        // double dy = Math.random()*4 - 2;
        public void handle(long t) {
          g.setFill(Color.WHITE);
          g.fillRect(0,0,600,600);
          g.setFill(Color.ORANGERED);
          g.fillOval(pos.getX(),pos.getY(), 100,100);
          pos.addThis(vel);
          if(pos.getX()+100 > 600 || pos.getX() < 0) {
            vel.scaleDims(-1, 1);
          }
          if(pos.getY()+100 > 600 || pos.getY() < 0) {
            vel.scaleDims(1, -1);
          }
        }
      };
      timer.start();

    }
}
