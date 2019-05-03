package com.xavcaj;

public class Validador {

    /**
     * Algoritmo de validacion de cedula ecuatoriana.
     * 
     * Fuente:
     * https://juanpinzon-1992.blogspot.com/2013/05/validar-cedula-ecuatoriana.html
     * 
     * @param cedula Cedula a validar
     * @return La validez de la cedula
     */
    public static boolean validarCedula(String cedula) {
        int a[] = new int[cedula.length() / 2];
        int b[] = new int[(cedula.length() / 2)];
        int c = 0;
        int d = 1;

        for (int i = 0; i < cedula.length() / 2; i++) {
            a[i] = Integer.parseInt(String.valueOf(cedula.charAt(c)));
            c = c + 2;
            if (i < (cedula.length() / 2) - 1) {
                b[i] = Integer.parseInt(String.valueOf(cedula.charAt(d)));
                d = d + 2;
            }
        }

        int suma = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * 2;
            if (a[i] > 9) {
                a[i] = a[i] - 9;
            }
            suma = suma + a[i] + b[i];
        }

        int aux = suma / 10;
        int dec = (aux + 1) * 10;

        if ((dec - suma) == Integer.parseInt(String.valueOf(cedula.charAt(cedula.length() - 1))))
            return true;
        else if (suma % 10 == 0 && cedula.charAt(cedula.length() - 1) == '0') {
            return true;
        } else {
            return false;
        }
    }
}