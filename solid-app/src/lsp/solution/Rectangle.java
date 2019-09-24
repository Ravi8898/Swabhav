package lsp.solution;

public class Rectangle implements IShape{

	private int width;
	private int height;

	public Rectangle(int height, int width) {
		
		this.height=height;
		this.width=width;
		
	}
	
	@Override
	public int calculateArea() {
		return height*width;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	
}
