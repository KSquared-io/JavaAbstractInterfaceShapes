package classwork;

public class UseGeometric {
	public static void main(String[] args){
		GeometricFigure[] shapes = {new Square(3,3), new Triangle(4,4), new Square(5,5), new Triangle(6,6)};
		
		for(int i = 0; i < shapes.length; i++){
			System.out.println(shapes[i].type +"-- Height: " + shapes[i].height
					+" Width: " + shapes[i].width 
					+"Area: " + shapes[i].getArea()+"\n");
			
		}
		
		
	}
}
