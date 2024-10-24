package miPrincipal;
import lista.Lista;
import lista.PosicionIlegalException;

public class ClienteMainLista {
    public static void main(String[] args) throws PosicionIlegalException {
        //Crear una lista
        Lista<Integer> lista = new Lista<Integer>();
        //agegar 3 elementos
        lista.agregar(10);
        lista.agregar(15);
        lista.agregar(20);
        lista.agregar(25);
        //mostras los elementos
        System.out.println("Dato en la posicion 0 ;"+lista.getValor(0));
        System.out.println("Dato en la posicion 1 ;"+lista.getValor(1));
        System.out.println("Dato en la posicion 2 ;"+lista.getValor(2));
        System.out.println("Dato en la posicion 3 ;"+lista.getValor(3));


    }
    
}
