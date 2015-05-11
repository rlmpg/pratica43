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
public class Retangulo implements FiguraComLados{

    public double base;
    public double altura;
    public Retangulo (double base, double altura){
           this.base = base;
           this.altura = altura;
    
    }
    
    @Override
    public double getLadoMenor() {
        if (base > altura)
            return altura;
        else
            return base;
    }

    @Override
    public double getLadoMaior() {
          if (base > altura)
            return base;
        else
            return altura;
    }

    @Override
    public String getNome() {
        return getNome() + " [" + base + "]";
    }

    @Override
    public double getPerimetro() {
        return (base*2) + (altura*2);
    }

    @Override
    public double getArea() {
        return base * altura;
    }
    
}
