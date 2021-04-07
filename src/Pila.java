import java.util.LinkedList;

public class Pila<E> implements Stack{

    private LinkedList<E> lista;

    public Pila() {
        lista = new LinkedList<E>();

    }
    /**
     *To String solo para ver el contenido de la pila
     *no se utiliza
     */
    public String toString() {
        return lista.toString();
    }


    @Override
    public void push(Object item) {
         lista.addFirst((E) item);
    }

    /**
     *elimina el primer elemento de la pila
     */
    @Override
    public E pop() {
        // TODO Auto-generated method stub
        return lista.removeFirst();
    }

    /**
     *muestra el primer elemento de la pila
     */
    @Override
    public E peek() {
        // TODO Auto-generated method stub
        return lista.getFirst();
    }

    /**
     *muestra si la pila esta vacia
     */
    @Override
    public boolean empty() {
        // TODO Auto-generated method stub
        return lista.isEmpty();
    }

    /**
     *muestra el tamaño de la pila
     */
    @Override
    public int size() {
        // TODO Auto-generated method stub
        return lista.size();
    }




}
