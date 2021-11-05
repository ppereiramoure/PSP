/*
Realiza un programa en java que execute tres fíos de forma concurrente. Un de eles debe sumar os
números pares del 1 ao 1000, outro os impares, e outro, os que terminen en dous ou en tres.
 */
package ejercicio.pkg4;


public class Ejercicio4 {

    
    public static void main(String[] args) {
        new Pares ("Números Pares : ").start();
        new Impares ("Números Impares : ").start();
        new Termin ("Rematados en dous e tres : ").start();;    }
    
}
