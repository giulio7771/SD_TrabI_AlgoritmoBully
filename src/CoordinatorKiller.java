
public class CoordinatorKiller extends Thread {
    // This class kills a random process every 80 seconds

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (App.coordinator != null) {
                System.out.println("The coordinator died (#" + App.coordinator.id + ").");
            }
            App.kill(App.coordinator);
        }
    }
}
