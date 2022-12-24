import java.util.Arrays;
 
class Lexicographic
{
    
    public static void findLexicographic(char[] chars, String output)
    {
        if (output.length() == chars.length)
        {
            System.out.print(output + " ");
            return;
        }
        
        for (char c: chars) {
            if(String.valueOf(c)==output){
                continue;
        }
            findLexicographic(chars, output + c);
        }
    }
    public static void main(String[] args)
    {
        String str = "eat";
        if (str == null || str.length() == 0) {
            return;
        }
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        findLexicographic(chars, " ");
    }
}