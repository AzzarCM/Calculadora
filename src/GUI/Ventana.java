package GUI;

import calculadora.AbstractFactory;
import Main.Artimetica.Aritmetica;
import calculadora.FactoryProducer;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import Main.BinaryConversor.Binary;

/**
 *
 * @author LN710Q
 */
public class Ventana extends JPanel {

    public int WIDTH = 300, widthTF = 120, widthB = 80;
    public int HEIGHT = 300, heightTF = 30, heightB = 30;
    public JTextField Entry1, Resultado, Entry2, textConvert;
    public JButton toBinary, Plus, Minus, Divided, By;
    public AbstractFactory factory;

    public Ventana() {

        Entry1 = new JTextField();
        Entry1.setBounds(new Rectangle(20, 40, widthTF, heightTF));
        Entry2 = new JTextField();
        Entry2.setBounds(new Rectangle(150, 40, widthTF, heightTF));
        textConvert = new JTextField();
        textConvert.setBounds(new Rectangle(80, 150, widthTF, heightTF));
        Resultado = new JTextField();
        Resultado.setBounds(new Rectangle(80, 240, widthTF, heightTF));

        toBinary = new JButton("Convertir binary");
        toBinary.setBounds(new Rectangle(100, 190, 87, heightB));
        Plus = new JButton("+");
        Plus.setBounds(new Rectangle(50, 96, 41, heightB));
        Minus = new JButton("-");
        Minus.setBounds(new Rectangle(100, 96, 41, heightB));
        Divided = new JButton("/");
        Divided.setBounds(new Rectangle(150, 96, 41, heightB));
        By = new JButton("*");
        By.setBounds(new Rectangle(200, 96, 41, heightB));

        Entry1.setEditable(true);
        Entry2.setEditable(true);
        textConvert.setEditable(true);
        Resultado.setEditable(false);

        toBinary.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                factory = FactoryProducer.getFactory("convertir");
                Binary conversion = factory.getConv("convertir");
                Resultado.setText(Integer.toString(conversion.toBinary(Integer.parseInt(textConvert.getText()))));
            }
        });
        Plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                factory = FactoryProducer.getFactory("aritmetica");
                Aritmetica suma = factory.getAritmetica("sumar");
                Resultado.setText(Float.toString(suma.operar(Integer.parseInt(Entry1.getText()), Integer.parseInt(Entry2.getText()))));
            }
        });
        Minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                factory = FactoryProducer.getFactory("aritmetica");
                Aritmetica resta = factory.getAritmetica("restar");
                Resultado.setText(Float.toString(resta.operar(Integer.parseInt(Entry1.getText()), Integer.parseInt(Entry2.getText()))));
            }
        });
        By.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                factory = FactoryProducer.getFactory("aritmetica");
                Aritmetica multiplicar = factory.getAritmetica("multiplicar");
                Resultado.setText(Float.toString(multiplicar.operar(Integer.parseInt(Entry1.getText()), Integer.parseInt(Entry2.getText()))));
            }
        });
        Divided.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                factory = FactoryProducer.getFactory("aritmetica");
                Aritmetica dividir = factory.getAritmetica("dividir");
                Resultado.setText(Float.toString(dividir.operar(Integer.parseInt(Entry1.getText()), Integer.parseInt(Entry2.getText()))));
            }
        });

        add(Entry1);
        add(toBinary);
        add(Resultado);
        add(Entry2);
        add(textConvert);
        add(Plus);
        add(Minus);
        add(By);
        add(Divided);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }
}