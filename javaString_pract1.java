public class javaString_pract1 {
    public static void main(String[] args) {
        String testString="randmon 6 is the not in the array of 75 /";
        int i;
        for (i=0;i<=testString.length();i++){
            int index=0;
            char s=testString.charAt(i);
            if (Character.isDigit(s)){
                System.out.println(s);
            }
        }
    }
}
