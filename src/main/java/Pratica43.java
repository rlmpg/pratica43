
import utfpr.ct.dainf.if62c.pratica.Quadrado;
import utfpr.ct.dainf.if62c.pratica.Retangulo;
import utfpr.ct.dainf.if62c.pratica.TrianguloEquilatero;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chin
 */
public class Pratica43 {
        
    public static void main(String[] args) {
        Quadrado nomedoquadrado = new Quadrado (5);
        Retangulo nomedoretangulo = new Retangulo (10, 5);
        TrianguloEquilatero nomedotrianguloequilatero = new TrianguloEquilatero (5);
       
        System.out.println(nomedoquadrado.getArea());
        System.out.println(nomedoquadrado.getPerimetro());
        
        System.out.println(nomedoretangulo.getArea());
        System.out.println(nomedoretangulo.getPerimetro());
        
        System.out.println(nomedotrianguloequilatero.getArea());
        System.out.println(nomedotrianguloequilatero.getPerimetro());
    }
}
