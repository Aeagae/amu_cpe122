import java.util.ArrayList;
public class SurveyResponse <T> {
    private ArrayList <T> responses = new ArrayList<>();
    public void addResponse(T response){
        responses.add(response);
    }
    public int countResponses(){
        return responses.size();
    }
    public void printResponses(){
        for (T i : responses){
            System.out.println(i);
        }
    }
    public void analyze (){
        T i = responses.get(0);
        if (i instanceof Integer){
            int sum = 0;
            for (T j : responses){
                sum += (Integer)j;
            }
            System.out.println("average: " + (sum / responses.size()));
        } else if (i instanceof Character){
            int count = 0 ;
            for (T j : responses){
                char c = Character.toLowerCase((Character) j);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    count++;
                }
            }
            System.out.println("number of vowels: " + count);
        } else if (i instanceof String){
            int count = 0;
            for (T j : responses){
                if(Character.isUpperCase(((String) j).charAt(0))){
                    count++;
                } 
            }
            System.out.println("responses starting with uppercase: " + count);
        }
    }
        public static void main(String[] args) {
        SurveyResponse<Integer> intR = new SurveyResponse<>();
        int [] arri= new int[]{1, 2, 3, 4, 5};
        for (int i : arri){ {
            intR.addResponse(i);
        }
        intR.analyze();
        SurveyResponse<Character> charR = new SurveyResponse<>();
        char [] arrc = new char[]{'a', 'b', 'c', 'd', 'e'};
        for (char c : arrc) {
            charR.addResponse(c);
        }
        charR.analyze();
        SurveyResponse<String> strR = new SurveyResponse<>();
        String [] arrs = new String[]{"Yes", "no", "Maybe", "No", "Absolutely"};
        for (String s : arrs){
            strR.addResponse(s);
        }
        strR.analyze();
    }
}
}
