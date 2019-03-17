
public class MasterKiller extends Thread {
    // This class kills a random process every 80 seconds

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (App.master != null) {
                System.out.println("The master died (#" + App.master.id + ").");
            }
            App.kill(App.master);
        }
    }
}
