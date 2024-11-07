/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labsesion11;

/**
 *
 * @author HEDY
 */
public class Logica {
     private double valor1;
    private double valor2;
    private int operacion;
    
    private static final int SUMA = 0;
    private static final int RESTA = 1;
    private static final int MULTIPLICACION = 2;
    private static final int DIVISION = 3; 
    
    private String txtValor1;
    private String txtValor2;
    
    public Logica (String txtValor1, String txtValor2, int operacion)
    {
        this.txtValor1 = txtValor1;
        this.txtValor2 = txtValor2;
        this.operacion = operacion;
    }
    
    private void convertir()
    {
        this.valor1 = getNumero(txtValor1);
        this.valor2 = getNumero(txtValor2);
    }
    
    public double getResultado()
    {
        switch(operacion)
       {  
           case SUMA: return this.sumar();
           case RESTA: return this.restar();
           case MULTIPLICACION: return this.multiplicar();
           case DIVISION: return this.dividir();
       }
        return 0;
    }
    
    public double sumar()
    {
        convertir();
        return valor1 + valor2;
    }
    
    public double restar()
    {
        convertir();
        return valor1 - valor2;
    }
    
    public double multiplicar()
    {
        convertir();
        return valor1 * valor2;
    }
     
    public double dividir()
    {
        convertir();
        return valor1 / valor2;
    }
    
    private double getNumero(String s)
    {
        try
        {
            return Double.parseDouble(s);
        }catch(Exception e)
        {
            return 0;
        }
    }
    
}