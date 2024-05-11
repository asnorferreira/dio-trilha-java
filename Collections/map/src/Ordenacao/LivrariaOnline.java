package Collections.map.src.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LivrariaOnline {
    private Map<String, Livro> bookMap;

    public LivrariaOnline() {
        this.bookMap = new HashMap<>();
    }

    public void adicionarLivro(String link, Livro book) {
        bookMap.put(link, book);
    }

    public void remover(String titulo) {
        bookMap.entrySet().removeIf(entry -> entry.getValue().getTitulo().equalsIgnoreCase(titulo));
    }

    public Map<String, Livro> exibirPorPreco() {

        List<Map.Entry<String, Livro>> map = new ArrayList<>(bookMap.entrySet());

        Collections.sort(map, new ComparatorPreco());

        Map<String, Livro> list = new LinkedHashMap<>();

        for(Map.Entry<String, Livro> e : map) {
            list.put(e.getKey(), e.getValue());
        }
        return list;
    }

    public Map<String, Livro> exibirPorAutor() {

        List<Map.Entry<String, Livro>> map = new ArrayList<>(bookMap.entrySet());

        Collections.sort(map, new ComparatorAutor());

        Map<String, Livro> list = new LinkedHashMap<>();
        
        for(Map.Entry<String, Livro> e : map) {
            list.put(e.getKey(), e.getValue());
        }
        return list;
    }

    public Map<String, Livro> exibirPorTitulo() {

        List<Map.Entry<String, Livro>> map = new ArrayList<>(bookMap.entrySet());

        Collections.sort(map, new ComparatorTitulo());

        Map<String, Livro> list = new LinkedHashMap<>();
        
        for(Map.Entry<String, Livro> e : map) {
            list.put(e.getKey(), e.getValue());
        }
        return list;
    }

    public Map<String, Livro> pesquisarPorAutor(String autor){
        Map<String, Livro> book = new LinkedHashMap<>();
        for(Map.Entry<String, Livro> e : bookMap.entrySet()) {
            Livro livro = e.getValue();
            if (livro.getAutor().equals(autor)){
                book.put(e.getKey(), livro);
            }
        }
        return book;
    }

    public List<Livro> livroCaro(){
        List<Livro> book = new ArrayList<>();
        double num = Double.MIN_VALUE;
        if(!bookMap.isEmpty()){
            for(Livro l: bookMap.values()){
                if(l.getPreco() > num){
                    num = l.getPreco();
                }
            }
            for (Livro l: bookMap.values()){
                if(l.getPreco() == num){
                    book.add(l);
                }
            }
        } else {
            throw new RuntimeException("Lista vazia!");
        }
        // if(!book.isEmpty()){
        //     for(Livro l: bookMap.values()){
        //         if(l.getPreco() > num){
        //             num = l.getPreco();
        //         }
        //     }
        // } else {
        //     throw new RuntimeException("Lista vazia!");
        // }
        // for (Map.Entry<String, Livro> e: bookMap.entrySet()) {
        //     if(e.getValue().getPreco() == num){
        //         Livro bookHigh = bookMap.get(e.getKey());
        //         book.add(bookHigh);
        //     }
        // }
        return book;
    }
}