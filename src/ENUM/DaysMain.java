package ENUM;



 enum  Days {
    MON, TUES, WED, THUR, FRI, SAT;
}

public class DaysMain {
    public static void main(String[] args) {
        //in one java file we can have only one public class
        Days d;
//        d= Days.WED;
        d= Days.FRI;
        d= Days.SAT;
        if (d==Days.SAT){
            System.out.println(d);
        }
        System.out.println(d.ordinal());

    }
}
