package classwork;

public class Triangle2 extends GeometricFigure2 implements SidedObject{
	
	public Triangle2(double height, double width){
		type="Triangle";
		this.height=height;
		this.width=width;
		area=(height*width)/2;
	}
	public String displaySides(){
		return type + " has 3 sides";
	}
	public double getArea(){
		return area;
	}

}

