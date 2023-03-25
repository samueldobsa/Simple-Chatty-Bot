import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        String reads = scanner.nextLine();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for ( ; a <= b; a++){
            System.out.print(reads.charAt(a));
        }

    }
}