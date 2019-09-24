package isp.violetion.test;

import isp.violetion.IWorker;
import isp.violetion.Manager;
import isp.violetion.Robot;

public class IspViolationTest {

	public static void main(String[] args) {
		atTheCafeteria(new Manager());
		atTheWorkStation(new Manager());
		
		atTheCafeteria(new Robot());
		atTheWorkStation(new Robot());
	}
	
	public static void atTheCafeteria(IWorker w){
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
