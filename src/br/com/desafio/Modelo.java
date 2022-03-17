package br.com.desafio;

import java.time.LocalDate;

public class Modelo extends Carro{

    private LocalDate data;

    public Modelo(){

    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Modelo{" +
                "nome = '" + getNome() + '\''+
                ", cor='" + getCor() + '\'' +
                ", data=" + data +
                '}';
    }

}
