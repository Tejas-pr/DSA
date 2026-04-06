public class SearchInString {
    public static void main(String[] args) {
        String str = "Tejas";
        char target = 'T';
        System.out.println(searchChar(str, target));
    }

    static boolean searchChar(String str, char target) {
        if(str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }
}
