import java.util.HashMap;

public class MyHashMap<K,V> {
    static final float LOAD_FACTOR = 0.75f;
    static final int  DEFAULT_CAPACITY = 16;

    static class Node<K,V>{
    final int hash;
    final K key;
    V value;
    Node<K,V> next;

         public Node(int hash, K key, V value, Node<K, V> next) {
             this.hash = hash;
             this.key = key;
             this.value = value;
             this.next = next;
         }
         public K getKey() {
             return key;
         }

         public V getValue() {
             return value;
         }
     }

     private Node<K,V>[] table;
     private int size;
     private  int threshold;
     private  float loadFactor;
    public MyHashMap() {
        this.loadFactor = LOAD_FACTOR;
    }
    private int hash(K key){
        return  key.hashCode() ^ key.hashCode()>>>16;
    }
    private int indexFor(int hash,int capacity){
        return 0;
    }
    V addVal(int hash, K key, V value){
        Node<K,V>[] tab;
        Node<K,V> node;
        int putIndex;
        tab = table;
        if(tab == null){
            tab = new Node[DEFAULT_CAPACITY];
        }
        putIndex = indexFor(hash, tab.length);
        if(tab[putIndex] == null){
            node = new Node<>(hash,key,value,null);
        }
        else {
            Node<K,V> e;
            K keyTemp;

        }

return null;
    }
    private V put(K key, V value){
        return  addVal(hash(key), key, value);
}
}
