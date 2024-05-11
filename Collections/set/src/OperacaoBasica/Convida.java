package OperacaoBasica;

import java.util.Objects;

public class Convida {
    private String nome;
    private int codigoConvite;

    public Convida(String n, int c) {
        this.nome = n;
        this.codigoConvite = c;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Convida convidado))
            return false;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoConvite());
    }

    @Override
    public String toString() {
        return "Convida{" + "nome=" + nome + ", codigoConvite=" + codigoConvite + '}';
    }
}
