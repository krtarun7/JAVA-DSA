public class CountWords {
    public static void main(String args[])
    {
        String str = "The quick brown fox jumps over the lazy dog";
        String str1=str.trim();
        int cnt=countWords(str1);
        System.out.println("Number of words in the string is: "+cnt);
        
    }
    static int countWords(String str1)
    {
        int count=0;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)==' ')
            {
                count++;
            }
        }
        return count+1;
    }
}
