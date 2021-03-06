package ru.less.pet;

/**
 * Created by tr1o on 29.11.17.
 */
public interface Pet {

    /**
     * Сказать
     */
    void makeSound();

    /**
     * Имя питомца
     * @return
     */
    String getName();

    /**
     * Клонирование питомца
     * @return
     */
    public Pet copy();
}
