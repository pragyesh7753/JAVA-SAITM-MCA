public class StringBuff {
    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer("New String");
        System.out.println(s1.reverse());
        System.out.println(s1.insert(0, 78));
        System.out.println(s1.capacity());
        System.out.println(s1);
        s1.toString();  // this will change stringbuffer to string
    }
}
