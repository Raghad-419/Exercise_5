import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        //Question 1 (Find the smallest number)
//        System.out.println("please enter first number");
//        int num1 = input.nextInt();
//        System.out.println("please enter second number");
//        int num2 = input.nextInt();
//        System.out.println("please enter third number");
//        int num3 = input.nextInt();
//
//
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(num1);
//        numbers.add(num2);
//        numbers.add(num3);
//
//        System.out.println("Smallest number is : "+findSmallest(numbers));


//        //**************************************************************
//        //Question 2(check is positive or negative or zero)
//        System.out.println("Please enter number to check if it positive or negative or zero");
//        int num = input.nextInt();
//        check(num);

        //**************************************************************
        //Question 3(check Password)
        System.out.println("Enter password");
        String password = input.nextLine();
        checkPassword(password);


    }

    //Q1
    public static int findSmallest(ArrayList<Integer> array) {
        int min = array.get(0);
        for (int a : array) {
            if (min > a)
                min = a;
        }
        return min;
    }


    //Q2
    public static void check(int num) {
        if (num > 0) {
            System.out.println(num + " is positive");
        } else if (num == 0) {
            System.out.println(num + " is Zero number");
        } else System.out.println(num + " is negative");

    }

    //Q3
    public static void checkPassword(String pass) {
        if (pass.length() >= 10) {
            if (pass.matches("[a-zA-Z0-9]+")) {
                if (pass.replaceAll("[^0-9]", "").length() >= 2) {
                    System.out.println("Good password");
                } else {
                    System.out.println("Password is invalid. It must contain at least 2 digits");
                }
            } else {
                System.out.println("Password is invalid. It must contain only letters and digits");
            }
        } else {
            System.out.println("Password is invalid. It must contain more than ten characters");
        }


    }

}

























