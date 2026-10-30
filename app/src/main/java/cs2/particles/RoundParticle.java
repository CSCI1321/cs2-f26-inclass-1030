package cs2.particles;

import cs2.util.Vec2;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class RoundParticle extends Particle {
  public RoundParticle(Vec2 p, Vec2 v) {
    super(p,v);
    cp = new SolidColor(Color.RED);
  }
  @Override 
  public void display(GraphicsContext g) {
    g.setFill(cp.getColor());
    g.fillOval(pos.x, pos.y, 20,20);
  }
}
