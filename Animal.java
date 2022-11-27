public class Animal {
    private String race;
    private String sexe;
    private int age;

    public Animal(String race, String sexe, int age) {
        this.race = race;
        this.sexe = sexe;
        this.age = age;
    }

    public String getRace() {
        return this.race;
    }

    public String getSexe() {
        return this.sexe;
    }

    public int getAge() {
        return this.age;
    }

}
