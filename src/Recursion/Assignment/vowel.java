package src.Recursion.Assignment;
public class vowel{
    public static int vowels(String s,int i){
        if(i==s.length()){
            return 0;
        }
        char ch=Character.toLowerCase(s.charAt(i));
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return 1+vowels(s,i+1);
        }
        return vowels(s,i+1);
    }
    public static void main(String[] args){
        System.out.println(vowels("education",0));
    }
}

