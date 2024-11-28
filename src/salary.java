
import java.util.Scanner;
import java.util.List;

public class salary{
    public static boolean sal(List<Employee> emp){
        int i;
        boolean b=true;
        do {

            Scanner input = new Scanner(System.in);
            System.out.println("1. Ascending order \n" +
                    "2.descending order \n" +
                    "3.previous \n" +
                    "4.exit\n" +
                    "enter the number: ");
            i = input.nextInt();
            if (i == 1)
                emp.stream().sorted((i1, i2) -> Double.compare(i2.salary, i1.salary)).forEach(System.out::println);
            if (i == 2)
                emp.stream().sorted((i1, i2) -> Double.compare(i1.salary, i2.salary)).forEach(System.out::println);
            if (i == 4) {
                b = false;
                return b;
            }
            if(i>4 || i<1) System.out.println("enter the valid option");
        } while (i != 3);
        return b;

    }
}
