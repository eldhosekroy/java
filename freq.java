import java.lang.*;
public class freq {
    public static void main(String ar[]) {
        String str = "pictureperfect";
        int freq[] = new int[str.length()];
        int i, j;
        char string[] = str.toCharArray();

        for (i = 0; i < str.length(); i++) {
            freq[i] = 1;
            for (j = i + 1; j < str.length(); j++) {
                if (string[i] == string[j]) {
                    freq[i]++;
                    // Set the duplicates to 0 to avoid printing them later
                    string[j] = '0';
                }
            }
        }

        System.out.println("Characters and their corresponding frequencies \n\n");
        for (i = 0; i < freq.length; i++) {
            if (string[i] != ' ' && string[i] != '0') {
                System.out.println(string[i] + " - " + freq[i]);
            }
        }
    }
}
