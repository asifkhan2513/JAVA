public class Length {
    public static void main(String[] args) {
        String name = "abc";
        String email = "abc@gmail.com";
        String password = "Abc123";
        System.out.println("the value is " + name.isEmpty());
        System.out.println("the length  is " + name.length());
        System.out.println("the length is " + email.length());
        System.out.println("the length is " + password.length());

        if(name.trim().length()==0){
            System.out.println("the length is equal to  zero ot its not  ");
        }
        else{
            System.out.println(" the number is valid");
        }
    }
}
