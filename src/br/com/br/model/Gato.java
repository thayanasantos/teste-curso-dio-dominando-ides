package br.com.br.model;

import java.util.Objects;

public class Gato {
    private String nome;
    private String co;
    private Integer idade;

    public Gato(String nome, String co, Integer idade) {
        this.nome = nome;
        this.co = co;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", co='" + co + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Objects.equals(nome, gato.nome) && Objects.equals(co, gato.co) && Objects.equals(idade, gato.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, co, idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCo() {
        return co;
    }

    public void setCo(String co) {
        this.co = co;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Gato() {

    }
}
