import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int firstInteger = scanner.nextInt();
        int secondInteger = scanner.nextInt();
        int divisor = scanner.nextInt();

        int count = 0;

        for (int i = firstInteger; i <=  secondInteger; i++) {
            if (i % divisor == 0) {
                count++;
            }
        }
        System.out.println(count);
        }
    }
