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
        //insertar en medio de la lista
        lista.insertar(13, 1);
        //mostrar la lista con los nuevos elementos insertador
        System.out.println();
        for(int i=0;i<lista.getTamanio();i++){
            System.out.println("Dato en la posicion "+i+": "+lista.getValor(i));
        }
        //insertar al final de la lista
        lista.insertar(16, 5);
        System.out.println();
        for(int i=0;i<lista.getTamanio();i++){
            System.out.println("Dato en la posicion "+i+": "+lista.getValor(i));
        }
        //inserte al princio de la lista
        lista.insertar(20, 0);
        System.out.println();
        for(int i=0;i<lista.getTamanio();i++){
            System.out.println("Dato en la posicion "+i+": "+lista.getValor(i));
        }
        //remover al final
        lista.remover(6);
        //remover en medio
        lista.remover(2);
        //removi al principio
        lista.remover(0);
        //mostrar los elementos despues de remove
        System.out.println();
        for(int i=0;i<lista.getTamanio();i++){
            System.out.println("Dato en la posicion "+i+": "+lista.getValor(i));
        }
        lista.limpiar();
        System.out.println("tamano de mi lista:"+lista.getTamanio());
        if(lista.esVacia())
            System.out.println("lista vacia");
        
        lista.remover(0);
        





    }
    
}
