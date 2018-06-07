/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioarraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class Exercicio2 {
    public static void main(String[] args){
        
        ArrayList<String> nomes = new ArrayList<>();
    
      
            
            nomes.add("cab");
            nomes.add("calanguinho pipinha"); 
            nomes.add("mano mendigo");
            nomes.add("poderoso castiga");
            nomes.add("vin diesel");
            nomes.add("vin gasolina");
            nomes.add("saca rolha");
            nomes.add("chupa cabra");
            nomes.add("asa de morcego");
        
 JOptionPane.showMessageDialog(null, nomes.get(0)+ "." + "\n" + nomes.get(1)+ "." + "\n" + nomes.get(2)+ "." +
            "\n" + nomes.get(3)+ "." + "\n" + nomes.get(4)+ "." + "\n" + nomes.get(5)+ "." + "\n" + 
            nomes.get(6) + "." + "\n" + nomes.get(7)+ "." + "\n" + nomes.get(8) + ".");
    
    
    }
    
}
