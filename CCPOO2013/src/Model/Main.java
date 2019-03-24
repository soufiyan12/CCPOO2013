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
public class Main {
    public static void main(String Args[]){
        
        /*
        8.	Ecrivez le bout de code permettant (dans un main par exemple) d'instancier une droite avec les points A(0,0) et B(1,1),
        et un triangle ayant pour sommets A,B et C(0,3).  
        */
        Point A=new Point(0,0);
        Point B=new Point (1,1);
        Point C=new Point(0,3);
        Droit D=new Droit(A,B);
        Triangle T=new Triangle(A,B,C);
    }
}
