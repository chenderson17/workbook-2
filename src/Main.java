import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Please enter a game score: ");
        String res = scanner.nextLine();
        String[] arr = res.split("\\|");
        int home = Integer.parseInt(arr[1].split(":")[0]);
        int visitor = Integer.parseInt(arr[1].split(":")[1]);
        String[] teamArr = arr[0].split(":");
        if(home > visitor){
            System.out.printf("Winner: %s",teamArr[0]);
        }
        else{
            System.out.printf("Winner: %s",teamArr[1]);
        }
    }
}