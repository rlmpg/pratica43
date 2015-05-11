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
public class Elipse implements FiguraComEixos{
    private double EixoMaior; 
    private double EixoMenor;

    public Elipse(double EixoMaior, double EixoMenor) {
    this.EixoMaior = EixoMaior;
    this.EixoMenor = EixoMenor;
        
    }
    
    @Override
    public double getEixoMenor() {
            if (EixoMaior > EixoMenor)
            return EixoMenor;
        
        else 
            return EixoMaior;  
    }

    @Override
    public double getEixoMaior() {
        if (EixoMaior > EixoMenor)
            return EixoMaior;
        
        else 
            return EixoMenor;   
    }

    @Override
    public String getNome() {
        return getNome() + " [" + EixoMaior + "]";
    }

    @Override
    public double getPerimetro() {
        return Math.PI * (3 * (EixoMaior + EixoMenor) - Math.sqrt((3*EixoMaior+EixoMenor)*(EixoMaior+3*EixoMenor)));
    }

    @Override
    public double getArea() {
        return Math.PI * EixoMaior * EixoMenor;
    }
    
}
