package application;

import entity.*;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        //usando polimorfismo para criar os objtos

        List<Animal> list = new ArrayList<>();
        list.add(new Aguia("Águia Americana", "Branca - preta"));
        list.add(new Cachorro("Pastor Suíço", "Branco"));
        list.add(new Peixe("molinesia negra","preta"));
        list.add(new Cobra("narja","preta"));
        for (Animal animal : list){
            System.out.println(animal.toString()+" Locomove: "+animal.locomotion());
        }
    }
}
