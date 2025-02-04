package exo_1;

	public class Circle
	{
	    private double radius;
	    private String color;
	    
	    public Circle() 
	    {
	        radius = 1.0;
	        color = "rouge";
	    }
	    
	    public Circle(double r) 
	    {
	        this.radius = r;
	        color = "rouge";
	    }
	    
	    public double getRadius() 
	    {
	    	return radius;
	    }
	    
	    public void setRadius(double radius) 
	    {
	        this.radius = radius;
	    }
	    
	    public double getArea() 
	    {
	        return Math.PI * radius * radius;
	    }
	    
	    public double getCircumference() 
	    {
	        return 2 * Math.PI * radius;
	    }
	}
