
package ejercicio.pkg4;


public class Pares extends Thread{

int Pares;

public Pares(String name){
super(name);
}

public void run(){
for(int i=0;i<=1000;i++){
if(i%2==0)
Pares = Pares + i;
}

System.out.println(getName()+Pares);
}


}
