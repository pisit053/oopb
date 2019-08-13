package chap3;
public class Employee {
    static int id = 1001;
    String name = "Pisit";
    int age = 21;
    
    static void work (){
        System.out.println("work()");
    }
    void getSalary(){
        System.out.println("getSalary()");
    }
    public static void main(String[] args) {
        //call static attr &nethot
        System.out.println("Id :"+id);                         
        work();
        
        //call non-static
        Employee em = new Employee();
        System.out.println("Name : "+em.name);
        System.out.println("Age : "+em.age);
        em.getSalary();
        
    }
}


    

