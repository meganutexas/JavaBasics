public class MathMethods {
    public static void main(String[] args) {
        double circumference = getCircumference(3);
        System.out.println("Circumference: " + circumference);

        double randomNumber = getRandomBetween(3, 6);
        System.out.println("Random number: " + randomNumber);

        double max = getMax(1,2 ,3);
        System.out.println("Max: " + max);
    }

    public static double getCircumference(int radius) {
        return 2 * radius * Math.PI;
    }

    public static double getRandomBetween(int one,
                                          int two) {
        int range = Math.abs(one - two);
        int min = Math.min(one, two);

        return (Math.random() * range) + min;
    }

    public static double getMax(double one,
                                double two,
                                double three) {
        double oneTwoMax = Math.max(one, two);
        double twoThreeMax = Math.max(two, three);
        double finalMax = Math.max(oneTwoMax, twoThreeMax);

        return finalMax;
    }
}
