import java.util.Scanner;
public class Switch_test {
    public static void main(String[] args) {
        System.out.println("Hello");

        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();

        switch(a){
            case "a":
                System.out.println("a");
                break;
            case "b":
                System.out.println("b");
                break;
            default:
                System.out.println("c");
                break;
        }

    }
}