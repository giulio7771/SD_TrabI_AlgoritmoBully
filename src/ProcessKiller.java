
import java.util.Random;

public class ProcessKiller extends Thread {

    @Override
    public void start() {
        while (true) {
            try {
                Thread.sleep(80000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Random r = new Random();
            long sequence = r.nextInt(App.processes.size()) + 1;
            Process process = App.processes.get((int) sequence);
            if (process == App.master) {
                App.master = null;
            }
            App.processes.remove(process);
        }
    }
}
