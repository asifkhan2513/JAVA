public class StringBufferDemo {
        public static void main(String[] args) {
        StringBuffer s= new StringBuffer("asif");
        System.out.println(s.capacity());
        System.out.println(s.length());
        System.out.println(s.append(" khan"));
        System.out.println(s.charAt(0));
        System.out.println(s.delete(2,5));
        System.out.println(s.deleteCharAt(3));
        System.out.println(s.indexOf("a"));
        System.out.println(s.lastIndexOf("f"));
        System.out.println(s.insert(5, "khan"));
        System.out.println(s.hashCode());
        System.out.println(s.reverse());
        System.out.println(s.replace(3, 6, "AAAA"));
        //System.out.println(s.);
        //System.out.println(s.capacity());
        }
}
