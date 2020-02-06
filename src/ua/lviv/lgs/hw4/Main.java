package ua.lviv.lgs.hw4;

public class Main {

	public static void main(String[] args) {
		// Завдання 1
		Robot robot = new Robot();
		CoffeRobot robot2 = new CoffeRobot();
		RobotDancer robot3 = new RobotDancer();
		RobotCoocker robot4 = new RobotCoocker();
		robot.work();
		robot2.work();
		robot3.work();
		robot4.work();

		Robot a[] = { robot, robot2, robot3, robot4 };
		for (int i = 0; i < a.length; i++) {
			a[i].work();
		}

		// Завдання 2
		Car car = new Car("Тойота", new Helm(25), new Wheel(30), new Body(300));
		car.plusmarkaCar("-Авенсіс");
		car.doubl();

		// Завдання 3
		Anymal anymal = new Anymal("Леопард", 25, 5);
		System.out.println("Назва тварини = " + anymal.getNameAnymal()+ ", Швидкість тварини = " + anymal.getvAnymal() + " км/год, Вік тварини = " + anymal.getAgAnymal() + " років");
		anymal.setNameAnymal("Бик");
		anymal.setvAnymal(5);
		anymal.setAgAnymal(3);
		System.out.println("Назва тварини = " + anymal.getNameAnymal()+ ", Швидкість тварини = " + anymal.getvAnymal() + " км/год, Вік тварини = " + anymal.getAgAnymal() + " років");
		
	}

}
