package Task;

import static java.lang.Math.round;

public class Triangle {

    private final double[][] cordinate;
    private int tmpLenght;
    private int[] evenNumbers;

    public Triangle() {
        this.cordinate = new double[3][2];
        this.evenNumbers = new int[5];
        this.tmpLenght = 0;
    }

    public double[][] getCordinate() {
        return cordinate;
    }

    public void setCordinate(double pointX, double pointY) {
        int count = 0;
        for (int i = tmpLenght; i < this.cordinate.length; i++) {
            this.cordinate[i][count] = pointX;
            this.cordinate[i][++count] = pointY;
            break;
        }
        this.tmpLenght++;
    }

    public double[] getLengthSides() {

        double ab = Math.abs(Math.sqrt(Math.pow((this.cordinate[1][0] - this.cordinate[0][0]), 2)
                + Math.pow((this.cordinate[1][1] - this.cordinate[0][1]), 2)));

        double ac = Math.abs(Math.sqrt(Math.pow((this.cordinate[2][0] - this.cordinate[0][0]), 2)
                + Math.pow((this.cordinate[2][1] - this.cordinate[0][1]), 2)));

        double bc = Math.abs(Math.sqrt(Math.pow((this.cordinate[2][0] - this.cordinate[1][0]), 2)
                + Math.pow((this.cordinate[2][1] - this.cordinate[1][1]), 2)));

        double[] arrTemp = {ab, ac, bc};

        return arrTemp;

    }

    public boolean isRight() {

        double hypotenuse = 0;
        double sides[] = getLengthSides();

        for (int i = 0; i < sides.length; i++) {

            if (sides[i] > hypotenuse) {
                hypotenuse = sides[i];
            } else if (sides[i] > hypotenuse) {
                hypotenuse = sides[i];
            } else if (sides[i] > hypotenuse) {
                hypotenuse = sides[i];
            }

        }

        if (sides[0] == hypotenuse && (Math.pow(sides[1], 2) + Math.pow(sides[2], 2)) == Math.pow(sides[0], 2)) {
            return true;
        } else if (sides[1] == hypotenuse && (Math.pow(sides[0], 2) + Math.pow(sides[2], 2)) == Math.pow(sides[1], 2)) {
            return true;
        } else {
            if (sides[2] == hypotenuse && (Math.pow(sides[0], 2) + Math.pow(sides[1], 2)) == Math.pow(sides[2], 2)) {
                return true;
            }
        }

        return false;

    }

    public boolean isIsosceles() {

        double sides[] = getLengthSides();

        for (int i = 0; i < sides.length - 1; i++) {
            for (int j = 1; j < sides.length; j++) {
                if (sides[i] == sides[j]) {
                    return true;
                }
            }
        }

        return false;

    }

    public boolean isEquilateral() {

        double sides[] = getLengthSides();

        if (sides[0] == sides[1] && sides[0] == sides[2]) {
            return true;
        }
        return false;

    }

    public double getPerimeter() {

        double sides[] = getLengthSides();
        return sides[0] + sides[1] + sides[2];

    }

    public int[] getEvenNumbers() {

        int count = 0;
        for (int i = 0; i < round(getPerimeter()); i++) {
            if (count != this.evenNumbers.length) {
                if ((i & 1) == 0) {
                    this.evenNumbers[count++] = i;
                }
            } else {
                expandArray();
            }
        }

        return this.evenNumbers;
    }

    private void expandArray() {

        int temp[] = new int[this.evenNumbers.length * 2];
        
        for(int i=0;i<this.evenNumbers.length;i++){
            
            temp[i] =this.evenNumbers[i];
            
        }
        
        this.evenNumbers = temp;
    }

}
