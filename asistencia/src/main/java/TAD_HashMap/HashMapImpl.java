/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAD_HashMap;

/**
 *
 * @author Ticlavilca Sebastian
 */
import ListaGenerica.*;
import java.util.HashSet;
import java.util.Set;

public class HashMapImpl<K, V> implements HashMapInterface<K, V> {
    private ListaEnlazadaImpl<Entry<K, V>>[] table;
    private int size;
    private static final float LOAD_FACTOR = 0.75f;

    public HashMapImpl() {
        table = new ListaEnlazadaImpl[2];  // Capacidad inicial pequeña
        for (int i = 0; i < table.length; i++) {
            table[i] = new ListaEnlazadaImpl<>();
        }
        size = 0;
    }

    // Clase estática para pares clave-valor
    private static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    // Calcula el índice de la clave
    private int hash(K key) {
        return (key == null) ? 0 : Math.abs(key.hashCode() % table.length);
    }

    @Override
    public void insert(K key, V value) {
        // Redimensiona si la carga supera el umbral
        if (size >= LOAD_FACTOR * table.length) {
            resize();
        }

        int index = hash(key);
        ListaEnlazadaImpl<Entry<K, V>> bucket = table[index];

        // Reemplaza el valor si la clave ya existe
        Nodo<Entry<K, V>> actual = bucket.cabeza;
        while (actual != null) {
            if (actual.getData().key.equals(key)) {
                actual.getData().value = value;
                return;
            }
            actual = actual.getSiguiente();
        }

        // Añade un nuevo par clave-valor
        bucket.insertar(new Entry<>(key, value));
        size++;
    }

    @Override
    public V search(K key) {
        int index = hash(key);
        ListaEnlazadaImpl<Entry<K, V>> bucket = table[index];

        Nodo<Entry<K, V>> actual = bucket.cabeza;
        while (actual != null) {
            if (actual.getData().key.equals(key)) {
                return actual.getData().value;
            }
            actual = actual.getSiguiente();
        }
        return null;
    }

    @Override
    public void delete(K key) {
        int index = hash(key);
        ListaEnlazadaImpl<Entry<K, V>> bucket = table[index];

        Nodo<Entry<K, V>> actual = bucket.cabeza;
        Nodo<Entry<K, V>> previo = null;
        while (actual != null) {
            if (actual.getData().key.equals(key)) {
                if (previo == null) {
                    bucket.cabeza = actual.getSiguiente();
                } else {
                    previo.setSiguiente(actual.getSiguiente());
                }
                size--;
                return;
            }
            previo = actual;
            actual = actual.getSiguiente();
        }
    }

    private void resize() {
        ListaEnlazadaImpl<Entry<K, V>>[] oldTable = table;
        table = new ListaEnlazadaImpl[oldTable.length * 2];  // Duplica el tamaño de la tabla
        for (int i = 0; i < table.length; i++) {
            table[i] = new ListaEnlazadaImpl<>();
        }
        size = 0;

        // Rehash todos los elementos
        for (ListaEnlazadaImpl<Entry<K, V>> bucket : oldTable) {
            Nodo<Entry<K, V>> actual = bucket.cabeza;
            while (actual != null) {
                insert(actual.getData().key, actual.getData().value);
                actual = actual.getSiguiente();
            }
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() { //Verifica si esta vacio
        return size == 0;
    }

    @Override
    public void clear() {
        table = new ListaEnlazadaImpl[2];  // Restablece con un tamaño inicial pequeño
        for (int i = 0; i < table.length; i++) {
            table[i] = new ListaEnlazadaImpl<>();
        }
        size = 0;
    }
    
    @Override
    public Set<K> getKeys() {
        Set<K> keys = new HashSet<>();
        for (ListaEnlazadaImpl<Entry<K, V>> bucket : table) {
            Nodo<Entry<K, V>> actual = bucket.cabeza;
            while (actual != null) {
                keys.add(actual.getData().key);
                actual = actual.getSiguiente();
            }
        }
        return keys;
    }
}
