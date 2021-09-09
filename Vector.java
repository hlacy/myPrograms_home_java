package myPrograms;

import java.util.Arrays;

public class Vector
{
	private double x2;
	private double y2;
	private double z2;
	public  Vector(double x1, double y1, double z1)
	{
		this.x2 = x1;
		this.y2 = y1;
		this.z2 = z1;
		/*double x2 = x;
		double y2 = y;
		double z2 = z;*/
	}
	public double length()
	{
		return(Math.sqrt(x2 * x2 + y2 * y2 + z2 * z2));
	}
	public static Vector[] generate(int n)
	{
		Vector[] vectors = new Vector[n];
		for (int i = 0; i < n; i++)
		{
			vectors[i] = new Vector(3, 4, 5);
		}
		return vectors;
	}
	public static void main(String[] str)
	{
		Vector[] vectors = Vector.generate(5);
		System.out.println(vectors[1].length());
	}
}
