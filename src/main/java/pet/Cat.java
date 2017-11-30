package pet;

/**
 * Реализация кота
 * Created by tr1o on 30.11.17.
 */
public class Cat extends Animal {

    /**
     * Конструктор.
     * @param name
     */
    public Cat(String name) {
        super(name);
    }

    /**
     * Поймать маш
     */
    public void catchMouse() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void makeSound() {
        System.out.println(String.format("May %s", getName()));
    }
}
