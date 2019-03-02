public class StringMethods {
    public static void main(String[] args) {
        String name = "Megan";
        String upperCase = name.toUpperCase();

        System.out.println("My name is: " + name);
        System.out.println("Upper case version: " + upperCase);

        String meg = "Meg";
        boolean startsWithMeg = name.startsWith(meg);
        System.out.println("Starts with Meg: " + startsWithMeg);

        String sub = name.substring(1, 4);
        System.out.println("Sub: " + sub);

        char charAt3 = name.charAt(3);
        System.out.println("Char at 3: " + charAt3);
    }
}
