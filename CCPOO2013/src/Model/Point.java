/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author soufiyan
 */
public class Point {
    double x,y;
    Point(double x, double y) {
      this.x=x;     
      this.y=y;
    }
double calculerDistance(Point p) {
      double dx=x - p.x;      
      double dy=y - p.y;
      return Math.sqrt(dx*dx+dy*dy);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public boolean egaux(Point p,Point P){
        if((p.calculerDistance(P))!=0){
            return false;
        }else{
            return true;
        }
     
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
    
}
