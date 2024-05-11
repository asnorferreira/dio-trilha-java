package OperacaoBasica;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convida> convidado;

    public ConjuntoConvidados() {
        this.convidado = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidado.add(new Convida(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Set<Convida> set = new HashSet<>();
        if (!convidado.isEmpty()) {
            for (Convida c : convidado) {
                if (c.getCodigoConvite() == codigoConvite) {
                    set.add(c);
                    break;
                }
            }
            convidado.removeAll(set);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public int contarConvidados() {
        return convidado.size();
    }

    public void exibirConvidados() {
        if (!convidado.isEmpty()) {
            for (Convida c : convidado) {
                System.out.println(c);
            }
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {
        ConjuntoConvidados c = new ConjuntoConvidados();

        c.adicionarConvidado("João", 1);
        c.adicionarConvidado("Maria", 2);
        c.adicionarConvidado("José", 3);
        c.adicionarConvidado("Maria", 4);
        c.adicionarConvidado("José", 5);
        c.adicionarConvidado("Maria", 6);
        c.adicionarConvidado("José", 7);
        c.adicionarConvidado("Maria", 8);
        c.adicionarConvidado("José", 9);
        c.adicionarConvidado("Maria", 10);
        c.adicionarConvidado("José", 11);
        c.adicionarConvidado("Maria", 12);

        System.out.println("-------------------------------------------");
        System.out.println(
                "Existem " + c.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        System.out.println("-------------------------------------------");
        c.removerConvidadoPorCodigoConvite(2);
        System.out.println(
                "Existem " + c.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        System.out.println("-------------------------------------------");
        System.out.println("Lista de usuários: ");
        c.exibirConvidados();
    }
}
