package miPrincipal;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Iterator;


public class ClienteMainHashMap {
    public static void main(String[] args) {
        HashMap<String,Float> listaProductos = new HashMap<String,Float>();
        Scanner sc=new Scanner(System.in);
        int opcionElegida=0;
        float precio;
        String codigo;
        while(opcionElegida !=5){
            System.out.println("Introduce el numero de opción");
            System.out.println("1.- Introducir producto");
            System.out.println("2.- Modificar precio");
            System.out.println("3.- Mostrar todos los productos");
            System.out.println("4.- Eliminar producto");
            System.out.println("5.- Salir");
            opcionElegida = sc.nextInt();
            switch (opcionElegida){
                case 1:
                    System.out.print("introduce el código de producto: ");
                    codigo=sc.next();
                    System.out.print("introduce el precio: ");
                    precio=sc.nextFloat();
                    guardarProducto(codigo,precio,listaProductos);
                    break;
                case 2:
                    System.out.print("introduce el código de producto que quieres cambiar: ");
                    codigo=sc.next();
                    modificarPrecio(codigo,listaProductos);
                    break;
                case 3:
                    mostrarProductos(listaProductos);
                    break;
                case 4:
                    System.out.print("introduce el código de producto que quieres eliminar: ");
                    codigo=sc.next();
                    eliminarProducto(codigo,listaProductos);
                    break;

                case 5:
                   break;
                default:
                    System.out.println("Opciom no válida,intenta de nuevo");

            }

        }

        
    }
    //Agrega un código de producto pero antes 
    //verifica que el codigo no exista
    public static void guardarProducto(String codigo, float precio, 
        HashMap<String,Float> listaProductos){
            if(listaProductos.containsKey(codigo)){
                System.out.println("no se puedo introducir un producto repetido");
            }else{
                listaProductos.put(codigo,precio);
            }

    }

    //modifica el precio de un producto que EXISTE EN LA TABLA
    public static void modificarPrecio(String codigo, HashMap<String,Float> listaProductos){
        Scanner sc= new Scanner(System.in);
        if(listaProductos.containsKey(codigo)){
            System.out.println("Introduce el precio del producto");
            listaProductos.put(codigo,sc.nextFloat());

        }else{
            System.out.println("no hay ningun producto con ese codigo");
        }
    }

    //para eliminar un producto, este tiene que existir
    public static void eliminarProducto(String codigo,HashMap<String,Float> listaProductos){
        if(listaProductos.containsKey(codigo)){
            listaProductos.remove(codigo);
        }else{
            System.out.println("No hay ningun producto con ese codigo");
        }

    }

    public static void mostrarProductos(HashMap<String,Float> listaProductos){
        String clave;
        Iterator<String> productos = listaProductos.keySet().iterator();
        System.out.println("Hay los siguiente productos:");
        while(productos.hasNext()){
            clave = productos.next();
            System.out.println(clave +" - "+listaProductos.get(clave));
        }

    }
    
}
