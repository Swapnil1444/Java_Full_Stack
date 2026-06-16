public class remove_vowels {
    public static void main(String[] args) {
        String ch="youcandoit";
        removeVowels(ch);
    }
    public static void removeVowels(String s){
        for(int i=0;i<s.length();i++){
             char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                continue;
            }
            System.out.print(ch);
        }
       
    }
}
