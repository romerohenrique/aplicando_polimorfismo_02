package entity;

public class Aguia extends Animal{
    public Aguia() {
    }

    public Aguia(String especie, String cor) {
        super(especie, cor);
    }

    @Override
    public String locomotion() {
        return "Vooa";
    }
}
