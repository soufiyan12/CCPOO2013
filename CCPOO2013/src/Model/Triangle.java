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
public class Triangle {
    Point p1,p2,p3;
    Triangle (Point p1, Point p2, Point p3) {
      this.p1=p1; 
      this.p2=p2; 
      this.p3=p3; 
    }
    double perimetre() {
      return (p1.calculerDistance(p2)+p2.calculerDistance(p3)+ p3.calculerDistance(p1));
    }
    
    /*
    1.	Ajoutez un deuxième constructeur à la classe Triangle avec 2 paramètres : un Point et un double, le triangle créé aura les trois sommets suivants : 
o	p1 le Point donné en paramètre, 
o	p2 le Point à une distance de n unités de p1 parallèlement à l'axe des ordonnées (où n  est le double passé en paramètre), 
o	p3 le Point à une distance de n unités de p1 parallèlement à l'axe des abscisses (où n est le double passé en paramètre)

    */

   Triangle (Point p1, double n) {
      this.p1=p1; 
      p2 =new Point(p1.x,p1.y-n); 
      p3=new Point(p1.x-n,p1.y); 
    }
public double calculerSurface(){
    
    double n=p1.y-p2.y;
    double f=Math.sqrt(2)*n;
    double k=n*(2+Math.sqrt(2))/2;
    return (Math.sqrt(k*(k-n)*(k-n)*(k-f)));
}

}
