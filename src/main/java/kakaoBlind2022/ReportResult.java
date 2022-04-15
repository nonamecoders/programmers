package kakaoBlind2022;

import java.util.*;

public class ReportResult {

    public int[] solution (String[] id_list,String[] report, int k){


        //신고한 사람 누구 신고했는지
        LinkedHashMap<String, List<String>> reportIdList = new LinkedHashMap<>();

        LinkedHashMap<String,Integer> hashMap = new LinkedHashMap<>();

        int[] result = new int[id_list.length];

        for(String s : id_list) {
            reportIdList.put(s,new ArrayList<>());
            hashMap.put(s,0);
        }

        //중복 신고 제거
        String[] distinctArr = Arrays.stream(report).distinct().toArray(String[]::new);
        //신고접수
        for (String s : distinctArr) {

            String[] arr = s.split(" ",2);
            String id = arr[0];
            String reported_id = arr[1];
            Integer count = hashMap.get(reported_id);
            if(count == null){
                hashMap.put(reported_id,1);
            } else {
                hashMap.put(reported_id, count+1);
            }
            List<String> list = new ArrayList<>();
            if(reportIdList.get(arr[0]) == null){

                list.add(arr[1]);
                reportIdList.put(id,list);
            } else {
                list = reportIdList.get(arr[0]);
                list.add(arr[1]);
                reportIdList.put(id,list);
            }

        }

        for (String key : hashMap.keySet()) {
            if(hashMap.get(key) >= k){


                int index=0;
                for (String repoId : reportIdList.keySet()) {

                    for(String s : reportIdList.get(repoId)){
                        if(key.equals(s)){
                            result[index]++;
                        }
                    }

                    index++;
                }

            }

        }

        return result;
    }

    public static void main(String[] args) {

//        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
//        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};

        String[] id_list = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 2;
        
        ReportResult reportResult = new ReportResult();
        int[] result = reportResult.solution(id_list,report,k);

        for(int i : result)
            System.out.println(i);

    }
}
