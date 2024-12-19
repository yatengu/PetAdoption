public class Pet {
    private String name;
    private String breed;
    private double adoptionFee;

    public Pet(String name, String breed, double adoptionFee) {
        this.name = name;
        this.breed = breed;
        this.adoptionFee = adoptionFee;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public double getAdoptionFee() {
        return adoptionFee;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAdoptionFee(double adoptionFee) {
        this.adoptionFee = adoptionFee;
    }

    public boolean isCheaperThan(Pet other) {
        return this.adoptionFee < other.adoptionFee;
    }

    @Override
    public String toString() {
        return "Pet{name='" + name + "', breed='" + breed + "', adoptionFee=" + adoptionFee + "}";
    }
}
