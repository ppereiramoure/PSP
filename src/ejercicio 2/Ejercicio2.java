/*
Programa que crea 4 fíos, os executa e espera a que estes terminen. Os fíos escriben 5 veces o
número de iteración do bucle e o seu nome. En cada iteración, despois de escribir o seu nome,
bloquéanse durante un segundo e volven a estar dispoñibles para a súa execución.
 */
package ejercicio.pkg2;


public class Ejercicio2 {

   
    public static void main(String[] args) {
        Hilos hilo1 = new Hilos("Hilo1");
        Hilos hilo2 = new Hilos("Hilo2");
        Hilos hilo3 = new Hilos("Hilo3");
        Hilos hilo4 = new Hilos("Hilo4");
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
    }
    
}
