
package problemas;

import java.awt.BorderLayout;


public class EcuacionSegundoGrado {
    
    private double a;
    private double b;
    private double c;
    private double x1;
    private double x2;
    
    
    
    public EcuacionSegundoGrado(){  //constructor
    
    }
    
    public EcuacionSegundoGrado(double a, double b, double c, double x1, double x2){
    
        this.a = a;
        this.b = b;
        this.c = c;
        this.x1 = x1;
        this.x2 = x2;
    
    }
    
    //metodos set y get

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }
    
    public double CalcularDiscriminante(){
    
    double dis = Math.pow(b,2) -(4*a*c);
    
        return dis;
        
        
    }
    
    public void calculaRaicesX1(){
        
    x1 = - b + Math.sqrt(CalcularDiscriminante());
    double val = 2*a;
    double aux_x1 = x1 / val;
        System.out.println(aux_x1);
        
    }
    
    public void calculaRaicesX2(){
    
        x2 = - b - Math.sqrt(CalcularDiscriminante());
    double val = 2*a;
    double aux_x2 = x2 / val;
        System.out.println(aux_x2);
        
    }
    
    public void motrarRaices(){
    
        System.out.println("Mostrando datos: ");
        System.out.println("valor de a: "+this.a);
        System.out.println("valor de b: "+this.b);
        System.out.println("valor de c: "+this.c);
        
        System.out.print("Valor de la primera raiz x1: ");
        calculaRaicesX1();
        
        System.out.print("Valor de la segunda raiz x2: ");
        calculaRaicesX2();
        
    }
    
    
}
