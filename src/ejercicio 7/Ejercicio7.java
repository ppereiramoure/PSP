
package ejercicio.pkg7;


public class Ejercicio7 {

      public static void main(String[] args) throws InterruptedException {
        Buzon escribir = new Buzon("Escribir");
        Buzon leer = new Buzon("Leer");

        escribir.escribirMensaje("Hola Hilo");
        leer.leerMensaje();
        escribir.escribirMensaje("Adiós Hilo");
        leer.leerMensaje();

    }
    
}
