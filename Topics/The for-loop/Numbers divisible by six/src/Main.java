import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int counter = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < counter; i++) {
            int test = scanner.nextInt();
            if (test % 6 == 0) {
                sum += test;
            }
        }
        System.out.println(sum);
    }
}