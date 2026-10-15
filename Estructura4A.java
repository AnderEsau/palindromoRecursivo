/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uthh.estructura4a;

import Unidad1.palindromo;
import Unidad1.tdaCuentaBancaria;
/**
 *
 * @author Daniel H J
 */
public class Estructura4A {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Hola mundo 4A");
        palindromo ejemplo = new palindromo();
        String[]palabras={"reconocer","radar","juan","",null,"c"};

        //1.-primera evaluacion con la palabra reconocer
        for(int i=0;i<palabras.length;i++){
            if(ejemplo.esPalindromo(palabras[i])){
                System.out.println(palabras[i]+" es palindromo");
            }
            else{
                System.out.println(palabras[i]+" no es palindromo");
            }
            
        }
        
        
        
    }
    
    public static void menuCuenta(){
        tdaCuentaBancaria cuenta= new tdaCuentaBancaria("Ander Esau Hernández Jiménez", "5579321937812453", 5000.0f);
        
        System.out.println("Banco Universitario");
        
        if(cuenta.Depositar(6000)==true){
            System.out.println("Deposito éxitoso, tu nuevo saldo es: "+cuenta.ConsultarSaldo()+" Pesos");
        }else{
            System.out.println("Error al depositar revisa la cantidad");
        }
        
        if(cuenta.Retirar(3000)){
            System.out.println("Retiro exitoso");
        }else{
            System.out.println("Error al retirar revisa las cantidades");
        }
        
        System.out.printf("El titular de la cuenta "+cuenta.getNumCuenta()+" es : "+cuenta.getTitular()+"\n y tiene un saldo de :$"+cuenta.ConsultarSaldo());
    }
    
        public static void menuRecursivo(){
        recursivo funcion = new recursivo();
        int [] x = {10,10,5,10};
        System.out.println("El factorial de : "+ funcion.factorial(5));
    }
    
    public static void menuRecursivo2(){
        recursivo funcion = new recursivo();

         
        System.out.println("El factorial de : "+ funcion.factorial(5));
    }
    public static void menuArreglos(){
        arreglos ej = new arreglos();
    }
    
    public static void menuPalindromo(){
        palindromo ejemplo = new palindromo();
        
    }
}
