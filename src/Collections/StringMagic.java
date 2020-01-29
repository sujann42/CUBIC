package Collections;


class Joker{
    String name;
    Joker(String name){
        this.name= name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }



}

public class StringMagic {
    public static void main(String[] args) {
        String str1= "joker";
        String str2= "joker";
//
//        System.out.println(str1.hashCode());
//        System.out.println(str2.hashCode());


        Joker j1= new Joker("saroj");
        Joker j2= new Joker("saroj");

        System.out.println(j1.hashCode());
        System.out.println(j2.hashCode());
    }
}
