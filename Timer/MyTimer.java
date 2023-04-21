import java.util.Timer;
import java.util.TimerTask;

public class MyTimer {
    public static void main(String[] args) {
        Timer timer = new Timer();
        int delay = 5000; // delay for 5 seconds
        int period = 1000; // repeat every 1 second

        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                // Your code to be executed every second goes here
                System.out.println("Timer is running...");
            }
        }, delay, period);
    }
}
//This timer will run every second and print out "Timer is running..." to the console. You can modify the delay and period variables to change how often the timer runs. The scheduleAtFixedRate method takes in a TimerTask object that defines what code to run, and the delay and period parameters determine when and how often the code runs.





