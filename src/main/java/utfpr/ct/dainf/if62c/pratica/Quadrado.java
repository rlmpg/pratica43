/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author Anna
 */
public class Quadrado extends Retangulo {

    public double lado;
    
    public Quadrado(double lado) {
        super(lado, lado);
        this.lado = lado;
    }
    
    @Override
    public double getArea(){
        return lado*lado;
    }
    
    @Override
    public double getPerimetro(){
        return lado*4;
    }
    
}
