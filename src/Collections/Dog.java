package Collections;

public class Dog implements Comparable<Dog>{
    private String name;
    private String color;

    public Dog(String name, String color){
        this.color= color;
        this.name=name;
    }


    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int compareTo(Dog d){
        return this.name.compareTo(d.name);
    }
}
