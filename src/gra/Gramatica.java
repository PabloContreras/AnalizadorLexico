package gra;

import estructura.*;
import newpackage.Arreglos;

/**
 *
 * @author leo
 */
public class Gramatica
{

    public static String[][] gra(String[][] matriz, String[][] gramatica, String[] programa)
    {
        Cola c = new Cola(programa.length + 1);
        Pila p = new Pila(500);
        String[] resultado = null;
        String[] resultado1 = null;

        String s = junta(programa);
        String pi = "1";
        int nM = 1;
        int nG = 1;

        p.inserta(1);
        for (int i = 0; i < programa.length; i++)
        {

            c.inserta(programa[i]);

        }

        resultado = Arreglos.inserta(resultado, cola(c));
        resultado1 = Arreglos.inserta(resultado1, nM + "");

        String token = (String) (c.getenfre() + "");

        do
        {

            if (!comp(token))
            {
                pi = (String) (p.eliminar() + "");
                try
                {

                    nM = Integer.parseInt(pi);
                    nG = analiza(matriz, token, nM);
                    if (nG != -1)
                    {
                        p = insertaPila(p, gramatica[nG]);
                        resultado = Arreglos.inserta(resultado, cola(c));
                        resultado1 = Arreglos.inserta(resultado1, pila(p));
                    } else
                    {
                        resultado = Arreglos.inserta(resultado, cola(c));
                        resultado1 = Arreglos.inserta(resultado1, pila(p));
                        if (nG != -1)
                        {
                            resultado = Arreglos.inserta(resultado, "Error");
                            resultado1 = Arreglos.inserta(resultado1, "Error Se esperaba "+nG);
                            break;
                        }

                    }

                } catch (Exception e)
                {
                    if (pi.equals(token))
                    {
                       
                        c.eliminar();

                        if (c.getenfre() != null)
                        {
                            token = (String) (c.getenfre() + "");
                        }

                        resultado = Arreglos.inserta(resultado, cola(c));
                        resultado1 = Arreglos.inserta(resultado1, pila(p));
                    } else
                    {
                        if (pi.equals("null"))
                        {
                            p.eliminar();
                            token = (String) (c.getenfre() + "");

                        } else
                        {

                            if (p.getTope() != 0)
                            {
                                p.eliminar();
                                resultado = Arreglos.inserta(resultado, "Error No se esperaba "+token);
                                resultado1 = Arreglos.inserta(resultado1, "Lo que se esperaba es un "+pi);
                                break;
                            }
                        }

                    }

                }
                System.out.println("");
            } else
            {
                // p.inserta(pi);
                c.eliminar();
                token = (String) (c.getenfre()+"");
                resultado = Arreglos.inserta(resultado, cola(c));
                resultado1 = Arreglos.inserta(resultado1, pila(p));

            }
            if(c.getA()==-1){
                pi = (String) (p.eliminar() + "");
            break;
            
            }

        } while (p.getTope() != -1);
        if (p.getTope() == -1 && c.getA() == -1)
        {
            resultado = Arreglos.inserta(resultado, "Correcto");
            resultado1 = Arreglos.inserta(resultado1, "Correcto");
        } else
        {

            String a = pi;
            if(c.getA()==-1){
            if (a.equals("1"+"") || a.equals("2"+"") || a.equals("3"+""))
            {
                resultado = Arreglos.inserta(resultado, "Correcto");
                resultado1 = Arreglos.inserta(resultado1, "Correcto");

            } else
            {
                               resultado = Arreglos.inserta(resultado, "Error");
                                resultado1 = Arreglos.inserta(resultado1, "Error");
                  

            }
            }else{
            
                      resultado = Arreglos.inserta(resultado, "Error");
                                resultado1 = Arreglos.inserta(resultado1, "Error");
                                
            
            }
        }

        String matR[][] = arregla(resultado1, resultado);
        return matR;

    }

    public static String junta(String[] a)
    {
        String cadena = "";

        for (int i = 0; i < a.length; i++)
        {
            cadena += a[i];

        }

        return cadena;

    }

    public static int analiza(String ve[][], String c, int nM)
    {

        for (int i = 0; i < ve[0].length; i++)
        {

            if (c.equals(ve[0][i]))
            {
                try
                {
                    int nG = Integer.parseInt(ve[nM][i]);
                    System.out.println("ng");
                    return nG;
                } catch (Exception e)
                {
                    System.out.println("NO");
                    return -1;
                }
            }

        }
        return -1;
    }

    public static Pila insertaPila(Pila p, String[] m)
    {
        m = voltea(m);
        if (m != null)
        {
            for (int i = 0; i < m.length; i++)
            {
                p.inserta(m[i]);

            }
        }

        return p;
    }

    public static String[] voltea(String m[])
    {
        String m1[] = null;
        if (!m[0].equals("null"))
        {
            if (m != null)
            {
                m1 = new String[m.length];
                int j = 0;
                for (int i = m.length - 1; i >= 0; i--)
                {
                    m1[j] = m[i];

                    j++;

                }

            }
        }

        return m1;
    }

    public static boolean comp(String token)
    {

        if (token.equals("T32"))
        {

            return true;

        } else
        {

            return false;
        }
    }

    public static String pila(Pila p)
    {
        if (p != null)
        {
            String pil = "";
            Object[] arp = p.getP();
            for (int i = 0; i < p.getTope() + 1; i++)
            {

                pil += arp[i] + " ";

            }

            return pil;

        }

        return null;

    }

    public static String cola(Cola c)
    {
        if (c != null)
        {
            String col = "";
            Object[] arC = c.getC();
            for (int i = 0; i < c.getA() + 1; i++)
            {
                col += arC[i] + " ";
            }

            return col;

        }

        return null;

    }

    public static String[][] arregla(String[] r1, String[] r2)
    {

        if (r1 != null && r2 != null)
        {
            String[][] m = new String[r1.length][2];

            for (int i = 0; i < m.length; i++)
            {
                m[i][0] = r1[i];
                m[i][1] = r2[i];
            }
            return m;

        }

        return null;
    }

}
