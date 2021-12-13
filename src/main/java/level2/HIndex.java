package level2;

import java.util.Arrays;

public class HIndex {
    public int solution(int[] citations) {
        int answer = 0;

        int n = citations.length;

        Arrays.sort(citations);

        for(int i=0; i<n; i++){
            int cnt =0;
            if(citations[i] ==0){
                continue;
            }
            for(int j=i; j<n;j++){
                if(citations[i] <=citations[j]){
                    cnt ++;
                }
            }
            if(cnt> citations[i]){
                cnt = citations[i];
            }
            if(answer < cnt){
                answer = cnt;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        HIndex hIndex = new HIndex();
        int[] citations = {3,0,6,1,5};
        System.out.println(hIndex.solution(citations));
    }
}
