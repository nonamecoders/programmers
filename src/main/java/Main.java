import java.util.HashSet;

public class Main {

    //소수찾
    public boolean isPrime(int n){
        if(n<2) return false;
        if(n==2) return true;
        for(int i =2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    //풀조합
    public void cycle(String prefix, String number, HashSet<Integer> set) {
        int len = number.length();
        if(!prefix.equals("")) {
            set.add(Integer.valueOf(prefix));
        }

        for (int i = 0; i < len; i++){
            cycle(prefix + number.charAt(i), number.substring(0, i) + number.substring(i+1, len), set);
        }
    }
    public int solution(String numbers) {
        HashSet<Integer> set = new HashSet<>();

        cycle("", numbers, set);

        int count = 0;
        while(set.iterator().hasNext()){
            int a = set.iterator().next();
            System.out.println(a);
            set.remove(a);

            if(isPrime(a)){
                System.out.println("+++ count up +++");
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {

        String numbers = "147";
        Main main = new Main();
        System.out.println(main.solution(numbers));

    }
}
