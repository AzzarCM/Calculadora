/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.BinaryConversor;

import calculadora.AbstractFactory;
import Main.Artimetica.Aritmetica;

/**
 *
 * @author cmundo
 */
public class FactoryConv implements AbstractFactory {

    @Override
    public Binary getConv(String type) {
        switch(type){
            case "convertir":
                return new Convert();
        }
        return null;
    }

    @Override
    public Aritmetica getAritmetica(String type) {
        return null; 
    }
    
}
