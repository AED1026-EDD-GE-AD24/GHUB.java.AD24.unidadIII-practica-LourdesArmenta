package hashtable;
import java.util.Collection;
import java.util.LinkedList;

public class TestHashTable2 {
    public static void main(String[] args) {
        HashTable2<Persona> ht = new HashTable2<Persona>();
        Persona p1 = new Persona("Pablo",33,"Argentino");
        Persona p2 = new Persona("Juan",25,"Mexicano");
        Persona p3 = new Persona("Pedro",18,"Español");
        Persona p4 = new Persona("Pablo",15,"Italiano");
        Persona p5 = new Persona("Pablo",30, "Mexicano");
        Persona p6 = new Persona("Juan",29,"Uruguayo");
        ht.put(p1.getNombre(),p1);
        ht.put(p2.getNombre(),p2);
        ht.put(p3.getNombre(),p3);
        ht.put(p4.getNombre(),p4);
        ht.put(p5.getNombre(),p5);
        ht.put(p6.getNombre(),p6);

        LinkedList<Persona> juanes = ht.get("Juan");
        for (Persona p: juanes){
            System.out.println(p);
        }
        LinkedList<Persona> pablos = ht.get("Pablo");
        for (Persona p: pablos){
            System.out.println(p);
        }
        LinkedList<Persona> pedros = ht.get("Pedro");
        for (Persona p: pedros){
            System.out.println(p);
        }

        Collection<String> keys = ht.keys();
        



        
    }

}
