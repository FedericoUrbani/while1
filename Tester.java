import java.sql.Time;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Tester {
    public static void main(String[] args) {

        while (true){
            System.out.println("i am in loop");
            try {
                TimeUnit.SECONDS.sleep(1);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }

    }

}
