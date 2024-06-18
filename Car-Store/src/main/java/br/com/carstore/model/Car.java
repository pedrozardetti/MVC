package br.com.carstore.model;

public class Car {

    private String name;

    //Construtor substituindo o setter, inicializando o name;
    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
