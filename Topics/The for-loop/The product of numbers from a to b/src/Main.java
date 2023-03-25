import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        long pro = 1L;

        for (int a = first; a < second; a++) {
            pro *= a;
        }
        System.out.println(pro);

    }
}