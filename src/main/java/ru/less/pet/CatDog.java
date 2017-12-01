package ru.less.pet;

/**
 * Реализация "кото-пес"
 * Created by tr1o on 30.11.17.
 */
public class CatDog implements Pet {

    private final Pet cat;
    private final Pet dog;

    /**
     * Конструктор.
     * @param cat
     * @param dog
     */
    public CatDog(Pet cat, Pet dog) {
        this.cat = cat;
        this.dog = dog;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void makeSound() {
        cat.makeSound();
        dog.makeSound();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return String.format("Name cat: %s, Name dog: %s", cat.getName(), dog.getName());
    }

    @Override
    public Pet copy() {
        // todo :: заглушка
        return null;
    }
}
