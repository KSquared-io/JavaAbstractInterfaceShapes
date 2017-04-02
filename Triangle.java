package classwork;

public class Triangle extends GeometricFigure{
	
	public Triangle(double height, double width){
		type="Triangle";
		this.height=height;
		this.width=width;
		area=(height*width)/2;
	}
	public double getArea(){
		return area;
	}

}

