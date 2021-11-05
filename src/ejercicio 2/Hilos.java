
package ejercicio.pkg2;

public class Hilos extends Thread {
    public Hilos(String str){
        super(str);
    }

    @Override
    public void run() {
        for (int i = 0; i <6 ; i++) {
            System.out.println("Iteración: " + i + " Nombre: " + getName());
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en proceso");
            }
        }
        System.out.println("Fin del hilo: " + getName());
    }
}