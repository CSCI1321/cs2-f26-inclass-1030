package cs2.particles;

import cs2.util.Vec2;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Particle {
  protected Vec2 pos;
  protected Vec2 vel;
  //protected Vec2 acc;
  //protected Color col = Color.ORANGERED;
  protected ColorPattern cp;
  public Particle(Vec2 p, Vec2 v) {
    pos = p; vel = v;
  }
  public abstract void display(GraphicsContext g);
  
  public void update() {
    //vel.addThis(acc);
    pos.addThis(vel);
  }
  public void applyForce(Vec2 force) {
    vel.addThis(force);
  }
}
