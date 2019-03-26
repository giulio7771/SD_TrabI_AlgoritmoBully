
import java.util.Random;

public class RequestMaker extends Thread {
//This class makes a request every 25 seconds

    @Override
    public void run() {
        while (!false) {
            App.processesLock.lock();
            try {
                //good programing practices: never use while true
                Random random = new Random();
                long sequence = random.nextInt(App.processes.size());
                Process requester = App.processes.get((int) sequence);
                App.request(requester);
            } finally {
                App.processesLock.unlock();
            }
            try {
                Thread.sleep(25000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
