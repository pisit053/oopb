package chap4;

import java.util.Scanner;




public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter name : ");
        String name = sc.next();
       
        
        System.out.print ("Enter age :");
        int age = sc.nextInt();
        
        System.out.print("Enetr  salary");
        double salary = sc.nextDouble();
        
        System.out.println("Employee name :"+name);
        System.out.println(",age :"+age+",salary :"+salary);
        
        if(age<1||age>65){
            System.out.println("Error !! Age must be 1-65");
        }else if(age>=61){
            System.out.println("Age :"+age+"elderly people");
        }else if(age>=41){
            System.out.println("Middle-aged");
        }else if(age>=31){
            System.out.println("Adult");
        }else if(age>=12){
            System.out.println("teens");
        }else if (age>=1){
            System.out.println("Childhood");
        }else{
            System.out.println("non");
        }
         System.out.print("Enter degree : ");
         int degree = sc.nextInt();
         
         switch (degree){
             case 1:
                 System.out.print("Bachelor");
                 break;
             case 2:
                 System.out.print("Master's degree");
                 break;
             case 3:
                 System.out.print("PhD");
                 break;
             default:
                 System.out.print("Non");
                 break;
                 
                         
         }
                
    }
 
}
