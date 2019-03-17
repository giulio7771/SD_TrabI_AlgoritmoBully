
public class Process {

    public long id;

    public Process() {
        if (!App.availableIds.isEmpty()) {
            id = App.availableIds.pop();
        } else {
            id = App.nextId++;
        }
    }
}
