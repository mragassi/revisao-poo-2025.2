package application;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!!!");

        Gato gato = new Gato("Bichano");
        // gato.setNome("Bichano");

        System.out.println(gato.getNome());
        System.out.println(gato.comunicar());

        Cachorro cachorro = new Cachorro("Totó");
        // cachorro.setNome("Totó");

        System.out.println(cachorro.getNome());
        System.out.println(cachorro.comunicar());
    }
}

