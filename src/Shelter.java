import java.util.ArrayList;
import java.util.List;

public class Shelter {
    private String name;
    private List<Pet> pets;

    public Shelter(String name) {
        this.name = name;
        this.pets = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void removePet(Pet pet) {
        pets.remove(pet);
    }

    public void displayAvailablePets() {
        if (pets.isEmpty()) {
            System.out.println("No pets available for adoption at " + name);
        } else {
            System.out.println("Pets available for adoption at " + name + ":");
            for (Pet pet : pets) {
                System.out.println(pet);
            }
        }
    }
}
