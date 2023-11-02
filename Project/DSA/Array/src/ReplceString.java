public class ReplceString {
    public static StringBuilder replaceSpaces(StringBuilder str) {
        if(str.length()==1 && str.charAt(0)==' ')
        {
            return str.append("@40");
        }
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                str.replace(i, i+1, "@40");
            }
        }
        return str;
    }
    public static void main(String[] args) {
        String str = "My Name is khan";
        int n = str.length();
        System.out.println(replaceSpaces(new StringBuilder(str)));
    }
}
