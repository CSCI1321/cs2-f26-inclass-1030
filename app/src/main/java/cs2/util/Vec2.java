package cs2.util;

public class Vec2 {
  private double x;
  private double y;
  public Vec2(double ix, double iy) { x=ix; y=iy; }
  public Vec2() {x=0; y=0;}

  public String toString() {
    return "(" + x + "," + y + ")";
  }
  public double getX() { return x; }
  public double getY() { return y; }

  public Vec2 add(Vec2 other) {
    return new Vec2(this.x + other.x, this.y + other.y);
  }
  public void addThis(Vec2 other) {
    this.x += other.x;
    this.y += other.y;
  }
  public void scaleDims(double xscale, double yscale) {
    this.x *= xscale;
    this.y *= yscale;
  }
  
}
