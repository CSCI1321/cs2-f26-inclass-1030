package cs2.particles;

import cs2.util.Vec2;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class ImageParticle extends Particle {
  protected Image img;

  public ImageParticle(Vec2 p, Vec2 v, Image i) {
    super(p,v);
    img = i;
  }

  @Override 
  public void display(GraphicsContext g) {
    g.setGlobalAlpha(0.25);
    g.drawImage(img, pos.x, pos.y);
    g.setGlobalAlpha(1.0); 
  }
}
