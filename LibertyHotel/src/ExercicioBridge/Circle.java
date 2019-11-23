package ExercicioBridge;

public class Circle extends Shape{

	@Override
	public void draw() {
		System.out.println("Desenhei um círculo.");
		
	}

	@Override
	public String toString() {
		return "círculo";
	}
	
}
