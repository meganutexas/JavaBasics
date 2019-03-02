public class ReturnValues {
    public static void main(String[] args) {
        int perimeter = getSquarePerimeter(4);
        System.out.println("Perimeter: " + perimeter);

        System.out.println(
                "Area of Rectangle: " + getAreaOfRectangle(4, 5)
        );

        double average = getAverage(1, 2, 3);
        System.out.println("Average: " + average);
    }

    public static int getSquarePerimeter(int sideLength) {
        int perimeter = sideLength * 4;
        return perimeter;
    }

    public static double getAreaOfRectangle(double height,
                                            double width) {
        return height * width;
    }

    public static double getAverage(double one,
                                    double two,
                                    double three) {
        double average;
        average = (one + two + three) / 3;
        return average;
    }
}
