import java.util.Scanner;

 class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double fnum, snum, answer;
        System.out.println("Enter first num: ");
        fnum = sc.nextDouble();
        System.out.println("Enter second num: ");
        snum = sc.nextDouble();
        answer = fnum + snum;
        System.out.println(answer);


    }
}