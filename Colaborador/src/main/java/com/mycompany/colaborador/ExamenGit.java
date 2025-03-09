/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectosjava2025;

/**
 *
 * @author USUARIO
 */
public class ExamenGit {
    static int [] numeros = new int[10];
    static int contador = 0;
    public static void main(String[] args) {
        System.out.println("Jino Olivera Rudas 3");
        //Metodo que crea los datos del array
        agregardatos();
        //Metodo que muestra los datos creado
        mostrardatos();
        //Metodo que ordena los arrays
        ordenardatos();
        //Metodo que muestra los datos ordenados
        mostrardatos();
    }
    
    public static void agregardatos(){
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)( Math.random()*20)+1 ;
            
        }
    }
    
    public static void mostrardatos() {
        for (int numero : numeros) {
            System.out.print(numero+ " ");
        }
        System.out.println("");
    }
    
    public static void ordenardatos(){
        for (int i = 0; i < numeros.length-1; i++) {
            for (int j = 0; j < numeros.length-1-i; j++) {
               if( numeros[j]<numeros[j+1]){
                int team = numeros[j];
                numeros[j] = numeros[j+1];
                numeros[j+1] = team;
            }
                
            }
            
        }
    }
}
