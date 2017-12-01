package ru.less.clinic;

import ru.less.pet.Animal;
import ru.less.pet.Cat;
import ru.less.pet.Dog;

/**
 * Created by tr1o on 01.12.17.
 */
public class ClinicRunner {
    public static void main(String[] args) {
        Clinic clinic = new Clinic(5);
        Client client1 = new Client("Андрей", new Cat("Кот Василий"));
        Client client2 = new Client("Фрейд", new Cat("Кот Барсик"));
        Client client3 = new Client("Иван", new Cat("Кот Бегемот"));
        Client client4 = new Client("Дмитрий", new Dog(new Animal("Собака Василий")));

        try {
            clinic.addClient(1, client1);
            clinic.addClient(2, client2);
            clinic.addClient(3, client3);
            clinic.addClient(4, client4);
        } catch (ClinicException e) {
            e.printStackTrace();
        }

        clinic.findClientsByPetName("Кот Барсик");
        clinic.findClientsByPetName("Кот Василий");

        clinic.findClientsByName("Фрейд");

        clinic.editNamePet("Фрейд", "Кот Цыганка");

        System.out.println(clinic);
    }
}
