/*
 PRIORIDADES

Escribe unha clase que cree dous fíos e force que a escritura do segundo sexa sempre anterior á
escritura por pantalla do primeiro.
 Exemplo de ejecución:
 Ola, son o fío número 2
 Ola, son o fío número 1
 */
package ejercicio.pkg5;

import static ejercicio.pkg5.Launch.a;
import static ejercicio.pkg5.Launch.b;
import static java.lang.Thread.currentThread;


public class Ejercicio5 {

    
   public static void main(String args[]) {

a = new Launch("1");
b = new Launch("2");


a.setPriority(Thread.MIN_PRIORITY);
b.setPriority(Thread.MAX_PRIORITY);



a.start();
b.start();

}


public void run() {

if (currentThread().getName().equals("1")) {


try {
currentThread ().join ( 100);
} catch (InterruptedException e) {
e.printStackTrace ();
}

System.out.println(" Ola, son o fío número 1");

} else {
System.out.println(" Ola, son o fío número 2 ");
}
}

}
    

