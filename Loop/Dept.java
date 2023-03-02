package Loop;

import java.util.*;
public class Dept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees");
        int n = sc.nextInt();

        int empId[] = new int[n];
        String depName[] = new String[n];
        String empDes[] = new String[n];
        String joinDate[] = new String[n];
        String empName[] = new String[n];
        String desCode[] = new String[n];
        int basic[] = new int[n];
        int hra[] = new int[n];
        int it[] = new int[n];
        int da[] = new int[n];
        int salary[] = new int[n];

        int c = 0;

        for (int i=0; i<n; i++){
            System.out.println("Details of Employees : "+(i+1));
            System.out.println("Employee Id : ");
                empId [i] = sc.nextInt();
            System.out.println("Employee Name : ");
                empName [i] = sc.next();
            System.out.println("Join Date : ");
                joinDate [i] = sc.next();
            System.out.println("Designation Code : ");
                desCode [i] = sc.next();
            System.out.println("Department : ");
                depName [i] = sc.next();
            System.out.println("Basic : ");
                basic [i] = sc.nextInt();
            System.out.println("HRA : ");
                hra [i] = sc.nextInt();
            System.out.println("IT : ");
                it [i] = sc.nextInt();
        }


        for(int i=0; i<n; i++){
            switch (desCode[i]){

                case "e" : da[i] = 20000;
                empDes[i] = "Engineer";
                break;

                case "c" : da[i] = 32000;
                    empDes[i] = "Consultant";
                    break;

                case "k" : da[i] = 22000;
                    empDes[i] = "Clark";
                    break;

                case "r" : da[i] = 15000;
                    empDes[i] = "Receptionist";
                    break;

                case "m" : da[i] = 18000;
                    empDes[i] = "Manager";
                    break;

                default:
                    System.out.println("No such designation code.");
            }
        }

            for (int i=0; i<n; i++){
                salary[i] = basic[i] + hra[i] + da[i] - it[i];
            }

        System.out.println("Enter the employees id for details");

            int ei = sc.nextInt();
//            String ei = sc.next();
            System.out.println("EmpNo." + "\t" + "EmpName" + "\t" + "Department" + "\t" + "Designation" + "\t" + "Salary");

            for (int i=0; i<n; i++){
                if(ei == empId[i]){
                    System.out.println(empId[i]+"\t"+empName[i]+"\t"+depName[i]+"\t"+empDes[i]+"\t"+salary[i]);
                    c++;
                }
            }

            if (c==0){
                System.out.println("There is no employee with : "+ei);
            }
    }
}
