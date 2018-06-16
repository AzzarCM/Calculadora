/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import Main.Artimetica.Aritmetica;
import Main.BinaryConversor.Binary;

/**
 *
 * @author LN710Q
 */
public interface AbstractFactory {
    Binary getConv(String type);
    Aritmetica getAritmetica(String type);
}
