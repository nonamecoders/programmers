package level1;

public class FindMoreMoney {

    public long solution(int price, int money, int count) {
        long answer = 0;
        long priceL = (long)price;
        long multPriceL;
        long moneyL = (long)money;
        long countL = (long)count;

        for(long i=1; i<= countL; i++ ){
            multPriceL = priceL*i;
            moneyL -= multPriceL;
        }

        if(moneyL >= 0L)
            answer = 0L;
        else
            answer = Math.abs(moneyL);

        return answer;
    }

    public static void main(String[] args) {

        FindMoreMoney findMoreMoney = new FindMoreMoney();
        int price =3;
        int money = 20;
        int count =4;
        System.out.println(findMoreMoney.solution(price,money,count));
    }
}
