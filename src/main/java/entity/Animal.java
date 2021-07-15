package entity;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(especie, animal.especie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(especie);
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
