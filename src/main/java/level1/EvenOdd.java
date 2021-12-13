package level1;

public class EvenOdd {

    public String solution(int num) {
        String answer = "";
        answer = num %2 ==0 ? "Even" : "Odd";
        return answer;
    }

    public static void main(String[] args) {

        EvenOdd evenOdd = new EvenOdd();
        int num =3;
        System.out.println(evenOdd.solution(num));
    }
}
