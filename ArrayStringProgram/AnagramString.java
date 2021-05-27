package ArrayStringProgram;

public class AnagramString {

    public static void main(String[] args) {
        String a = "cat";
        String b = "aat";
//        boolean isAnagram = false;
        // 1-method:::::
//        boolean visited[] = new boolean[b.length()];
//        if (a.length() == b.length()) {
//            for (int i = 0; i < a.length(); i++) {
//                char c = a.charAt(i);
//                isAnagram = false;
//                for (int j = 0; j < b.length(); j++) {
//                    if (b.charAt(j) == c && !visited[j]) {
//                        visited[j] = true;
//                        isAnagram = true;
//                        break;
//                    }
//                }
//                if (!isAnagram) {
//                    break;
//                }
//            }
//        }

//        if (isAnagram) {
//            System.out.println("Anagram");
//        } else {
//            System.out.println("Not Anagram");
//        }

        // 2-method::::
        // This method is not optimized as it has limited size of array(256)
        // using counting ascii occourance(char have ascii from 0->256)
//        boolean isAnagram = true;
//        int al[] = new int[256];
//        int bl[] = new int[256];
//        for (char c : a.toCharArray()) {
//            int index = (int) c;
//            al[index]++;
//        }
//        for (char c : b.toCharArray()) {
//            int index = (int) c;
//            bl[index]++;
//        }
//        for (int i = 0; i < 256; i++) {
//            if (al[i] != bl[i]) {
//                isAnagram = false;
//                break;
//            }
//        }
//        if (isAnagram) {
//            System.out.println("Anagram");
//        } else {
//            System.out.println("Not Anagram");
//        }

        // 3-method::::
        // by subtract on getting same char on bl side as al side,
        // if all are zero then the string is anagram.
        boolean isAnagram = true;
        int al[] = new int[256];
        for (char c : a.toCharArray()) {
            int index = (int) c;
            al[index]++;
        }
        for (char c : b.toCharArray()) {
            int index = (int) c;
            al[index]--;
        }
        for (int i = 0; i < 256; i++) {
            if (al[i] != 0) {
                isAnagram = false;
                break;
            }
        }
        if (isAnagram) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }

}
