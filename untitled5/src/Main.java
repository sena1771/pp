import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the system as a:  \n 1-Administrator \n " +
                "2-Branch employee \n " +
                "3-Transportation personnel \n" +
                "4-Customer");
        int enter = scan.nextInt();



        employee employee1= new employee("Sena","Canakkale");
        employee employee2=new employee("Feyza","Gebze");
        employee employee3=new employee("Emre","Trabzon");
        employee employee4= new employee("Ayse","Canakkale");
        employee employee5=new employee("Furkan","Erdek");
        employee employee6=new employee("Erol","Trabzon");

           // System.out.println(employee1.getName_employee()+employee1.getBranch());
        if(enter==1){
            System.out.println("Employee and branch list: ");
            System.out.println((employee1.getName_employee()+ employee1.getBranch()));
            System.out.println((employee2.getName_employee()+ employee2.getBranch()));
            System.out.println((employee3.getName_employee()+ employee3.getBranch()));
            System.out.println((employee4.getName_employee()+ employee4.getBranch()));
            System.out.println((employee5.getName_employee()+ employee5.getBranch()));
            System.out.println((employee6.getName_employee()+ employee6.getBranch()));

        };
        }


        //employee1.setName_employee("Sena");
        //employee2.setName_employee("Sena");
       /*if(enter==1){
            System.out.println("Successfully entered");
            System.out.println();
        }
        if(enter==2){

        }
        if(enter==3){

        }
        if(enter==4){

        }*/
    }

