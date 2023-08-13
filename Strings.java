class Strings {
    public static void main(String[] args) {
        Join j = new Join();
        String st = j.joinStrings(" Hello ", "World!");
        System.out.println(st);
    }

}

class Join {
    public static String joinStrings(String str1, String str2) {
        String str = str1 + str2;
        return str;
    }
}