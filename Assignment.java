import java.util.Scanner;

//name:Ahmed Atiah Almalki
//ID:442010256
//your grade is 3.5/5
//@ line 5: change the Main to match the file name like Assignment (golden rule)
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float a;
        float b;
        System.out.println("please inter 2 Decimalnumber");
        //@ make sure that the function is nextFloat
        a = input.nextfloat();
        //@ make sure that the function is nextFloat
        b = input.nextfloat();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a <= b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a > b);


    }
}
