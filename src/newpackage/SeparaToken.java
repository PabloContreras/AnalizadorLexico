/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author leo
 */
public class SeparaToken
{

    
    public static String[] cadena(String[][] tabla)
    {
      
        String vec[]=null;
        for (int i = 0; i < tabla.length; i++)
        {
            if (tabla[i][1].trim().length() != 0)
            {
                
                vec=Arreglos.inserta(vec, tabla[i][1]);
            }
        }
        imprime(vec);

        return vec;
    }

    public static void imprime(String vec[])
    {

        if (vec != null)
        {
            for (int i = 0; i < vec.length; i++)
            {
                System.out.println(i + ":" + vec[i]);
            }

        }

    }
}
