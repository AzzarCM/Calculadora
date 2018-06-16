/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Artimetica;

/**
 *
 * @author LN710Q
 */
public class Dividir implements Aritmetica{
    @Override
    public  float operar(float a, float b){
        if(b == 0){
            System.out.println("No se puede operar");
            return 0;
        }
        else if(a == b){
            System.out.println("Nel, no se puede");
            return 0;
        }
        return a / b;
    }
}