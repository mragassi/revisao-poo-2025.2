package application;

public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome); // chamar o construtor da classe pai
    }

    @Override
    public String comunicar() {
        return "Au, Au";
    }
}
