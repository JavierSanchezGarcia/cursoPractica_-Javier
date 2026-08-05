package org.example;

import ClasesNuevas.validacionDeNumeros;


public class holaMundo {

    public static void main (String[] args) {
        System.out.println("Hola Mundo mi nombre es Javier sanchez garcia");
        System.out.println(operacionesMatematicas.operacionSuma(3,5));
        System.out.println(operacionesMatematicas.operacionResta(3,5));
        System.out.println(operacionesMatematicas.operacionMultiplicacion(3,5));
        System.out.println(operacionesMatematicas.operacionDivicion(30,5));
        System.out.println("el numero que ingresaste es"+ validacionDeNumeros.elNumeroEsPositivoONegativo(0));
        System.out.println("el numero que ingresaste es"+ validacionDeNumeros.elNumeroEsPositivoONegativo(-20));
        System.out.println("el numero que ingresaste es"+ validacionDeNumeros.elNumeroEsPositivoONegativo(50));

        //Este es un comentario
        /* este es un bloqueo de comentarios

         */

    }

    }

