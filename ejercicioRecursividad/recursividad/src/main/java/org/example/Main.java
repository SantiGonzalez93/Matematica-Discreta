package org.example;

import javax.swing.*;

public class Main {


    public static void main(String[] args) {

        int primerNumero = Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte un elemento de la sucesion"));
        int posicionPrimNumero = Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte la posicion del elemento 1 "));
        int segundoNumero = Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte otro elemento de la sucesion"));
        int posicionSegNumero = Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte la posicion del elemento 2 "));
        int cantidadSucecion = Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte la cantidad de elementos de la sucesion"));

        double dif = (segundoNumero - primerNumero)/(posicionSegNumero-posicionPrimNumero-2);
        int a1 = (int) (primerNumero - (dif * posicionPrimNumero) - dif);
        System.out.println("a1 = " + a1);
        System.out.println("dif = " + dif);
        String [] sucecion = new String[cantidadSucecion];

        sucecion = calcularSucecion(a1, dif, cantidadSucecion);

        System.out.println("Sucesión:");
        for (String numero : sucecion) {
            System.out.println(numero);
            }



    }


    public static String[] calcularSucecion(int a1, double dif, int cantSucecion) {
        String[] results = new String[cantSucecion];
        calcularSucecionRecursiva(a1, dif, 0, results); // Comenzar desde el primer término
        return results;
    }

    public static void calcularSucecionRecursiva(int a1, double dif, int index, String[] results) {
        if (index < results.length) {
            // Calcular el término de la sucesión en la posición 'index'
            int resul = (int) (a1 + dif * index);
            results[index] = Integer.toString(resul);
            // Llamar recursivamente para calcular el siguiente término
            calcularSucecionRecursiva(a1, dif, index + 1, results);
        }
    }

}