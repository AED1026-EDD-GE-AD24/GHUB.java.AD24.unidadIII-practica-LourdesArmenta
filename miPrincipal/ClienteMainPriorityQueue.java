package miPrincipal;
import java.util.PriorityQueue;


public class ClienteMainPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> cola1 = new PriorityQueue<Integer>();
        cola1.add(70);
        cola1.add(120);
        cola1.add(6);
        System.out.println("Primer elemento de la cola "+cola1.peek());
        cola1.remove();
        System.out.println("Primer elemento de la cola "+cola1.peek());
        cola1.remove();
        System.out.println("Primer elemento de la cola "+cola1.peek());
        cola1.remove();
        System.out.println("Primer elemento de la cola "+cola1.peek());
        cola1.add(70);
        cola1.add(120);
        cola1.add(6);
        while(!cola1.isEmpty()){
            System.out.println(cola1.poll());
        }
        System.out.println("tamaño de la cola="+cola1.size());
        



    }
    
}
