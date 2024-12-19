public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Bella", "Golden Retriever", 299.99);
        Pet pet2 = new Pet("Whiskers", "Siamese Cat", 149.99);
        Pet pet3 = new Pet("Max", "Beagle", 199.99);
        Shelter shelter = new Shelter("Happy Paws Shelter");
        shelter.addPet(pet1);
        shelter.addPet(pet2);
        shelter.addPet(pet3);
        shelter.displayAvailablePets();
        Adopter adopter = new Adopter("Alice", 30, 200.00);
        System.out.println(adopter);
        System.out.println("Can " + adopter.getName() + " adopt " + pet1.getName() + "? " + adopter.canAdopt(pet1));
        System.out.println("Can " + adopter.getName() + " adopt " + pet2.getName() + "? " + adopter.canAdopt(pet2));
    }
}
