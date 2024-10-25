package miPrincipal;
import java.util.LinkedList;
import java.util.List;

public class ClienteMainLinkedList {
    public static void main(String[] args) {
        try{
            List<Integer> lista = new LinkedList<Integer>();
            lista.add(12);
            lista.add(15);
            lista.add(20);
            System.out.println("Dato en la posicion 0:"+lista.get(0));
            System.out.println("Dato en la posicion 1:"+lista.get(1));
            System.out.println("Dato en la posicion 2:"+lista.get(2));
            lista.add(1,13);
            lista.add(3,16);
            System.out.println("El tamaño de la lista= "+lista.size());
            for(int i=0;i<lista.size();i++){
                System.out.println("Dato en la posicion "+i+": "+lista.get(i));

            }
            for(Integer aux:lista){
                System.out.println("Elemento: "+aux);
            }




        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
