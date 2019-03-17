
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class App {

    public static List<Process> processes = new LinkedList<>();
    public static Deque<Long> availableIds = new ArrayDeque<>();
    public static long nextId = (long) 1;
    public static Process master;

    public static void main(String[] args) {
        Generator generator = new Generator();
        ProcessKiller killer = new ProcessKiller();
        generator.start();
        killer.start();

    }

    public static void election() {

    }

}
