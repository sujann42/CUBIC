package Hashcode;

public class Joker {
    String name;
    Joker(String name){
        this.name= name;
    }

    public void show(){
        System.out.println("name"+ name);
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Joker joker = (Joker) o;
//        return Objects.equals(name, joker.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }

    public static void main(String[] args) {
        Joker j1= new Joker("saroj");
        Joker j2= new Joker("bhatte");
       // Joker j2= new Joker("pathak bhalu");
        System.out.println(j1.hashCode());
        System.out.println(j2.hashCode());
    }
}
