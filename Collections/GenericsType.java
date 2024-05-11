package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;


public class GenericsType<T> {
    // public class GenericsType<T> {
    private T t;

    public GenericsType(T t) {
        this.t = t;
    }
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        //LIST
        List<String> listGenerics = new ArrayList<>();
        listGenerics.add("1");
        listGenerics.add("2");

        for(Object object : listGenerics) {
            String str = (String) object;
            System.out.println(str);
        }

        //SET
        Set<String> conjuntoGenerics = new HashSet<>();
        conjuntoGenerics.add("12");
        conjuntoGenerics.add("13");

        for(Object o: conjuntoGenerics){
            String str = (String) o;
            System.out.println(str);
        }

        //MAP
        Map<String, Integer> mapGenerics = new HashMap<>();
        mapGenerics.put("Chave 1", 10);
        mapGenerics.put("Chave 2", 20);

        for(Map.Entry<String, Integer> entry: mapGenerics.entrySet()){
            String chave = entry.getKey();
            int valor = entry.getValue();
            System.out.println("Chave: " + chave + ", valor: " + valor);
        }
    }
}

// E - Elemento
// K - Chave
// N - Numero
// T - Tipo
// V - Valor
// S, U, V, etc. -2ª, 3ª, 4ª tipos
// Evita a necessidade de conversões de tipo desnecessárias e permite que o compilador otimize