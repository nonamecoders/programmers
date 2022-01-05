//public class Emplo {
//
//    abstract class Employee {
//        int sabun;
//        String name;
//
//        abstract int getSalary();
//        void printEmployeeInfo(){
//            System.out.println("사번 : " + sabun + " 이름 : " +
//                    name + " 봉급 : " + getSalary());
//        }
//    }
//
//    class Permanent extends Employee{
//        int getSalary(){
//            return 100;
//        }
//    }
//    class Salesman extends Permanent {
//        int getSalary(){
//            return 10 + super.getSalary();
//        }
//    }
//
//    public static void main(String[] args) {
//
//        Employee one = new Emplo.Permanent();
//        Employee two = new Emplo.Salesman();
//        one.sabun = 1;
//        one.name="lji";
//        two.sabun=2;
//        two.name="kcs";
//
//        one.printEmployeeInfo();
//        two.printEmployeeInfo();
//
//
//    }
//}
