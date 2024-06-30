package ListaGenerica;

import java.util.Comparator;

public interface ListaInterface<T> {

	public void insertar(T item);

	public boolean eliminar(String id);

	public T buscar(String id);

	public void mostrar();

	public boolean estaVacia();
        
        public void ordenar(Comparator<T> comparator);
        
}
