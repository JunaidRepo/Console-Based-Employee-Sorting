import java.util.Comparator;

public class Employee {
    String name;
    int id;
    double salary;
    Employee(int id,String name,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public String toString(){
        return "\tname ="+name+"\t id "+id+"\t salary "+salary;
    }

}
