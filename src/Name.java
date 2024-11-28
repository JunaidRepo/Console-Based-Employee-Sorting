
import java.util.Scanner;
import java.util.List;

class Name {
    public static boolean name(List<Employee> emp){
        int i;
        boolean b=true;
        do {
            Scanner input=new Scanner(System.in);

            System.out.println("Name based ordering \n"+
                    "1. Ascending order \n" +
                    "2.descending order \n" +
                    "3.previous \n" +
                    "4.exit\n" +
                    "enter the number: ");
            i=input.nextInt();
            if(i==1) emp.stream().sorted((i1,i2)->i2.name.compareTo(i1.name)).forEach(System.out::println);
            if(i==2) emp.stream().sorted((i1,i2)->i1.name.compareTo(i2.name)).forEach(System.out::println);
            if(i==4){
                b=false;
                break;
            }
            if(i>4 || i<1) System.out.println("enter the valid option");
        }while (i !=3);
        return b;

    }

}
