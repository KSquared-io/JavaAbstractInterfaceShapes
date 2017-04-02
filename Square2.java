package classwork;

public class Square2 extends GeometricFigure2 implements SidedObject{
	
	public Square2(double height, double width){
		type="Square";
		this.height=height;
		this.width=width;
		area=height*width;
	}
	public String displaySides(){
		return type + " has 4 sides";
	}
	public double getArea(){
		return area;
	}

}
