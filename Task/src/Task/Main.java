
package Task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        
        Scanner in = new Scanner(System.in);

        Triangle triangle = new Triangle();

        for (int i = 0; i < triangle.getCordinate().length; i++) {

            if (i == 0) {
                System.out.println("Enter coordinate x of dot A:");
                double x = in.nextDouble();
                System.out.println("Enter coordinate y of dot A:");
                double y = in.nextDouble();
                triangle.setCordinate(x, y);
            } else if (i == 1) {
                System.out.println("Enter coordinate x of dot B:");
                double x = in.nextDouble();
                System.out.println("Enter coordinate y of dot B:");
                double y = in.nextDouble();
                triangle.setCordinate(x, y);
            } else {
                System.out.println("Enter coordinate x of dot C:");
                double x = in.nextDouble();
                System.out.println("Enter coordinate y of dot C:");
                double y = in.nextDouble();
                triangle.setCordinate(x, y);
            }

        }

        System.out.println("\nLenght of AB is: \'" + triangle.getLengthSides()[0] + "\'");
        System.out.println("Lenght of AC is: \'" + triangle.getLengthSides()[1] + "\'");
        System.out.println("Lenght of BC is: \'" + triangle.getLengthSides()[2] + "\'\n");

        if (triangle.isRight()) {
            System.out.println("Triangle IS \'Right\'");
        } else {
            System.out.println("Triandle IS NOT \'Right\'");
        }
        
        if (triangle.isIsosceles()) {
            System.out.println("Triangle IS \'Isosceles\'");
        } else {
            System.out.println("Triandle IS NOT \'Isosceles\'");
        }
        
        if (triangle.isEquilateral()) {
            System.out.println("Triangle IS \'Equilateral\'\n");
        } else {
            System.out.println("Triandle IS NOT \'Equilateral\'\n");
        }
        
        System.out.println("Perimeter: "+triangle.getPerimeter());
        
        System.out.println("\nParity numbers in range from 0 to triangle perimeter:");
        
        int[] evenNum = triangle.getEvenNumbers();
        int count = 0;
        for(int i =0; i< evenNum.length-1;i++){
            if(evenNum[i+1] != 0){
                System.out.println(evenNum[i]);
                count++;
            }
        }
        System.out.println(evenNum[count]);
  
    }

}
