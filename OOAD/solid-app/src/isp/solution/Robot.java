package isp.solution;

public class Robot implements IWorker{

	@Override
	public void startWork() {

		System.out.println("Robot Starts Working...");
	}

	@Override
	public void stopWork() {
	
		System.out.println("Robot Stops Working...");
	}

}
