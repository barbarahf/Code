import java.util.TimerTask;
import java.util.Timer;
import java.util.TimerTask;

class Time {

    public static void main(String[] args) {
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {//Clase anonima

            @Override
            public void run() {
                System.out.println("Tarea completa");
            }

        };
        timer.schedule(task, 8000);
    }
    //timer.schedule(task,0);
}