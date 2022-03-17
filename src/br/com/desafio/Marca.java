package br.com.desafio;


public class Marca extends Carro {
    private int anoCarro;
    //construtor vazio
    public Marca(){

    }

    //metodos
    public int getAnoCarro() {
        return anoCarro;
    }

    public void setAnoCarro(int anoCarro) {
        this.anoCarro = anoCarro;
    }

    @Override
    public String toString() {
        return "Marca{" +
                "nome='" + getNome() + '\'' +
                ", cor='" + getCor() + '\'' +
                ", anoCarro=" + anoCarro +
                '}';
    }

}
