package clinic;

import pet.*;

import java.util.ArrayList;

/**
 * Клиника
 * Created by tr1o on 30.11.17.
 */
public class Clinic {

    /**
     * Список клиентов
     */
    private final Client[] clients;

    public Clinic(final int size) {
        this.clients = new Client[size];
    }

    /**
     * Добавить клиента
     *
     * @param position
     * @param client
     */
    public void addClient(final int position, final Client client) throws ClinicException {
        if (clients.length > 0) {
            for (int i = 0; i < clients.length; i++) {
                if (clients[i] != null && client.getId().equals(clients[i].getId()))
                    throw new ClinicException("Error, duplicate client id, repeat plz");
            }
        }
        clients[position] = client;
    }


    /**
     * Поиск клиетов по кличке питомца
     *
     * @param name
     * @return
     */
    public Client[] findClientsByPetName(final String name) {
        // todo :: реализовать
        ArrayList<Client> result = new ArrayList<>();
        for (int i = 0; i < clients.length; i++) {
            if (clients[i] == null) continue;
            String n = clients[i].getPet().getName();
            if (n.equals(name)) result.add(clients[i]);
        }
        return result.toArray(new Client[result.size()]);
    }

    /**
     * Поиск питомца по имени клиента
     *
     * @param name
     * @return
     */
    public Client[] findClientsByName(final String name) {
        // todo :: реализовать
        ArrayList<Client> result = new ArrayList<>();
        for (int i = 0; i < clients.length; i++) {
            if (clients[i] == null) continue;
            String n = clients[i].getId();
            if (n.equals(name)) {
                result.add(clients[i]);
                break;
            }
        }
        return result.toArray(new Client[result.size()]);
    }

    /**
     * Редактировать имя клиента
     *
     * @param name
     * @param newName
     */
    public void editNameClient(String name, String newName) throws ClinicException {
        for (int i = 0; i < clients.length; i++) {
            if (clients[i] == null) continue;
            Client client = clients[i];
            if (client.getId().equals(name)) {
                Pet pet = client.getPet().copy();
                deleteClient(name);
                addClient(i, new Client(newName, pet));
                break;
            }
        }
    }

    /**
     * Редактировать кличку питомца
     *
     * @param name    имя клиента
     * @param newName
     */
    public void editNamePet(String name, String newName) {
        for (int i = 0; i < clients.length; i++) {
            if (clients[i] != null && clients[i].getId().equals(name)) {
                String n = clients[i].getId();
                Pet comp = clients[i].getPet();
                Pet pet;
                // нужно узнать тип
                if (comp instanceof Cat) {
                    pet = new Cat(newName);
                } else if (comp instanceof Dog) {
                    pet = new Dog(new Animal(newName));
                } else
                    pet = new CatDog(new Cat(newName), new Dog(new Animal(newName)));

                deleteClient(clients[i].getId());
                clients[i] = new Client(n, pet);
                break;
            }
        }
    }

    /**
     * Удалить клиента
     *
     * @param name
     */
    public void deleteClient(String name) {
        for (int i = 0; i < clients.length; i++) {
            if (clients[i] != null && clients[i].getId().equals(name))
                clients[i] = null;
        }
    }

    /**
     * @param name имя клиента
     */
    public void deletePetName(String name) {
        // todo :: Удалить питомца по имени ( удалить питомца нет возможности т.к final )
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < clients.length; i++) {
            if (clients[i] == null) continue;
            Client client = clients[i];
            String str = String.format("ID : %s, NAME (PEt) : %s", client.getId(), client.getPet().getName());
            result.append(str);
            result.append("\r\n");
        }
        return result.toString();
    }

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
