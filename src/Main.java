import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        FirstTask firstTask = new FirstTask();
//        Scanner in = new Scanner(System.in);
//        firstTask.getPassportsByFirstName(in.next());

        SecondTask secondTask = new SecondTask();
        String a = "title";
        String b = "paper";
        System.out.println(secondTask.isIsomorphic(a,b));
    }
}
