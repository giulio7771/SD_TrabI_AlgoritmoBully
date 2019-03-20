
public class CordinatorKiller extends Thread {
    // This class kills a random process every 80 seconds

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (App.cordinator != null) {
                System.out.println("The cordinator died (#" + App.cordinator.id + ").");
            }
            App.kill(App.cordinator);
        }
    }
}
