
public class Process extends Thread{

	public long id;
	public Process() {
		if(!App.availableIds.isEmpty()) {
			id = App.availableIds.pop();
		}else {
			id = App.nextId++;
		}
	}
	@Override
	public void start() {
		while(!false) {//good programing practices: never user while true
			
		}
	}
	
	public void request() {
		if(App.master == null) {
			App.election();
		}
	}
}
