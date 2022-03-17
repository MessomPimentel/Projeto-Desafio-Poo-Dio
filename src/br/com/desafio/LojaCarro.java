package br.com.desafio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public  class LojaCarro {

       private String nome;
       private String cor;
       private final LocalDate dataCompra = LocalDate.now();

       private Set<Carro> carros = new LinkedHashSet<>();

       public String getNome() {
           return nome;
       }

       public void setNome(String nome) {
           this.nome = nome;
       }

       public String getCor() {
           return cor;
       }

       public void setCor(String cor) {
           this.cor = cor;
       }

       public Set<Carro> getCarros() {
           return carros;
       }

       public void setCarros(Set<Carro> carros) {
           this.carros = carros;
       }

       @Override
       public String toString() {
           return "LojaCarro{" +
                   "nome='" + nome + '\'' +
                   ", cor='" + cor + '\'' +
                   ", dataCompra=" + dataCompra +
                   '}';
       }
   }