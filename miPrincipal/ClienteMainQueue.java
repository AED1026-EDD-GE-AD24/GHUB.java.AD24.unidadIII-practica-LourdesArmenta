package miPrincipal;
import java.util.Queue;
import java.util.LinkedList;


public class ClienteMainQueue {
    public static void main(String[] args) {
        //crear una cola generica
        Queue<String> micola= new LinkedList<String>();
        
        micola.add("Elemento 0");
        micola.add("Elemento 1");
        micola.add("Elemento 2");
        //muestra el tamano de la cola
        System.out.println("Tamaño de la cola:"+micola.size());
        //muestra el primer elemento de la cola
        System.out.println("El primer elemento de la cola es: "+micola.peek());
        micola.remove();
        System.out.println("El primer elemento de la cola es: "+micola.peek());
        micola.remove();
        System.out.println("El primer elemento de la cola es: "+micola.peek());
        micola.remove();
        System.out.println("El primer elemento de la cola es: "+micola.peek());
        System.out.println("Tamaño de la cola:"+micola.size());



    }
    
}
