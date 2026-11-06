public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    public Solution() {}

    public boolean endsLy(String x) {
        if (x.length() > 2){
            if ((x.substring(x.length()-2)).equals("ly")){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public String conCat(String s1, String s2) {
        if (s1.equals("")){
            return s2;
        } else if (s2.equals("")){
            return s1;
        } else if (s1.substring(s1.length()-1,s1.length()).equals(s2.substring(0,1))){
            return s1.substring(0,s1.length()-1) + s2;
        } else {
            return s1 + s2;
        }
    }

    public String withoutX(String s1) {
        String string = "";
        if (s1.indexOf("x") == -1){
            string = s1;
        } else {
            if (s1.indexOf("x") == 0 && s1.substring(s1.length()-1).equals("x")){
                string = s1.substring(1,s1.length()-1);
            } else if (s1.indexOf("x") == 0){
                string = s1.substring(1);
            } else if (s1.substring(s1.length()-1).equals("x")){
                string = s1.substring(0,s1.length()-1);
            }
        }
        return string;
    }

    public String fizzString(String s1) {
        String fizz = "";
        if (s1.indexOf("f") == 0 && s1.indexOf("b") == s1.length()-1){
            fizz = "FizzBuzz";
        } else if (s1.indexOf("f") == 0){
            fizz = "Fizz";
        } else if (s1.indexOf("b") == s1.length()-1){
            fizz = "Buzz";
        }
        return fizz;
    }

    public String fizzString2(int x) {
        if ((x % 3) == 0 && (x % 5) == 0){
            return "FizzBuzz!";
        } else if ((x % 3) == 0){
            return "Fizz!";
        } else if ((x % 5) == 0){
            return "Buzz!";
        } else {
            return x + "!";
        }
    }

}
