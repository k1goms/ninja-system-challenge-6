package model;

public record NinjaDTO(String name, int age, String village) {
    public NinjaDTO(Ninja ninja) {
        this(
                ninja.getName(),
                ninja.getAge(),
                ninja.getVillage()
        );
    }

    @Override
    public String toString() {
        return "NINJA DATA" + " | Name: " + name + " | Age: " + age + " |  Village: " + village;
    }
}
