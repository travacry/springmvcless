package pet;

/**
 * Базовый класс для животных
 * Created by tr1o on 30.11.17.
 */
public class Animal implements Pet {

    /**
     * Имя
     */
    private final String name;

    /**
     * Конструктор.
     * @param name Имя животного
     */
    public Animal(String name) {
        this.name = name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void makeSound() {
        System.out.println(String.format("%s say : %s", name, "beep"));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Голодный питомец или нет
     * @return
     */
     private boolean isHungry() {
        //todo :: добавить алгоритм вычисления состояния
        return true;
    }
}
