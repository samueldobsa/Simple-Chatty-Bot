import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        String string = scanner.nextLine();
        String string2 = scanner.nextLine();

        boolean compare = string.replaceAll("\\s", "").equalsIgnoreCase(string2.replaceAll("\\s", ""));

        System.out.println(compare);

    }
}