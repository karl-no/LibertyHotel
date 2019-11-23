package ExercicioBridge;

public abstract class Shape {

	private Color color;
	
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public void render() {
		this.draw();
		this.color.paint(this);
	}
	public abstract void draw();
	
}
