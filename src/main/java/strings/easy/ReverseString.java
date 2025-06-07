package strings.easy;

public class ReverseString {

    public static void main(String[] args) {
        char[] arr = {'h', 'e', 'l', 'l', 'o'};
        reverseString(arr);
        for (char c : arr) {
            System.out.println(c);
        }
    }
    //2 pointers
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length -1;
        while (left < right){
            var savedLeft = s[left];
            s[left] = s[right];
            s[right] = savedLeft;
            left++;
            right--;
        }
    }
}
