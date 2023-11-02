public class Palindrome {
    public static void main(String[] args) {
        final String a = "Mr. Owl ate my metal worm";
        String rev = "";
        for(int i=a.length()-1;i>=0;i--){
            a.strip();
            rev= rev+a.charAt(i);
        }
        System.out.println(rev);
        if(a.equals(rev)){
        System.out.println(" this is palindrome");

        }
        else{
            System.out.println(" this is not palindrome");
        }

    }
}
