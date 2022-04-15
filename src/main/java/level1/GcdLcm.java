package level1;

public class GcdLcm {

    //최소공배수 최대공약수
    public int getGCD(int n,int m){

        if(m ==0) return n;

        else return getGCD(m,n%m);

    }

    public int[] solution(int n, int m) {
        int[] answer = new int [2];
        int gcd = getGCD(n,m);
        answer[0] = gcd;
        answer[1] = n*m / gcd;

        return answer;
    }

    public static void main(String[] args) {

        GcdLcm gcdLcm = new GcdLcm();
        int [] result = gcdLcm.solution(3,12);

        for(int i : result)
            System.out.println(i);

    }
}
