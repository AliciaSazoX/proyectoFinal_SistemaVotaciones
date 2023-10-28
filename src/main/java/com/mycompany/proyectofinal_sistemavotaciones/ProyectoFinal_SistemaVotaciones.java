/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectofinal_sistemavotaciones;

import java.util.Scanner;


/**
 *
 * @author ALIS
 */
public class ProyectoFinal_SistemaVotaciones {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //DECLARACION DE VARIABLES
        String pass = "&istem4Vot";
        
        //Ingreso, lectura, almacenamiento de la contraseña
        System.out.print("Ingrese la contraseña del usuario administrador :)\n");
        //para leer el objeto se utiliza la clase scanner
        Scanner teclado = new Scanner(System.in);
        //next.line para leer la cadena de datos
        pass = teclado.nextLine();
        
        if ("&istem4Vot".equals(pass))/*Comparacion con .equals()*/{   
       System.out.print("Bienvenido administrador :)\n");
        }
        else {
            System.out.print("Intente nuevamete :( \n");
 
        }    } }
   
    

    
 
