import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Employee> l1 = new ArrayList<>();
        String a;
        int id = 0;
        while (true) {
            System.out.println("enter the name or enter 'exit' to exit");
            a = input.next();
            if (a.equalsIgnoreCase("exit")) break;
            int b;
            try {
                System.out.println("enter the Salary");
                b = input.nextInt();
                l1.add(new Employee(++id, a, b));
            } catch (Exception e) {
                System.out.println("enter the valid salary");
                input.nextLine();

            }
        }
        System.out.println(l1);
        System.out.println("check based on ordering enter 1");
        int i=input.nextInt();
         if(i==1 && l1.size()>1){
            boolean b=true;
            while (b) {
                System.out.print("select from option\n" +
                        "1.sort on Names\n" +
                        "2.sort on id\n" +
                        "3.sort on Salary\n" +
                        "0.exit\n");
                int q = input.nextInt();
                if (q == 1) {
                    System.out.println("Name based sorting");

                    b=Name.name(l1);
                }

                if (q == 2) {
                    System.out.println("ID based sorting");
                    b=ID.idsort(l1);
                }
                if (q == 3) {
                    System.out.println("Salary based ordering");
                    b= salary.sal(l1);
                }
                if(q==0) b=false;
                if(q>4 || q<0) System.out.println("plz enter the valid option");
            }
        }
    }
}