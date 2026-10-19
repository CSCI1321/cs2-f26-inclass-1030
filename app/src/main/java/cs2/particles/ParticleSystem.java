package cs2.particles;

import java.util.ArrayList;

import cs2.util.Vec2;
import javafx.scene.canvas.GraphicsContext;

public class ParticleSystem {
  private ArrayList<Particle> parts;
  private Vec2 origin;

  public ParticleSystem(Vec2 o) {
    parts = new ArrayList<Particle>();
    origin = o;
  }

  public void addParticle() {
    Particle p = new Particle(origin.clone(), Vec2.random());
    parts.add(p);
  }

  public void display(GraphicsContext g) {
    for(int i=0; i<parts.size(); i++) {
      parts.get(i).display(g);
    }
  }
  public void update() {
    System.out.println(parts.size());
    for(Particle p : parts) {
      p.update();
    }
  }
  public void applyForce(Vec2 force) {
    for(Particle p : parts) { p.applyForce(force); }
  }

}
