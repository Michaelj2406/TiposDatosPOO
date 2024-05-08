/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        //TIPO DE DATO
        //1.- ENTEROS
        //DECLARO VALORES
 //        int numeroUno=10; //Publica 
 //        int numeroDos=8;
         //2.-DECLARO EN 0
         //SOBREESCRIBIR VALORES
         int numeroUno=8; //Publica 
         int numeroDos=19;
         //1.- SUMA 2 NÚMEROS
         int resultado=numeroUno+numeroDos;
        
         //IMPRIMIR SALIDA DE INFORMACIÓN
         System.out.println("El resultado es: "+resultado);
         
         //3.- SUMA 2 NÚMEROS, UTILIZAR ENTRADAS Y SALIDAS
         Scanner s=new Scanner(System.in);
         //TRANSFORMAR DE UN OBJETO CADENA A UN ENTERO
         System.out.println("Ingrese número 1: ");
         int num1=Integer.parseInt(s.next()); //int num1=(s.nextInt());
         System.out.println("Ingrese número 2: ");
         int num2=s.nextInt();
         //SOBREESCRITURA
         num1+=num2; // num1=num1+=num2 = resp=num1+num2
         System.out.println("El resultado es: "+num1);
         
         //tRANSFORMANDO DE CADENA A ENTERO
         //1.- CADENA = CONJUNTO {} DE CARACTERES
         String cadena="La suma de de 2 números enteros es: ";
          System.out.println("Ingrese número 1: ");
         int n1=Integer.parseInt(s.next()); //int num1=(s.nextInt());
         System.out.println("Ingrese número 2: ");
         int n2=s.nextInt();
         //DOUBLE RECIBE TANTO ENTEROS COMO DECIMALES
         double resul=n1+n2;
         //+"" Transforma cualquier tipo de dato en cadena
         cadena+=resul+""; //Concateno
    }
}
