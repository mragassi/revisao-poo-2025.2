package application;

public class Gato extends Animal {

    public Gato(String nome) {
        super(nome); // chamar o construtor da classe pai
    }
    @Override
    public String comunicar() {
        return "Miau!";
    }
}
