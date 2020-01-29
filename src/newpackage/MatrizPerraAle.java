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
public class MatrizPerraAle
{
  
    public static String matrizcompleta[][] =
    {

        {
            "l", "d", "ce", "_", ".", "\"", "#", "'", "Esdo", "Token"
        },
        {
            2 + "", 4 + "", "T104", "T104", "T104", 7 + "", 9 + "", 11 + "", 0 + "", "T104"
        },
        {
            2 + "", 2 + "", "T103", 3 + "", "T103", "T103", "T103", "T103", 1 + "", "T53"
        },
        {
            2 + "", 2 + "", "T103", "T103", "T103", "T103", "T103", "T103", 1 + "", "T53"
        },
        {
            "T100", 4 + "", "T100", "T100", 5 + "", "T100", "T100", "T100", 1 + "", "T50"
        },
        {
            "T102", 6 + "", "T102", "T102", "T102", "T102", "T102", "T102", 0 + "", "T101"
        },
        {
            "T102", 6 + "", "T102", "T102", "T102", "T102", "T102", "T102", 1 + "", "T51"
        },
        {
            7 + "", 7 + "", 7 + "", "T102", "T102", 8 + "", "T102", "T102", 0 + "", "T102"
        },
        {
            "T102", "T102", "T102", "T102", "T102", "T102", "T102", "T102", 1 + "", "T52"
        },
        {
            9 + "", 9 + "", "T104", "T104", "T104", "T104", 10 + "", "T104", 0 + "", "T104"
        },
        {
            "T104", "T104", "T104", "T104", "T104", "T104", "T104", "T104", 1 + "", "T54"
        },
        {
            12 + "", 12 + "", "T105", "T105", "T105", "T105", "T105", "T105", 0 + "", "T32"
        },
        {
            "T105", "T105", "T105", "T105", "T105", "T105", "T105", 13 + "", 0 + "", "T105"
        },
        {
            "105", "T105", "T105", "T105", "T105", "T105", "T105", "T105", 1 + "", "T55"
        }
    };

    public static String matriz_tipos_datos[][] =
    {
        {
            "T1", "int"
        },
        {
            "T1", "double"
        },
        {
            "T1", "string"
        }
        
    };
    public static String matriz_palabras_r[][] =
    {
        {
            "T5", "print"
        },
        {
            "T3", "if"
        },
        {
            "T4", "else"
        },
        {
            "T8", "for"
        },
        {
            "T2", "while"
        },
        {
            "T16", "Llamar"
        },
        {
            "T6", "read"
        },
        {
            "T18", "Caso"
        },
        {
            "T19", "Romper"
        },
        {
            "T7", "class"
        },
        {
            "T21", "Mayus"
        },
        {
            "T22", "Minus"
        },
        {
            "T23", "Metodo"
        }
//        {
//            "T24", "Minus"
//        },
//        {
//            "T25", "Metodo"
//        },
//        {
//            "T26", "Chr"
//        },
//        {
//            "T27", "Nuevo"
//        }

    };
    public static String matriz_operadores_aritmeticos[][] =
    {
        {
            "T22", "+"
        },
        {
            "T17", "-"
        },
        {
            "T17", "*"
        },
        {
            "T17", "/"
        },
//        {
//            "T106", "%"
//        },
        {
            "T104", "**"
        }
    };
    public static String matriz_operadores_relacionales[][] =
    {
        {
            "T3", ">="
        },
        {
            "T3", "<="
        },
        {
            "T15", "="
        },
        {
            "T21", ">"
        },
        {
            "T21", "<"
        },
        {
            "21", "!="
        },
        {
            "T23", "=="
        },
        {
            "T3", "+="
        },
        {
            "T19", "++"
        },
        {
            "T20", "--"
        }

    };
    public static String matriz_caracteres_especiales[][] =
    {
        {
            "T14", ","
        },
        {
            "T13", ";"
        },
        
        {
            "T11", "{"
        },
        {
            "T12", "}"
        },
        {
            "T16", "."
        },
        
        {
            "T24", "?"
        },
        {
            "T", "|"
        }

    };
    public static String matriz_operadores_logicos[][] =
    {

        {
            "T18", "and"
        },
        {
            "T18", "or"
        }
        

    };

    public static String matrizSeparadores[][] =
    {
        {
            " ", " "
        },
        {
            " ", "\t"
        },
        {
            " ", "\n"
        },
        {
            " ", "\r"
        },
        {
            "T9", "("
        },
        {
            "T10", ")"
        },
        {
            "T24", "["
        },
        {
            "T24", "]"
        },
        {
            "T7", ":"
        },        
        {
            "T15", "="
        },
        {
            "T17", "-"
        },
        {
            "T17", "*"
        },
        {
            "T17", "/"
        },
        {
            "T24", "%"
        },
        {
            "T13", ";"
        },
        {
            "T21", ">"
        },
        {
            "T21", "<"
        },
        {
            "T24", "!"
        },
        {
            "T24", "&"
        },
        {
            "T24", "|"
        },
        {
            "T22", "+"
        },
        {
            "T14", ","
        }
    };

    public static String[] crea(JTextArea a)
    {

        String texto = a.getText()+"\n"+"\n"+"\n";
        String cadena = "";

        if (texto.length() != 0)
        {

            int contador = texto.length();
            String tabla[] = null;
            char textoseparado[] = texto.toCharArray();
            String dato = "";
            for (int i = 0; i < contador; i++)
            {
                if (!("\"").equals(textoseparado[i] + "") && !("#").equals(textoseparado[i] + ""))
                {

                    if (separadores(textoseparado[i]))
                    {
//                        if(gdffashfdsghjf){
//                        
//                        //separador doble
//                        //inserta dato
//                        //inserta separador
//                    }

                        if (i != contador - 1)
                        {
                            cadena = "" + textoseparado[i] + textoseparado[i + 1];

                            switch (cadena)
                            {
                                case ("**"):

                                    i = i + 1;
                                    break;
                                case (">="):

                                    i = i + 1;
                                    break;
                                case ("<="):

                                    i = i + 1;
                                    break;
                                case ("!="):

                                    i = i + 1;
                                    break;
                                case ("=="):

                                    i = i + 1;
                                    break;
                                case ("&&"):

                                    i = i + 1;
                                    break;
                                case ("||"):

                                    i = i + 1;
                                    break;
                                case ("+="):

                                    i = i + 1;
                                    break;
                                    case ("++"):

                                    i = i + 1;
                                    break;
                                    case ("--"):

                                    i = i + 1;
                                    break;
                                default:
                                    cadena = textoseparado[i] + "";
                                    break;
                            }
                        }

                        if (!dato.equals(""))
                        {
                            tabla = Arreglos.inserta(tabla, dato);
                        }

                        if ((int) textoseparado[i] != (int) ' ')
                        {
                            tabla = Arreglos.inserta(tabla, cadena + "");
                        }
                        dato = "";

                    } else
                    {

                        dato += textoseparado[i];

                    }

                } else if (("\"").equals(textoseparado[i] + ""))
                {
                    try
                    {
                        dato += textoseparado[i];
                        do
                        {
                            i++;
                            dato += textoseparado[i];
                        } while (!("\"").equals(textoseparado[i] + "") && !("\n").equals(textoseparado[i] + ""));
                        tabla = Arreglos.inserta(tabla, dato);
                        dato = "";
                    } catch (Exception e)
                    {
                        tabla = Arreglos.inserta(tabla, dato);;
                        return tabla;
                    }
                } else if (("#").equals(textoseparado[i] + ""))
                {
                    try
                    {
                        dato += textoseparado[i];
                        do
                        {
                            i++;
                            dato += textoseparado[i];
                        } while (!("#").equals(textoseparado[i] + "") && !("\n").equals(textoseparado[i] + ""));
                        tabla = Arreglos.inserta(tabla, dato);
                        dato = "";
                    } catch (Exception e)
                    {
                        tabla = Arreglos.inserta(tabla, dato);
                        return tabla;
                    }

                }
            }

            return tabla;

        } else
        {

            return null;
        }

    }

    public static boolean separadores(char c)
    {
        boolean bandera = false;
        for (int i = 0; i < matrizSeparadores.length; i++)
        {

            if (matrizSeparadores[i][1].equals(c + ""))
            {
                bandera = true;
                break;
            }

        }

        return bandera;
    }

    public static String[][] token(String m[][])
    {

        for (int i = 0; i < m.length; i++)
        {
            if (m[i][1] == null)
            {
                m[i][1] = comprueba(matrizSeparadores, m[i][0]);
            }
            if (m[i][1] == null)
            {
                m[i][1] = comprueba(matriz_caracteres_especiales, m[i][0]);
            }
            if (m[i][1] == null)
            {
                m[i][1] = comprueba(matriz_operadores_aritmeticos, m[i][0]);
            }
            if (m[i][1] == null)
            {
                m[i][1] = comprueba(matriz_operadores_logicos, m[i][0]);
            }
            if (m[i][1] == null)
            {
                m[i][1] = comprueba(matriz_operadores_relacionales, m[i][0]);
            }
            if (m[i][1] == null)
            {
                m[i][1] = comprueba(matriz_tipos_datos, m[i][0]);
            }
            if (m[i][1] == null)
            {

                m[i][1] = comprueba(matriz_palabras_r, m[i][0]);
            }
            if (m[i][1] == null)
            {
                m[i][1] = Automata.automata(matrizcompleta, m[i][0]);
            }

        }

        return m;
    }

    public static String comprueba(String ma[][], String cadena)
    {
        for (int i = 0; i < ma.length; i++)
        {
            if (cadena.equals(ma[i][1]))
            {
                return ma[i][0];
            }
        }
        return null;
    }

    public static boolean separadoresdobles(char c[], int a
    )
    {
        return false;
    }

    public static String[][] a(String t[][])
    {

        if (t != null)
        {

            for (int i = 0; i < t.length; i++)
            {

                if (t[i][1].equals("T28"))
                {

                    if (t[i][0].length() >= 15)
                    {

                        t[i][1] = "E1";

                    }
                    {

                    }

                }
                if (t[i][1].equals("T29"))
                {

                    if (t[i][0].length() >= 15)
                    {

                        t[i][1] = "E2";

                    }

                }

                if (t[i][1].equals("T30"))
                {

                    if (t[i][0].length() >= 30)
                    {

                        t[i][1] = "E2";

                    }

                }

                if (t[i][1].equals("T31"))
                {

                    if (t[i][0].length() >= 500)
                    {

                        t[i][1] = "E5";

                    }
                }

            }

        }

        return t;
    }
}
