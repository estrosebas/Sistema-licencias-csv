/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TAD_HashMap;

/**
 *
 * @author Ticlavilca Sebastian
 */
import java.util.Set;

public interface HashMapInterface<K, V> {
    
    public void insert(K key, V value);
    
    public V search(K key);
    
    public void delete(K key);
    
    public int size();
    
    public boolean isEmpty();
    
    public void clear();
    
    public Set<K> getKeys(); //Metodo para obtner todas las claves y aplicar al cargador
}