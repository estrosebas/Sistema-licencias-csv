package TAD_LoginCola;

import Entidad.Login;
import ListaGenerica.ListaEnlazadaImpl;
import ListaGenerica.Nodo;

public class ColaImplLogin implements ColaInterfaceLogin {

    private ListaEnlazadaImpl<Login> lista;

    public ColaImplLogin() {
        this.lista = new ListaEnlazadaImpl<>();
    }

    @Override
    public void encolar(Login login) {
        Nodo<Login> nuevoNodo = new Nodo<>(login);
        if (estaVacia()) {
            lista.cabeza = nuevoNodo;
        } else {
            Nodo<Login> actual = lista.cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
    }

    @Override
    public Login desencolar() {
        if (estaVacia()) {
            System.out.println("La cola está vacía, no se puede desencolar.");
            return null;
        }
        Login login = lista.cabeza.getData();
        lista.cabeza = lista.cabeza.getSiguiente();
        return login;
    }

    @Override
    public Login frente() {
        if (estaVacia()) {
            System.out.println("La cola está vacía, no hay frente.");
            return null;
        }
        return lista.cabeza.getData();
    }

    @Override
    public boolean estaVacia() {
        return lista.estaVacia();
    }

    @Override
    public void mostrar() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
            return;
        }
        Nodo<Login> actual = lista.cabeza;
        while (actual != null) {
            Login login = actual.getData();
            System.out.println("ID Usuario: " + login.getId_Usuario() + ", Contraseña: " + login.getContra()
                    + ", ID Admin: " + login.getId_admini());
            actual = actual.getSiguiente();
        }
    }

    public Login autenticar(String nombre, String contrasena) {
        if (estaVacia()) {
            System.out.println("La cola está vacía, no se puede autenticar.");
            return null;
        }

        ListaEnlazadaImpl<Login> listaTemp = new ListaEnlazadaImpl<>();
        Login usuarioEncontrado = null;

        while (!estaVacia()) {
            Login login = desencolar();
            if (login.getNombre().equals(nombre) && login.getContra().equals(contrasena)) {
                usuarioEncontrado = login;
            }
            listaTemp.insertar(login);
        }

        // Restaurar la cola original
        while (!listaTemp.estaVacia()) {
            encolar(listaTemp.cabeza.getData());
            listaTemp.cabeza = listaTemp.cabeza.getSiguiente();
        }

        if (usuarioEncontrado == null) {
            System.out.println("Usuario no encontrado");
        }

        return usuarioEncontrado;
    }
}
