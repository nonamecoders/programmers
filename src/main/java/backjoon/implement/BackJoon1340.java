package backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon1340 {

    public enum Month {

        January(1,0)
        , February(2,31)
        , March(3,59)
        , April(4,90)
        , May(5,120)
        , June(6,151)
        , July(7,181)
        , August(8,212)
        , September(9,243)
        , October(10,273)
        , November(11,304)
        , December(12,334);

        private final int month;
        private final int day;

        Month(int month, int day) {
            this.month = month;
            this.day = day;
        }

        public int getDay() {
            return day;
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 1/365 = 0.002739726027397  >> 525600 min
        // 1/366 = 0.002732240437158  >> 527040 min

        boolean yun = false;

        int allTime = 60 * 24 * 365;

        String s = br.readLine();

        String[] arr = s.replace(",","").replace(":"," ").split(" ");

        int year = Integer.parseInt(arr[2]);
        String month = arr[0];
        int day = Integer.parseInt(arr[1]);
        int hourOfMin = Integer.parseInt(arr[3]) * 60;
        int min = Integer.parseInt(arr[4]) + hourOfMin;

        //윤년처리
        if((year%400 ==0) || (year%4==0 &&year%100 != 0)) {
            yun = true;
            allTime = 60 * 24 * 366;
        }
        int days;
        int ord = Month.valueOf(month).ordinal();
        if(yun && ord > 1){
            days = Month.valueOf(month).getDay() + 1;
        } else {
            days = Month.valueOf(month).getDay();
        }
        days +=day;

        int minOfDays = (days-1) * 60 * 24;

        int fullMin = minOfDays + min;

        double percent = (double)((double)fullMin/(double)allTime);

        System.out.println(percent * 100);

    }
}
