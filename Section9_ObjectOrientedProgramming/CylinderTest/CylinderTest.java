package cylindertest;


class Cylinder{
	
	private double radius;
	private double height;
	
	public Cylinder() {
		
		radius = 1;
		height = 1;
	}
	
	public Cylinder(double r, double h) {
		
		setRadius(r);
		setHeight(h);
	}
	
	public double getRadius() {
		
		return radius;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setRadius(double r) {
		if(r >= 0) {
			radius = r;
		}
		else {
			radius = 0;
		}
		
	}
	
	public void setHeight(double h) {
		if(h >= 0) {
			height = h;
		}
		else {
			height = 0;
		}
		
	}
	
	public void setDimensions(int h,int r) {
    
        height=h;
        radius=r;
    }
	
	
	public double lidArea() {
		
		double a;
		a = Math.PI * radius * height;
		return a;
	}
	
	public double perimeter() {
		double p;
		p = 2 * Math.PI * radius;
		return p;
	}
	
	 public double drumArea() {
		 double dr;
		 dr = 2*lidArea()+perimeter()*height;
	     return dr; 
	 }
	 
	 public double volume() {
		 double v;
		 v = lidArea()*height;
	     return v;
	 }
	
}

public class CylinderTest {

	public static void main(String[] args) {
		

		Cylinder c = new Cylinder();
		
		
		c.setRadius(5);
		c.setHeight(5);
		c.setDimensions(5, 10);
		
		System.out.println("LidArea: " + c.lidArea());
        System.out.println("Circumference: " + c.perimeter());
        System.out.println("totalSurfaceArea: " + c.drumArea());
        System.out.println("Volume: " + c.volume());
        System.out.println("Height: " + c.getHeight());
        System.out.println("Radius: " + c.getRadius());
		
		
		
		

	}

}
