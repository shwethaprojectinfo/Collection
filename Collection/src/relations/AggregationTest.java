package relations;

	import java.util.*;

	class Wheel {
		String brand;
		
	 Wheel (String brand) {
			this.brand = brand;
		}
	}

	class Car {
	    String model;
	    List<Wheel> wheels;
	    
	    Car (String model, List<Wheel> wheels) {
	    	this.model = model;
	    	this.wheels = wheels;
	    }
	    
	    void display() {
	    	System.out.print(this.model+ " has following wheels: ");
	    	for (Wheel wheel: this.wheels) {
	    		System.out.print(wheel.brand+ " ");
	    	}
	    }
	}

	 class AggregationTest {
		public static void main(String[] args) {
			Wheel wheel1 = new Wheel("Michelin");
			Wheel wheel2 = new Wheel("MRF");
			
			List<Wheel> list = new ArrayList<>();
			list.add(wheel1);
			list.add(wheel2);
			
		    Car car = new Car("Tata",list);	
			
			car.display();
		}
	}


