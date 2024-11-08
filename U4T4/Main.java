package U4T4;

public class Main {
    public static void main(String[] args) {
        String str1 = "apples and bananas";
    String str2 = "";
    for (int i = 0; i < str1.length(); i++) {
        if (!str1.substring(i, i + 1).equals(" ")) {
            str2 += str1.substring(i, i + 1);
        }
    }
    System.out.println(str2);

    }
}