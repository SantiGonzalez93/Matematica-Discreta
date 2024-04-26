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


    public static  String[] calcularSucecion (int a1, double dif,  int cantSucecion ){

        String[] results = new String[cantSucecion];
        calcularSucecionRecursiva(a1,dif,cantSucecion, results);
        return results;
        }

    public static  void calcularSucecionRecursiva (int a1, double dif,  int cantSucecion, String[] results) {
            if (cantSucecion > 0){

                int resul = (int) (a1 + dif);
                results[cantSucecion -1] = Integer.toString(resul);
                cantSucecion = cantSucecion -1;
                calcularSucecionRecursiva(a1,dif,cantSucecion, results);

            }
    }
}