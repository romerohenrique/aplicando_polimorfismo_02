package entity;

public class Cobra extends Animal {

    public Cobra() {
    }

    public Cobra(String especie, String cor) {
        super(especie, cor);
    }

    @Override
    public String locomotion() {
        return "rasteja";
    }
}
