/*
Programa en Java que cree dous fíos e os executa. Os fíos escriben dez veces un número de
iteración do bucle e seu nome. En cada iteración, despois de escribir o seu nome, se bloquean
durante un tempo aleatorio de segundos e después volven a estar dispoñibles para a súa
execución
 */
package ejercicio.pkg1;


public class Ejercicio1 {

    
    public static void main(String[] args) {
        System.out.println("Hilo principal iniciado.");
        
        fios miHilo1 = new fios("1");
        fios miHilo2 = new fios("2");
        
        miHilo1.start();
        miHilo2.start();
    }
    
}
