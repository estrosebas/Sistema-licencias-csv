package ColaGenerica;

public interface ColaInterface<T> {

    public void encolar(T item);

    public T desencolar();

    public T frente();

    public boolean estaVacia();

    public void mostrar();
}
