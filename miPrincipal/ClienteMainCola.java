package miPrincipal;
import cola.Cola;

public class ClienteMainCola {
    public static void main(String[] args) {
        //crear una cola de enteros
        Cola<Integer> cola = new Cola<Integer>();
        //se encolan algunos ekementos
        cola.encolar(12);
        cola.encolar(13);
        cola.encolar(14);
        cola.encolar(15);
        System.out.println("El primer elemento de la cola es: "+cola.frente());
        //
        cola.desencolar();
        System.out.println("El primer elemento de la cola es: "+cola.frente());

        cola.desencolar();
        System.out.println("El primer elemento de la cola es: "+cola.frente());

        cola.desencolar();
        System.out.println("El primer elemento de la cola es: "+cola.frente());

        cola.desencolar();
        System.out.println("El primer elemento de la cola es: "+cola.frente());
       

        
    }
    
}
