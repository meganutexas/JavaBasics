public class StaticMethods {
    public static void main(String[] args) {
        printEgg();
        System.out.println();
        printTeaCup();
        System.out.println();
        printStopSign();
        System.out.println();
        printHat();
    }

    public static void printEgg() {
        printEggTop();
        printEggBottom();
    }

    public static void printTeaCup() {
        printEggBottom();
        printBreakLine();
    }

    public static void printStopSign() {
        printEggTop();
        System.out.println("|  STOP  |");
        printEggBottom();
    }

    public static void printHat() {
        printEggTop();
        printBreakLine();
    }

    public static void printEggTop() {
        System.out.println("  ______") ;
        System.out.println(" /      \\");
        System.out.println("/        \\");
    }

    public static void printEggBottom() {
        System.out.println("\\        /");
        System.out.println(" \\______/");
    }

    public static void printBreakLine() {
        System.out.println("+--------+");
    }
}
