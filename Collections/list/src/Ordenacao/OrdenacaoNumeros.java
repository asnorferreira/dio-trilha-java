package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numbers;

    public OrdenacaoNumeros() {
        this.numbers = new ArrayList<>();
    }
    public void adicionarNumero(int numbers) {
        this.numbers.add(numbers);
    }

    public List<Integer> ordenarAsc(){
        List<Integer> list = new ArrayList<>(this.numbers);
        if (!numbers.isEmpty()) {
            Collections.sort(list);
            return list;
        } else {
            throw new RuntimeException("Lista vazia!"); 
        }
    } 

    public List<Integer> ordenarDesc(){
        List<Integer> list = new ArrayList<>(this.numbers);
        if (!numbers.isEmpty()) {
            Collections.sort(list, Collections.reverseOrder());
            return list;
        } else {
            throw new RuntimeException("Lista vazia!"); 
        }
    }

    public void exibirNumero(){
        if (!numbers.isEmpty()) {
            for (Integer n : numbers) {
                System.out.println(n);
            }
        } else {
            System.out.println("Lista vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros o = new OrdenacaoNumeros();

        o.adicionarNumero(324);
        o.adicionarNumero(793);
        o.adicionarNumero(123);
        o.adicionarNumero(298);

        System.out.println("");

        o.exibirNumero();
        System.out.println("");
        System.out.println("Lista de números asc: " + o.ordenarAsc());
        System.out.println("");
        System.out.println("Lista de números dsc: " + o.ordenarDesc());
    }
}
