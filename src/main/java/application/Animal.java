package application;

public abstract class Animal {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public abstract String comunicar(); // quando a classe é abstrata há a restrição de não poder instanciar objetos - não pode usar o "new animal". porém elas podem ser herdadas, extendidas.
}
