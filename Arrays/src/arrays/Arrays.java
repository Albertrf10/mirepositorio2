/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   //Construccion de Arrays
   //Como arreglo,vector o tabla
   Scanner sn_teclado= new Scanner(System.in);
   int num =3;// [3]
    //Se revervan 10 numeros 
   int [] numeros = new int [10]; // [6][1][7][11][]
   int[] otrosNumeros = {3, 4, 5}; // [3][4][5]
   numeros[0]=6;
   numeros[1]++;
   numeros[2] = numeros[0]+numeros[1];
   numeros[3]= num + otrosNumeros[1];
  
   System.out.println("Dame un numero para el array");
   numeros[4] = sn_teclado.nextInt();
   
   for( int i =0; i<10;i++){
        System.out.println(numeros[i]);
   }
    }
    
}
