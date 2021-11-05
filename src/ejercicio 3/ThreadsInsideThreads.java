
package ejercicio.pkg3;


import java.util.Random;

public class ThreadsInsideThreads extends Thread {

private String threadName;
private Thread thread;
// Variable estática contador de fíos
private static int maxNumberThreads = 0;

private Random rm = new Random();

public ThreadsInsideThreads(String name) {
threadName = name;
System.out.println("Creando fío: " + this.threadName);
}


@Override
public void run() {
System.out.println("Comezamos: " + this.threadName);

// Asegura que o número máximo de fíos é 4.
if (maxNumberThreads < 4) {
thread = new ThreadsInsideThreads("son: " + this.threadName);
thread.start();
}
// Incremento no contador de fíos.
maxNumberThreads += 1;

for (int i = 0; i < 10; i++) {
System.out.println(threadName + " Contador de bucle: " + i);
try {
// Dorme o fío cun contador entre (100, 600)ms.
sleep(rm.nextInt(((600 - 100) + 1)) + 100);

} catch (InterruptedException e) {
e.printStackTrace();
}
}

try {
// Espera a que o fío fillo termine.
thread.join();
} catch (InterruptedException e) {
e.printStackTrace();
} catch (NullPointerException e) {
}

System.out.println("Acaba: " + getName());
}
}