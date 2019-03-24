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
public class Droit {
    double a;
    double b;
    int ref;
    static int compteur;
    /*
    b.	Deux constructeurs :  1,5
i.	un premier qui prend deux double en paramètres, 
ii.	un second qui prend 2 Point (pour ce dernier constructeur, il devra tester que les deux points sont distincts)

    */

    public Droit(double a, double b) {
        this.a = a;
        this.b = b;
        ref = compteur;
        compteur++;
    }
    public Droit(Point p1, Point  p2) {
       
    a=(p1.y-p2.y)/(p1.x-p2.x);
     b=p1.y-a*p1.x;
        ref = compteur;
        compteur++;
    }
    
    /*
    6.	Ajoutez une méthode estSur à 
    la classe Droite, qui étant donné un Point en
    paramètre, indique s'il se trouve sur la droite ou pas.  
    */
    public boolean estSur(Point P){
        if (P.y==a*P.x+b){
            return true;
        }else  return false;
    }
    
    /*
    7.	On veut énumérer toutes les Droite instanciées, proposez une solution (inutile de l'écrire).  
    */
}
