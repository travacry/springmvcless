package ru.less.clinic;

import ru.less.pet.Pet;

/**
 * Клиент
 * Created by tr1o on 30.11.17.
 */
public class Client {

    private final String id;
    private final Pet pet;

    public Client(String id, Pet pet) {
        this.id = id;
        this.pet = pet;
    }

    public String getId() {
        return id;
    }

    public Pet getPet() {
        return pet;
    }
}
