package classwork;

public class Square extends GeometricFigure{
	
	public Square(double height, double width){
		type="Square";
		this.height=height;
		this.width=width;
		area=height*width;
	}
	public double getArea(){
		return area;
	}

}
