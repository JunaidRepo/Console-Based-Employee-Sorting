import java.util.List;
import java.util.Scanner;

public abstract class ID {
    public  static boolean idsort(List<Employee> emp){
        boolean b=true;
        int i;
        do {
            Scanner input=new Scanner(System.in);

            System.out.println("1. Ascending order \n" +
                    "2.descending order \n" +
                    "3.previous \n" +
                    "4.exit\n" +
                    "enter the number: ");
            i=input.nextInt();
            if(i==1) emp.stream().sorted((i1,i2)->i2.id-i1.id).forEach(System.out::println);
            if(i==2) emp.stream().sorted((i1,i2)->i1.id-i2.id).forEach(System.out::println);
            if(i==4){
                b=false;
                break;
            }
            if(i>4 || i<1) System.out.println("enter the valid option");

        }while (i !=3);
        return b;
    }
}

