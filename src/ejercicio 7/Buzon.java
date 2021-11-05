
package ejercicio.pkg7;


public class Buzon extends Thread {
    static boolean disponible = true;
    static String mensaje;
    public Buzon(String nombre) {
        super(nombre);
    }

    public synchronized void escribirMensaje(String mensajeR) throws InterruptedException {
      while (!disponible){
          wait();
      }
      disponible = false;
      mensaje = mensajeR;
      disponible = true;
      notify();
    }

    public synchronized void leerMensaje() throws InterruptedException {
        while (!disponible || mensaje.isEmpty()){
            wait();
        }
        disponible = false;
        System.out.println("Contenido del mensaje: " + mensaje);
        disponible = true;
        notify();
        }
    }