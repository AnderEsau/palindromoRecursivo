/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad1;

/**
 *
 * @author Ander Esau Hernández Jimenez 4:A 20250981
 */
public class palindromo {
    public boolean esPalindromo(String palabra){
        //Si la palabra que recibe es nula, retornamos directamente un falso
        //indicando que la palabra no es un palindromo
        if (palabra==null){
            return false;
        }
        //Primero quitamos los espacios y si es igual a nada o tiene una sola letra
        //se considera como un palindromo y no mandamos a llamar al metodo recursivo
        if (palabra.trim().equals("")||palabra.length()==1){
            return true;
        }
        //Posteriormente, hacemos minusculas las letras y reemplazamos todos los espacios
        palabra=palabra.toLowerCase().replace(" ", "");
        //Hacemos nuestros indices, donde el inicio siempre va ser 0 y por ende al fin
        //le restamos el total de caracteres menos 1
        int inicio=0;
        int fin=palabra.length()-1;
        //mandamos a llamar al metodo recursivo privado que nos indicara si la palabra es
        //un palindromo o no
        return esPalindromo(palabra,inicio,fin);
    }
    //Metodo privado donde despues de la validacion recibimos la palabra
    private boolean esPalindromo(String palabra,int inicio,int fin){
        /*
        Caso Base 1 (exito)
        Si el indice de inicio es igual o mayor al del final eso significa
        que cumplio su recorrido o incluso lo rebaso, eso indica que si es
        un palindromo.
        */
        if(inicio>=fin){
            return true;
        }
        /*
        Caso Base 2 (fracaso)
        Si la letra o caracter en la posicion de inicio es diferente a la del final
        entonces nos manda un falso, y nos indica que no es un palindromo
        */
        if(palabra.charAt(inicio)!= palabra.charAt(fin)){
            return false;
        }
        //Nuestro llamado a nuestro metodo recursivo
        return esPalindromo(palabra,inicio+1,fin-1);
        
    }
}
