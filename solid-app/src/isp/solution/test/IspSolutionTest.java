package isp.solution.test;

import isp.solution.IHuman;
import isp.solution.IWorker;
import isp.solution.Manager;
import isp.solution.Robot;

public class IspSolutionTest {

	public static void main(String[] args) {
		atTheCafeteria(new Manager());
		atTheWorkStation(new Manager());
		
		atTheWorkStation(new Robot());
	}
	
	public static void atTheCafeteria(IHuman w){
		System.out.println("At the cafeteria");
		w.startEat();
		w.stopEat();
	}
	public static void atTheWorkStation(IWorker w) {
		System.out.println("At the WorkStation");
		w.startWork();
		w.stopWork();
	}
}
