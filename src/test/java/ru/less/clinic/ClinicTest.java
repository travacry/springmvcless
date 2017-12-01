package ru.less.clinic;

import org.junit.Test;
import ru.less.pet.Animal;
import ru.less.pet.Cat;
import ru.less.pet.Dog;

import static org.junit.Assert.*;

/**
 * Created by tr1o on 01.12.17.
 */
public class ClinicTest {

    private Clinic clinic;

    public ClinicTest() {

        clinic = new Clinic(5);
        Client client1 = new Client("Андрей", new Cat("Кот Василий"));
        Client client2 = new Client("Фрейд", new Cat("Кот Барсик"));
        Client client4 = new Client("Дмитрий", new Dog(new Animal("Собака Василий")));

        try {
            clinic.addClient(1, client1);
            clinic.addClient(2, client2);
            clinic.addClient(4, client4);
        } catch (ClinicException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void addClientAndFindClientsByName() throws Exception {
        Client client3 = new Client("Иван", new Cat("Кот Бегемот"));
        clinic.addClient(3, client3);
        Client client = clinic.findClientsByName("Иван")[0];
        assertEquals("", client.getId(), "Иван");
    }

    @Test
    public void findClientsByPetName() throws Exception {
        Client client = clinic.findClientsByPetName("Кот Василий")[0];
        assertEquals("", client.getId(), "Андрей");
    }

    @Test
    public void edit() throws Exception {
        Client client = clinic.findClientsByName("Дмитрий")[0];
        clinic.editNameClient("Дмитрий", "Карл");
        client = clinic.findClientsByName("Карл")[0];
        assertEquals("", client.getId(), "Карл");
        clinic.editNamePet("Карл", "Собака ПушОк");
        client = clinic.findClientsByName("Карл")[0];
        assertEquals("", client.getPet().getName(), "Собака ПушОк");
    }

    @Test
    public void deleteClient() throws Exception {
        clinic.deleteClient("Фрейд");
        Client[] clients = clinic.findClientsByName("Фрейд");
        assertEquals(0, clients.length);
        Client client2 = new Client("Фрейд", new Cat("Кот Барсик"));
        clinic.addClient(2, client2);
        clients = clinic.findClientsByName("Фрейд");
        assertEquals(1, clients.length);
    }

    @Test
    public void deletePetName() throws Exception {
        clinic.deletePetName("Фрейд");
        Client client = clinic.findClientsByName("Фрейд")[0];
        assertEquals("", "", client.getPet().getName());
    }

}