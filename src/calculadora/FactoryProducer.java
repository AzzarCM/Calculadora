/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import Main.Artimetica.FactoryAritmetica;
import Main.BinaryConversor.FactoryConv;

/**
 *
 * @author LN710Q
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        switch(type){
            case "aritmetica":
                return new FactoryAritmetica();
            case "convertir":
                return new FactoryConv();
                
        }
        return null;
    }
}
