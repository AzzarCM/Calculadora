
package Main.BinaryConversor;

/**
 *
 * @author cmundo
 */
public class Convert implements Binary{

    @Override
    public int toBinary(int num) {
        String binaryAux = "";
       while(num/2 != 0){
           binaryAux = Integer.toString(num%2) + binaryAux;
           num = num /2;
       }
       binaryAux = Integer.toString(num) + binaryAux;
        return Integer.parseInt(binaryAux);
    }   
}
