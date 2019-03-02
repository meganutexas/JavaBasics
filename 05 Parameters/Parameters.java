public class Parameters {
    public static void main(String[] args) {
        printAge(25);

        printAverage(5, 10);

        printAverage(1, 2, 3);
    }

    public static void printAge(int age) {
        System.out.println(
                "I am " + age + " years old"
        );
    }

    public static void printAverage(double one,
                                    double two) {
        double average = (one + two) / 2;
        System.out.println("Average: " + average);
    }

    public static void printAverage(double one,
                                    double two,
                                    double three) {
        double average = (one + two + three) / 3;
        System.out.println("Average: " + average);
    }
}
