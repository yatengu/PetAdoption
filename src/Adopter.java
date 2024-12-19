public class Adopter {
    private String name;
    private int age;
    private double budget;

    public Adopter(String name, int age, double budget) {
        this.name = name;
        this.age = age;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getBudget() {
        return budget;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public boolean canAdopt(Pet pet) {
        return this.budget >= pet.getAdoptionFee();
    }

    @Override
    public String toString() {
        return "Adopter{name='" + name + "', age=" + age + ", budget=" + budget + "}";
    }
}
