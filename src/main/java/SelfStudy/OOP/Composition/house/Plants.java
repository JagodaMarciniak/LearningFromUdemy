package SelfStudy.OOP.Composition.house;

public class Plants {
    private String name;
    private String color;
    private int liveDuration;

    public Plants(String name, String color, int liveDuration) {
        this.name = name;
        this.color = color;
        this.liveDuration = liveDuration;
    }
    public void waterPlants (){
        System.out.println("Plants --> watered");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
