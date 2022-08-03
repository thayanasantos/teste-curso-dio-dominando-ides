package br.com.br;

import br.com.br.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Gato gato =new Gato();
        System.out.println(gato);
        Livro livro1 = new Livro("os três porkinhos", 200);
        System.out.println(livro1);
     //   int a = 2;
       // int b = 3;
        //System.out.println("Hello Word" + (a+b));
    }
}
class Livro {
    private String nome;
    private Integer numPag;

    public Livro(String nome, Integer numPag) {
        this.nome = nome;
        this.numPag = numPag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPag() {
        return numPag;
    }

    public void setNumPag(Integer numPag) {
        this.numPag = numPag;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPag=" + numPag +
                '}';
    }

}
