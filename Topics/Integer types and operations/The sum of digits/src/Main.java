import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int x = scanner.nextInt();
        System.out.println(x / 100 + (x / 10) % 10 + x % 10);

    }
}