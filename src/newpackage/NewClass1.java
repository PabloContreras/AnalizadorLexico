/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import javax.swing.JTextArea;

/**
 *
 * @author leo
 */
public class NewClass1
{

    static String matriz[][] =
    {
        {
            "a", "b", "c", "Acep"
        }, 
        {
            null, null, 2 + "", 0 + ""
        }, 
        {
            2 + "", 2 + "", 3 + "", 0 + ""
        }, 
        {
            3 + "", null, null, 1 + ""
        }
    };
    static String cade = "cababababbababababbacc";
    static String resultado = "";
    static String ruta = "C:/Users/leojf/Desktop/Leo.txt";

    public static void main(String[] args)
    {

        //  NewClass.automata(matriz, cade);
        resultado = LeerArchivos.leer(ruta);
        JTextArea a = new JTextArea();
        a.setText(" " + "\n");
        MatrizPerraAle.crea(a);

        System.out.println(resultado);
    }

}
