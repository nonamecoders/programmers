package level1;

public class Collatz {


    static int count =0;

    public void cycle (Long n){

        if(n>1) {

            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (n * 3) + 1;
            }

            count++;
            cycle(n);
        } else if (n==1){

        }


    }

    public int solution(int num){

        Long l_num = (long) num;
        cycle(l_num);

        System.out.println(count);
        if(count<=500){
            return count;
        } else{
            return -1;
        }

    }

    public static void main(String[] args) {
        Collatz collatz = new Collatz();
        int n =6;
        System.out.println(collatz.solution(n));
    }
}
