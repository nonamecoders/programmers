package level1;

public class NumberStringEnglish {
    public int solution(String s) {
        String answerString="";
        String addString="";
        char temp;

        for(int i =0; i<s.length(); i++){
            temp = s.charAt(i);
            if(!Character.isDigit(temp)){
                addString += Character.toString(temp);
            }else{
                answerString += Character.toString(temp);
            }

            if(!change(addString).equals(addString)){
                answerString += change(addString);
                addString ="";
            }
        }

        return Integer.parseInt(answerString);
    }

    public static String change(String s){

        if(s.equals("one")){
            s="1";
        }else if(s.equals("two")){
            s="2";
        }else if(s.equals("three")){
            s="3";
        }else if(s.equals("four")){
            s="4";
        }else if(s.equals("five")){
            s="5";
        }else if(s.equals("six")){
            s="6";
        }else if(s.equals("seven")){
            s="7";
        }else if(s.equals("eight")){
            s="8";
        }else if(s.equals("nine")){
            s="9";
        }else if(s.equals("zero")){
            s="0";
        }
        return s;
    }

    public static void main(String[] args) {
        NumberStringEnglish numberStringEnglish = new NumberStringEnglish();
        String s = "one4seveneight";
        System.out.println(numberStringEnglish.solution(s));
    }
}
