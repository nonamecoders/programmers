package kakaoBlind2022;

import java.util.*;

public class ParkingPay {

    public int[] solution(int[] fees, String[] records) {

        int baseTime = fees[0];
        int baseFee = fees[1];
        int countingTime = fees[2];
        int timeFee = fees[3];
        int endTime = 1439;

        //key 정렬 treemap
        TreeMap<String,List<Integer>> treeMap = new TreeMap<>();

        for(String s : records){
            List<Integer> timeList = new ArrayList<>();

            String arr[] = s.split(" ",3);

            int hour = Integer.parseInt(arr[0].replace(":","").substring(0,2));
            int min = Integer.parseInt(arr[0].replace(":","").substring(2,4));

            int time = hour * 60 + min;

            String car = arr[1];
            System.out.println("car : " + car +", time : " + time);

            if(!treeMap.containsKey(car)){
                timeList.add(time);
                treeMap.put(car,timeList);
            } else {
                timeList = treeMap.get(car);
                timeList.add(time);
                treeMap.put(car,timeList);
            }
        }

        List<Integer> result = new ArrayList<>();

        treeMap.forEach((k,v) ->{
            List<Integer> timeList;
            if(v.size()%2 ==1){
                timeList = treeMap.get(k);
                timeList.add(endTime);
                treeMap.put(k,timeList);
            }
            double fee = 0;
            int usetime = 0;
            for(int i=1;i<v.size();i+=2){

                usetime +=  v.get(i) - v.get(i-1);

                if(i == v.size()-1){
                    if(usetime<=baseTime){
                        fee = baseFee;
                    } else if(usetime > baseTime) {
                        double sumTime = Math.ceil(((double) (usetime-baseTime)/countingTime));
                        System.out.println("sumTime: " + sumTime);

                        fee = baseFee +  sumTime * timeFee;
                    }
//                    System.out.println("--------------------------");
//                    System.out.println("car : " +k  + "\nuseTime : " + usetime + "\n최종요금 : " + fee);
//                    System.out.println("--------------------------");

                    result.add((int) fee);
                }
            }

        });

        return result.stream().mapToInt(Integer::intValue).toArray();

    }

    public static void main(String[] args) {

        int[] fees = {180, 5000, 10, 600};
        String[] records ={"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};

//        int[] fees = {120, 0, 60, 591};
//        String[] records ={"16:00 3961 IN","16:00 0202 IN","18:00 3961 OUT","18:00 0202 OUT","23:58 3961 IN"};
        ParkingPay parkingPay = new ParkingPay();
        int[] result = parkingPay.solution(fees,records);

        for (int i : result)
            System.out.println(i);
    }
}
