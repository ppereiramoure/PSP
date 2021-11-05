/*

 */
package ejercicio.pkg4;


public class Termin extends Thread{


int terminados;

public Termin(String name){
super(name);
}

public void run(){
for (int i=0;i<=1000;i++){
if (i%10==2 || i%10==3)
terminados=terminados+i;
}
System.out.println(getName()+terminados);
}
}

