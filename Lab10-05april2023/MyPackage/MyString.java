package MyPackage;

public class MyString {
    private String str;
    
    public MyString(String str) {
        this.str = str;
    }
    
    public int length() {
        return str.length();
    }
    
    public String reverse() {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    
    public String upperCase() {
        return str.toUpperCase();
    }
    
    public String lowerCase() {
        return str.toLowerCase();
    }
    
    public int compareTo(String str2) {
        return str.compareTo(str2);
    }
}
