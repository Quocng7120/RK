package Test9.entity;

public class Car {

	private String name;
	private String type;
	private Engine engine;

	public Car(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}


	@Override
	public String toString() {
		return "Car Name: " + name + "\n" +
				"Car type: " + type + "\n" +
				"Car Engine: " + engine + "\n";
	}

	public class Engine {

		private String engineType;

		public String getEngineType() {
			return engineType;
		}

		public void setEngineType(String engineType) {
			this.engineType = engineType;
		}

		@Override
		public String toString() {
			return engineType;
		}
	}

}
