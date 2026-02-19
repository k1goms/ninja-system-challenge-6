package model;

public final class Ninja {

    private String name;
    private int age;
    private String village;

    public Ninja() {}

    public Ninja(String name, int idade, String vila) {
        this.name = name;
        this.age = idade;
        this.village = vila;
    }

    public Ninja(NinjaDTO ninjaDTO) {
        this.name = ninjaDTO.name();
        this.age = ninjaDTO.age();
        this.village = ninjaDTO.village();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    @Override
    public String toString() {
        return "NINJA DATA" + " | Name: " + name + " | Idade: " + age + " |  Vila: " + village;
    }
}
