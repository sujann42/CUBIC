package StreamsAPI;


import java.util.stream.Stream;

class JCustomer implements Comparable<JCustomer> {
    private String name;
    private String email;
    private int age;

    public JCustomer(String name, String email, int age){
        this.name=name;
        this.email= email;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "JCustomer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }



    @Override
    public int compareTo(JCustomer o) {
        return o.age-this.age;
    }
}


public class SortingViaMap {
    public static void main(String[] args) {

            Stream<JCustomer> customers= Stream.of(new JCustomer("sunil","sunilniroula1@gmail.com",25),
                    new JCustomer("bimal", "pathak@gmail.com", 22),
                    new JCustomer("yubaraj", "bhatte@gmail.com", 25) );


            //customers.sorted().forEach(System.out::println);
            //if you run as this then it will give you the class cast exception
            customers.sorted((c1, c2)->c1.getName().compareTo(c2.getName())).forEach(System.out::println);


    }

}
