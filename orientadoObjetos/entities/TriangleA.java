package orientadoObjetos.entities;

public class TriangleA {
	
	public double a;
	public double b;
	public double c;
			
	public double area() {
		
		/*double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return area;	*/
		double p = (a + b + c) / 2.0;		
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
		
		
	}
	
		
	
		
	
}
