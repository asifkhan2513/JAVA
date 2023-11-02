public class replace {
    public static void main(String[] args) {
        String name ="Mo . Asif";
        System.out.println(name.replace("Mo", "mohammad"));
        System.out.println(name.replaceAll("is(.)", "was"));
        System.out.println(name.lastIndexOf("f"));
        System.out.println(name.charAt(0));
        System.out.println(name.contains("if"));
        System.out.println(name.isBlank());
        System.out.println(name.getBytes());
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.lines());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());
        System.out.println(name.getClass());
        System.out.println(name.startsWith("M"));
        System.out.println(name.endsWith("asi"));
    }
}
