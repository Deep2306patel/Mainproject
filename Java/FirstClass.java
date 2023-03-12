import java.util.*;

class FirstClass{
    public static void main(String args[]) {
        // system.out.print("pass string or output"); //// <--------- output
        System.out.println("hello");
        System.out.print("world");
        // variables
        String name = "world";
        int a = 21;
        System.out.print(name);
        System.out.print(a);
        // input
        Scanner sc = new Scanner(System.in);
        String name2 = sc.nextLine();
        System.out.println(name2);
    }
}

