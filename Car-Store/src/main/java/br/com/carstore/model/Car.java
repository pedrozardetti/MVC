package br.com.carstore.model;

public class Car {

    private String name;
    private String id;


    //Construtor substituindo o setter, inicializando o name;
    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Car(String name, String id) {
        this.name = name;
        this.id = id;
    }
}
