package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
  * @Instituto Rumiñahui
 * @author SSolis
 */
public class EjerciciosDeber {
    public static void ejercicio1(){
        JOptionPane.showMessageDialog(null,"este es hgjgj");
    }

    public static void menu(){
       int op;
        do {   
            
            op=Integer.parseInt(JOptionPane.showInputDialog(""
                    + "1.- Ejercicio1\n"
                    + "2.- ingrese opcion\n"
                    + "3.- ingrese opcion\n"
                    + "4.- Saliringrese opcion"));
            switch(op){
                case 1:
                    ejercicio1();
                    break;
            }
        } while (op!=6);
    }
}
