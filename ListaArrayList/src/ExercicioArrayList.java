
package exercicioarraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno Carlos Augusto Borges
 */
public class ExercicioArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();
        
        numeros.add(0);
        numeros.add(1); 
        numeros.add(2); 
        numeros.add(3); 
        numeros.add(4); 
        numeros.add(5); 
        numeros.add(6); 
        numeros.add(7); 
        numeros.add(8); 
        numeros.add(9); 
        numeros.add(10); 
        numeros.add(11); 
        numeros.add(12); 
        numeros.add(13); 
        numeros.add(14);
 
      JOptionPane.showMessageDialog(null, " " +  numeros.get(0)+ " " + numeros.get(1) + " " + numeros.get(2)+ " " +
       numeros.get(3) + " " + numeros.get(4) + " " +  numeros.get(5) + " " +  numeros.get(6) + " " +  numeros.get(7)+ " " +
               numeros.get(8) + " " +  numeros.get(9) + " " +  numeros.get(10) + " " +  numeros.get(11) + " " + 
               numeros.get(12)+ " " + numeros.get(13) + " " + numeros.get(14));
    }
}
