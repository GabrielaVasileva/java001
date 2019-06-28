package exercises;

public class TestChar {
    public static String repeatNTimes(String s, int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(s);
        }
        return builder.toString();
    }

    public static String repeat(String str, int times) {
        char[] innerCharArray = new char[times];

        String fromChar =  new String(innerCharArray);

        String result = fromChar.replace("\0", str);
        return result;
    }

    public static void main(String[] args){

        System.out.println(repeat("*", 4));

    }
}
