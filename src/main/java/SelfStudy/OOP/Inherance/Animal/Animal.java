package SelfStudy.OOP.Inherance.Animal;

public class Animal {
    int body;
    String name;
    int size;
    int weight;

    public Animal(int body, String name, int size, int weight) {
        this.body = body;
        this.name = name;
        this.size = size;
        this.weight = weight;
    }

    public int getBody() {
        return body;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
