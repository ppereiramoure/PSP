
package ejercicio.pkg4;

public class Impares extends Thread{

int Impares;

public Impares(String name){
super(name);
}

public void run(){
for(int i=0;i<=1000;i++){
if(i%2!=0)
Impares = Impares + i;
}

System.out.println(getName()+Impares);
}
}
