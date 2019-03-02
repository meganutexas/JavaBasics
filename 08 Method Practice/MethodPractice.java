public class MethodPractice {
    public static void main(String[] args) {
        double circleArea = getCircleArea(3);
        System.out.println("Circle Area: " + circleArea);

        double squareArea = getSquareArea(4);
        System.out.println("Square Area: " + squareArea);

        double minOf3 = getMin(1, 2, 3);
        System.out.println("Min of 3: " + minOf3);

        double minOf4 = getMin(1, 2, 3, 4);
        System.out.println("Min of 4: " + minOf4);

        printSum(1, 2, 3);

        printTriangleArea(1, 3);
    }

    public static double getCircleArea(int radius) {
        double radiusSquared = Math.pow(radius, 2);
        return radiusSquared * Math.PI;
    }

    public static double getSquareArea(int sideLength) {
        return sideLength * sideLength;
    }

    public static double getMin(double one,
                                double two,
                                double three) {
        double oneTwoMin = Math.min(one, two);
        double twoThreeMin = Math.min(two, three);
        double finalMin = Math.min(oneTwoMin, twoThreeMin);

        return finalMin;
    }

    public static double getMin(double one,
                                double two,
                                double three,
                                double four) {
        double minOfFirstThree = getMin(one, two, three);
        double finalMin = Math.min(minOfFirstThree, four);

        return finalMin;
    }

    public static void printSum(int one,
                                int two,
                                int three) {
        int sum = one + two + three;
        System.out.println("Sum: " + sum);
    }

    public static void printTriangleArea(double length,
                                         double height) {
        double areaOfTriangle = (length * height) / 2;
        System.out.println("Area of Triangle: " + areaOfTriangle);
    }
}
