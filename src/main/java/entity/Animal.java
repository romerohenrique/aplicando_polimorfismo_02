package entity;

public abstract class Animal {
    protected String especie;
    protected String cor;

    public Animal() {
    }

    public Animal(String especie, String cor) {
        this.especie = especie;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public abstract String locomotion();
}
