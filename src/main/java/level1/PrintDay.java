package level1;

import java.util.Calendar;

public class PrintDay {

    public String solution(int a, int b) {
        String answer ="";

        Calendar cal = Calendar.getInstance();



        cal.set(Calendar.YEAR,2016);
        cal.set(Calendar.MONTH,a-1);
        cal.set(Calendar.DATE,b);
        System.out.println(cal);

        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        switch (dayOfWeek) {
            case 1 :
                answer ="SUN";
                break;
            case 2 :
                answer ="MON";
                break;
            case 3 :
                answer ="TUE";
                break;
            case 4 :
                answer ="WED";
                break;
            case 5 :
                answer ="THU";
                break;
            case 6 :
                answer ="FRI";
                break;
            case 7 :
                answer ="SAT";
                break;


        }
        return answer;
    }

    public static void main(String[] args) {
        PrintDay printDay = new PrintDay();
        int a = 5;
        int b = 24;
        System.out.println(printDay.solution(a,b));
    }

}
