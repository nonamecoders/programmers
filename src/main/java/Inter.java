
public class Inter {

//    static int cnt;
//    int data;
//
//    Inter(int data){
//        this.data = data;
//        cnt++;
//    }

//    Inter(int no){
//        this.no = no;
//        System.out.println("Person(int no) 호출됨");    }
//
//    int no =10;
//    String name;
//    Inter(int no,String name){
//        this(no);
//        this.name=name;
//        System.out.println("Person(int no,String name)" + "호출됨");
//    }

    interface I1{
        void m1();
    }
    interface I2 extends I1{
        void m2();
    }
    interface I3 extends I1{
        void m3();
    }
    abstract class A implements I3{
        public void m3(){};
    }
    class B extends A implements I3{
        public void m1(){};
        public void m2(){};
    }

    public static void main(String[] args) {
//        Inter inter1 = new Inter(6);
//        Inter inter2 = new Inter(1);
//        Inter inter3 = new Inter(2);
//        Inter inter4 = new Inter(3);
//        System.out.println(Inter.cnt);
//
//        try{
//            System.out.println(10/0);
//            System.out.println("a");
//        } catch (Exception e){
//            System.out.println("b");
//        } finally {
//            System.out.println("c");
//        }
//        System.out.println("d");

        Inter inter = new Inter();


    }
}
