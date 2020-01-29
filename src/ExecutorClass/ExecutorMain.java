package ExecutorClass;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorMain {
    public static void main(String[] args) {


        Executor e1 = new Executor("saroj");
        Executor e2 = new Executor("sunil");
        Executor e3 = new Executor("arjun");
        Executor e4 = new Executor("rohsan");
        Executor e5 = new Executor("malu");


        ExecutorService service = Executors.newFixedThreadPool(2);
        service.execute(e1);
        service.execute(e2);
        service.execute(e3);
        service.execute(e4);
        service.execute(e5);


    }

}
