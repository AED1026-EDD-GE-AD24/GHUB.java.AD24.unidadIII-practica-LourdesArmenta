package lista;

public class Lista<T> {
    private Nodo<T> cabeza;
    private int tamanio;

    //constructor vacio
    public Lista() {
        cabeza = null;
        tamanio= 0;

    }

    public boolean esVacia(){

        return (cabeza==null);
         
    }

    public void agregar(T valor){
        Nodo<T> nuevo = new Nodo<T>();
        nuevo.setValor(valor);
        if (this.esVacia()){
            cabeza = nuevo;
        }else{
            //agregar al final de la lista
            Nodo<T> aux = cabeza;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);


        }
        tamanio++;
    }

    public T getValor(int pos) throws PosicionIlegalException{
        if(pos>0 &&pos<tamanio){
            T valor;
            if(pos==0){
                valor = cabeza.getValor();
                return valor;

            }
            else{
                Nodo<T> aux = cabeza;
                for(int i=0;i<=pos-1;i++){
                    aux = aux.getSiguiente();
                }
               valor= aux.getValor();
               return valor;

            }
            

        }else{
            throw new PosicionIlegalException();
        }

    }

    public void insertar(T valor, int pos) throws PosicionIlegalException{
        if (pos>=0 && pos<=tamanio){
            Nodo<T> nuevo = new Nodo<T>();
            nuevo.setValor(valor);
            if(pos==0){
                nuevo.setSiguiente(cabeza);
                cabeza=nuevo;
            }
            else{
                //insertar al final
                if(pos==tamanio){
                    Nodo<T> aux = cabeza;
                    while(aux.getSiguiente() != null){
                        aux = aux.getSiguiente();
                    }
                    aux.setSiguiente(nuevo);


                }else{
                    //inserta en medio
                }
            }


        }else{
            throw new PosicionIlegalException();
        }
    }

    //regresa el tamaño de la lista
    public int getTamanio() {
        return tamanio;
    }
    
    

    
}
