package standard;

import java.util.Date;

public class TimeCounter {
    static long time = 0;
    public static void start(){
        time = new Date().getTime();
    }
    public static void finish(){
        System.out.println("Time: " + (new Date().getTime() - time));
    }
}
