package level2;

public class QuadZip {
    static int zero = 0;
    static int one = 0;

    public int[] solution(int[][] arr) {
        int[] answer = new int[2];

        int len = arr.length;

        recursive(arr,0,0,len);

        answer[0] = zero;
        answer[1] = one;

        return answer;
    }

    public void recursive(int[][] arr, int a, int b, int len) {
        if(len == 1) {                                                        //종료 조건
            if(arr[a][b] == 0) {
                zero++;
            }else {
                one++;
            }
            return;
        }

        int value = arr[a][b];
        boolean flag = true;
        for (int i = a; i < a + len; i++) {
            if (flag) {
                for (int j = b; j < b + len; j++) {
                    if (value != arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
            } else {
                break;
            }
        }

        if (flag) {                     // 같은 수 일 때
            if (value == 1) {
                one++;
            } else {
                zero++;
            }
        } else {
            len = len/2;

            recursive(arr, a, b, len);
            recursive(arr, a + len, b, len);
            recursive(arr, a, b + len, len);
            recursive(arr, a + len, b + len, len);
        }

    }

    public static void main(String[] args) {
        QuadZip quadZip = new QuadZip();
        int[][] arr= {{1,1,0,0},{1,0,0,0},{1,0,0,1},{1,1,1,1}};
        for(int i : quadZip.solution(arr))
            System.out.println(i);
    }
}
