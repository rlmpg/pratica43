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
public class TrianguloEquilatero extends Retangulo{

    public double lado;
    public double altura;

    public TrianguloEquilatero(double lado) {
        super(lado, lado * Math.sqrt(3)/2);
        this.lado = lado;
        
        this.altura = lado * Math.sqrt(3)/2;
    }
    
    @Override
    public double getArea(){
        return (lado * altura)/2;
    }
    
    @Override
    public double getPerimetro(){
        return lado*3;
    }
    
    
}
