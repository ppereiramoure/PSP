
package ejercicio.pkg5;



public class hilos extends Thread{

public hilos(String name) {
super(name);
}

@Override
public void run() {
System.out.println(this.getName()+" -> "+this.getPriority()+" prioridad");
}
}
