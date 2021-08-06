package Test9.backend;


import Test9.entity.CPU;
import Test9.entity.Car;

public class InnerClass {

	//Q1:

	public void Q1() {

		CPU cpu = new CPU(250);
		CPU.Ram ram = cpu.new Ram(16, "HP");
		CPU.Processor processor = cpu.new Processor(4, "Dell");

		System.out.println(ram.getClockSpeed());
		System.out.println(processor.getCache());
	}

	//Q2:

	public void Q2() {

		Car car = new Car("Mazda", "8WD");
		Car car1 = new Car("Vinfast", "Lux");

		Car.Engine engine = car.new Engine();
		engine.setEngineType("Crysler");
		Car.Engine engine1 = car1.new Engine();
		engine1.setEngineType("BMW");

		car.setEngine(engine);
		car1.setEngine(engine1);

		System.out.println(car.toString());
		System.out.println(car1.toString());
	}
}
