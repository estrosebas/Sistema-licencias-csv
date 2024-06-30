package ListaGenerica;

import Entidad.*;
import java.lang.reflect.Method;
import java.util.Comparator;

public class ListaEnlazadaImpl<T> implements ListaInterface<T> {

    public Nodo<T> cabeza;

    public ListaEnlazadaImpl() {
        this.cabeza = null;
    }

    @Override
    public void insertar(T item) {
        Nodo<T> nuevoNodo = new Nodo<>(item);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo<T> actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
    }

    @Override
    public boolean eliminar(String id) {
        if (cabeza == null) {
            return false;
        }
        if (getId(cabeza.getData()).equals(id)) {
            cabeza = cabeza.getSiguiente();
            return true;
        }
        Nodo<T> actual = cabeza;
        while (actual.getSiguiente() != null) {
            if (getId(actual.getSiguiente().getData()).equals(id)) {
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    @Override
    public T buscar(String id) {
        Nodo<T> actual = cabeza;
        while (actual != null) {
            if (getId(actual.getData()).equals(id)) {
                return actual.getData();
            }
            actual = actual.getSiguiente();
        }
        return null;
    }

    @Override
    public void mostrar() {
        Nodo<T> actual = cabeza;
        while (actual != null) {
            System.out.println(actual.getData());
            actual = actual.getSiguiente();
        }
    }

    @Override
    public boolean estaVacia() {
        return cabeza == null;
    }

    private String getId(T elemento) {
        try {
            Method getIdMethod;
            if (elemento instanceof Establecimiento) {
                getIdMethod = elemento.getClass().getMethod("getRuc_Estab");
            } else if (elemento instanceof Login) {
                getIdMethod = elemento.getClass().getMethod("getId_Usuario");
            } else {
                throw new RuntimeException("El tipo de objeto no es compatible");
            }
            return (String) getIdMethod.invoke(elemento);
        } catch (Exception e) {
            throw new RuntimeException("No se pudo obtener el ID del objeto", e);
        }
    }
    @Override
    public void ordenar(Comparator<T> comparator) {
        MergeSort<T> mergeSort = new MergeSort<>(comparator);
        cabeza = mergeSort.mergeSort(cabeza);
    }

}
