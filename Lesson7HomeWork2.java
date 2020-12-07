import java.util.Scanner;

public class Lesson7HomeWork2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter numerically : ");
        int num = sc.nextInt();
        if (num % 2 == 0)
            System.out.println("Number is even");
        else if (num % 2 == 1)
                System.out.println("Number is odd");




    }
}
