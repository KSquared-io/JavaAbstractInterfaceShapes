package classwork;

public class UseGeometric2 {
	public static void main(String[] args){
		GeometricFigure2[] shapes = {new Square2(3,3), new Triangle2(4,4), new Square2(5,5), new Triangle2(6,6)};
		
		for(int i = 0; i < shapes.length; i++){
			System.out.println(shapes[i].type +"-- Height: " 
					+ shapes[i].height+" Width: " + shapes[i].width+"Area: " 
					+ shapes[i].getArea()+" Sides: "+ shapes[i].displaySides() +"\n");
			
		}
		
		
	}
}
