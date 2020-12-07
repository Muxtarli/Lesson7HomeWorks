import java.util.Scanner;

public class Lesson7HomeWork1SwitchCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the season number : ");
        int num = sc.nextInt();
        switch (num) {
            case 1 :
                System.out.println("Season is Winter, Month are : January,February,March");
                break;
            case 2 :
                System.out.println("Season is Spring, Month are : April,May,June");
                break;
            case 3 :
                System.out.println("Season is Summer, Month are : July,August,September");
                break;
            case 4 :
                System.out.println("Season is Autumn, Month are : October,November,December");
                break;
            default :
                System.out.println("Input is wrong!");
        }

    }
}
