package level1;

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String [] arr1_s = new String [arr1.length];
        String [] arr2_s = new String [arr1.length];
        String [] answer = new String [arr1.length];


        for(int i=0; i<arr1.length; i++) {
            arr1_s[i] = Integer.toBinaryString(arr1[i]);
            arr2_s[i] = Integer.toBinaryString(arr2[i]);

            if(arr1_s[i].length() != n) {
                int p = arr1_s[i].length();
                for(int k=0; k<n-p; k++) {
                    arr1_s[i] = "0" + arr1_s[i];
                }
            }

            if(arr2_s[i].length() != n) {
                int p = arr2_s[i].length();
                for(int k=0; k<n-p; k++) {
                    arr2_s[i] = "0" + arr2_s[i];
                }
            }
            answer[i] = "";

            for(int t=0; t<n; t++) {
                int r = (int)(arr1_s[i].charAt(t) - '0');
                int b = (int)(arr2_s[i].charAt(t) - '0');
                String e = r+b==0 ? " " : "#";

                answer[i] += e;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        SecretMap secretMap = new SecretMap();
        int n =5;
        int[] arr1 = {9,20,28,18,11};
        int[] arr2 = {30,1,21,17,28};

        for(String s :  secretMap.solution(n,arr1,arr2))
            System.out.println(s);

    }
}
