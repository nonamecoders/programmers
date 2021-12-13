package level1;

public class RecommendID {

    public String remove(String s) {

        s = s.replace("~","");
        s = s.replace("!","");
        s = s.replace("@","");
        s = s.replace("#","");
        s = s.replace("$","");
        s = s.replace("%","");
        s = s.replace("^","");
        s = s.replace("&","");
        s = s.replace("*","");
        s = s.replace("(","");
        s = s.replace(")","");
        s = s.replace("=","");
        s = s.replace("+","");
        s = s.replace("[","");
        s = s.replace("{","");
        s = s.replace("]","");
        s = s.replace("}","");
        s = s.replace(":","");
        s = s.replace("?","");
        s = s.replace(",","");
        s = s.replace("<","");
        s = s.replace(">","");
        s = s.replace("/","");


        s= s.replaceAll("[.]{2,}",".");

        return s;
    }

    public String solution(String new_id) {
        String answer =  "";

        new_id = new_id.toLowerCase();

        new_id = remove(new_id);

        if(new_id.startsWith(".")){
            new_id =  new_id.substring(1,new_id.length());
        }

        if(new_id.endsWith(".")){
            new_id =  new_id.substring(0,new_id.length()-1);
        }

        if(new_id.length()==0){
            return "aaa";
        }

        if(new_id.length() >= 16){
            new_id = new_id.substring(0,15);
            if(new_id.endsWith(".")){
                new_id =  new_id.substring(0,new_id.length()-1);
            }
        }

        if(new_id.length() <=2){
            while(new_id.length()<3) {
                new_id = new_id + new_id.substring(new_id.length() - 1, new_id.length());
            }
        }

        return new_id;
    }

    public static void main(String[] args) {
        RecommendID recommendID = new RecommendID();
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        System.out.println(recommendID.solution(new_id));
    }
}
