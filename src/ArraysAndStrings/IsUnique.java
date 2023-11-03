package ArraysAndStrings;

// 1.1
// space complexity - constant
// time complexity - O(n) where n = string length

public class IsUnique {

    public static void main(String[] args) throws Exception {
        System.out.println("Is given string unique?" + IsUnique.isItUnique("Dhuruv"));
    }
    
    public static boolean isItUnique(String str) {

        boolean[] array = new boolean[128];
    
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if(array[val] == true) {
                return false;
            }
            array[val] = true;
        }

        return true;
    }

}
