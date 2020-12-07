import java.util.Scanner;

public class Lesson7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the season number : ");
        int num = sc.nextInt();
        if (num < 1 || num > 4)
            System.out.println("There is no such season!");
        else if (num == 1)
            System.out.println("Season is Winter, Month are : January,February,March");
        else if (num == 2)
            System.out.println("Season is Spring, Month are : April,May,June");
        else if (num == 3)
            System.out.println("Season is Summer, Month are : July,August,September");
        else
            System.out.println("Season is Autumn, Month are : October,November,December");




    }
}
