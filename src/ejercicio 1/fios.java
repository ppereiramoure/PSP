
package ejercicio.pkg1;


public class fios extends Thread {
    
    public fios (String str){
        super (str);
    }
    
    public void run(){
        for (int i = 0; i < 10; i++){
            System.out.println( i + " " + getName() );
            System.out.println("Termina thread" + getName() );
        }
            
    }
    
}
