package br.com.desafio;


public class Main {

    public static void main(String[] args) {

        Marca marca1 = new Marca();

        marca1.setNome("BMW");
        marca1.setCor("A cor preta");
        marca1.setAnoCarro(2000);

        Marca marca2 = new Marca();

        marca2.setNome("Ford");
        marca2.setCor("A cor preta");
        marca2.setAnoCarro(2022);


        System.out.println(marca1);
        System.out.println(marca2);

    }
}
