package day1;

import java.util.Scanner;

public class TriangleClassifications {

	public static void main(String[] args) {
        int x, y, z;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the side of x: ");
        x = s.nextInt();
        System.out.println("Enter the side of y: ");
        y = s.nextInt();
        System.out.println("Enter the side of z: ");
        z = s.nextInt();

        String classification = classifyTriangle(x, y, z);

        System.out.println("The triangle with sides " + x + ", " + y + ", " + z + " is " + classification);
    }
	 public static String classifyTriangle(int x, int y, int z) {
	        if (x + y <= z || x + z <= y || y + z <= x) {
	            return "Not a triangle";
	        }

	        if (x == y && y == z) {
	            return "Equilateral";
	        }

	        if (x == y || x == z || y == z) {
	            return "Isosceles";
	        }

	        return "Scalene";
	    }
	}




