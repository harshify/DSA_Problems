class Solution {

    public static StringBuilder result;

    public String intToRoman(int num) {
        
        result=new StringBuilder();

        helper(num);
        return result.toString();
    }

    public static void helper(int n){

        if(n==0){
            return;
        }else if(n>=1000){
            result.append("M");
            helper(n-1000);
        }else if(n>=900){
            result.append("CM");
            helper(n-900);
        }else if(n>=500){
            result.append("D");
            helper(n-500);
        }else if(n>=400){
            result.append("CD");
            helper(n-400);
        }else if(n>=100){
            result.append("C");
            helper(n-100);
        }else if(n>=90){
            result.append("XC");
            helper(n-90);
        }else if(n>=50){
            result.append("L");
            helper(n-50);
        }else if(n>=40){
            result.append("XL");
            helper(n-40);
        }else if(n>=10){
            result.append("X");
            helper(n-10);
        }else if(n==9){
            result.append("IX");
            helper(n-9);
        }else if(n==8){
            result.append("VIII");
            helper(n-8);
        }else if(n==7){
            result.append("VII");
            helper(n-7);
        }else if(n==6){
            result.append("VI");
            helper(n-6);
        }else if(n==5){
            result.append("V");
            helper(n-5);
        }else if(n==4){
            result.append("IV");
            helper(n-4);
        }else if(n==3){
            result.append("III");
            helper(n-3);
        }else if(n==2){
            result.append("II");
            helper(n-2);
        }else {
            result.append("I");
            helper(n-1);
        }

    }

}