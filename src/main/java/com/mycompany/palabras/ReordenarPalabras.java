/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.palabras;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Leonidas Ruiz Perez
 */
public class ReordenarPalabras {
    public static String reorderSentence(String[] words){
        Arrays.sort(words, Comparator.comparingInt(word -> Integer.parseInt(word.replaceAll("\\D+", ""))));
        
        // Eliminar los números al final de las palabras y unirlas en una oración
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(word.replaceAll("\\d", "")).append(" ");
        }
        
        // Retornar la oración reordenada, eliminando el espacio extra al final
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String[] words = {"esta2", "bien4", "muy3", "esto1"};
        String result = reorderSentence(words);
        System.out.println(result);  // Salida: "esto esta muy bien"
    }
}
