package pet;

/**
 * Created by tr1o on 29.11.17.
 */
public class Dog implements Pet {
    /**
     * Базовая реализация
     */
    private final Pet pet;

    public Dog(Pet pet) {
        this.pet = pet;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void makeSound() {
        pet.makeSound();
        System.out.println("Gav!");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return pet.getName();
    }
}
