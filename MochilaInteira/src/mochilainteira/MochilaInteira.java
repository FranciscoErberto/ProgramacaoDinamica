/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mochilainteira;

import fileManager.*;

public class MochilaInteira {
    
/* fonte https://ide.geeksforgeeks.org/index.php*/

    public static void main(String args[])
    {
//        ler arquivo de entrada
        String DIRETORIO = "instancias_mochila/";
//        String entrada = FileManager.readFromFile(DIRETORIO+"entrada.txt");
        String entrada = FileManager.readFromFile(DIRETORIO+"mochila01.txt.txt");
//        String entrada = FileManager.readFromFile(DIRETORIO+"mochila02.txt.txt");
        String[] linhas = entrada.split("\n");

       // primeira linha
        String[] temp1 = linhas[0].split(" ");
        int qntObjetos = Integer.parseInt(temp1[0]);
        int pesoMaximo = Integer.parseInt(temp1[1]);


       // objetos
        int valores[] = new int[qntObjetos];
        int wt[] = new int[qntObjetos];
        for (int i = 1; i < linhas.length; i++) {
            String[] temp2 = linhas[i].split(" ");
            wt[i-1] = Integer.parseInt(temp2[0]);
            valores[i-1] = Integer.parseInt(temp2[1]);

         }

        // run mochila!!
        Mochila mochila = new Mochila();
        System.out.println("\n\nTotal carregado: "+ mochila.mochila(wt, valores, pesoMaximo));
    }
}