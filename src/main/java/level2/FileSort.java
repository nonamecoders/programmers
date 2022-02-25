package level2;

import java.util.Arrays;
import java.util.Comparator;

public class FileSort {

    public String[] solution(String[] files) {
        Arrays.sort(files, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String[] file1 = detach(s1);
                String[] file2 = detach(s2);

                int headValue = file1[0].compareTo(file2[0]);

                if(headValue ==0){
                    int num1 = Integer.parseInt(file1[1]);
                    int num2 = Integer.parseInt(file2[1]);

                    return num1-num2;
                } else {
                    return headValue;
                }
            }
            private String[] detach(String str){
                boolean check_num =false;
                boolean check_tail =false;
                int count =0;
                StringBuffer head = new StringBuffer();//최소 한글자 이상
                StringBuffer number = new StringBuffer(); //1~5자리
                StringBuffer tail = new StringBuffer();// 없을 수도 있음
                for(int j=0; j<str.length();j++){
                    char c = str.charAt(j);
                    // header
                    if((c < 48 || c > 57) && check_num ==false ){
                        head.append(c);
                    }else if (c >= 48 && c <= 57 && count <5 && check_tail==false){
                        number.append(c);
                        count++;
                        check_num =true;
                    } else if ( (c < 48 || c > 57) && check_num ==true){
                        tail.append(c);
                        check_tail = true;
                    }
                    count =0;
                }

                String fileArr[] = {head.toString().toLowerCase(),number.toString(),tail.toString()};

                return  fileArr;
            }
        });

        return files;
    }

    public static void main(String[] args) {
        FileSort fileSort = new FileSort();
        String[] files = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
        files = fileSort.solution(files);
        for(String file : files)
            System.out.println(file);
    }
}
