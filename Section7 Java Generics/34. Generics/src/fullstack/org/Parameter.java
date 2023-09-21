package fullstack.org;

class Love<K,V> {
    private K key;
    private V value;

    public Love(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Data [key=" + key + ", value=" + value + "]";
    }
}

public class Parameter {
    public static void main(String[] args) {
        Love<Integer, String> data = new Love<Integer, String>(1, "Cand");
        System.out.println("Key=" + data.getKey() + ", Value=" + data.getValue());
    }
}
