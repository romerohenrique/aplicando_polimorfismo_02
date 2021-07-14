package entity;

public class Peixe extends Animal{
    public Peixe() {
    }

    public Peixe(String especie, String cor) {
        super(especie, cor);
    }

    @Override
    public String locomotion() {
        return "nadando";
    }
}
