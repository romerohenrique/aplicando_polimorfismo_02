package entity;

public class Cachorro extends Animal{

    public Cachorro() {
    }

    public Cachorro(String especie, String cor) {
        super(especie, cor);
    }

    @Override
    public String locomotion() {
        return "com as patas";
    }

}
