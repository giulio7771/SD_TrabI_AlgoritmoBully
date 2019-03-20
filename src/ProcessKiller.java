
import java.util.Random;

public class ProcessKiller extends Thread {
    // This class kills a random process every 80 seconds

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(80000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Random r = new Random();
            long sequence = r.nextInt(App.processes.size());
            Process process = App.processes.get((int) sequence);
            boolean isMaster = process == App.coordinator;
            App.kill(process);
            System.out.println("The process #" + process.id + " was terminated" + (isMaster ? " and it was the coordinator." : "."));
        }
    }
}
