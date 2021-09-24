public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        int[] arr2 = new int[arr.length];
        int a = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[a] = arr[i];
            a += 1;
        }
        return arr2; //😎
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        int before = -5000000;
        int omega = -5000000;
        int walrus1 = 0;
        int walrus2 = 0;
        int hehe = 0;
        for (int i = 0; i < arr.length; i++) {
            walrus1 = arr[i];
            if (walrus1 > before) {
                before = walrus1;
                hehe = i;
            }
        }
        arr[hehe] = -20000000;
        for (int i = 0; i < arr.length; i++) {
            walrus2 = arr[i];
            if (walrus2 > omega) {
                omega = walrus2;
            }
        }

        return omega;
    }

    // This method is given a word, and it checks to see
    // if it was spelled correctly. The method only considers
    // words in the array dictionary as valid words
    // The method returns true is the word is spelled correctly
    // and false otherwise
    public static boolean spellCheck(String word) {
        // Don't edit this array
        // This is our dictionary of valid words
        String[] dictionary = {"the","of","and","a","to","in","is","you","that","it","he","was","for","on","are","as","with","his","they","I","at","be","this","have","from","or","one","had","by","word","but","not","what","all","were","we","when","your","can","said","there","use","an","each","which","she","do","how","their","if","will","up","other","about","out","many","then","them","these","so","some","her","would","make","like","him","into","time","has","look","two","more","write","go","see","number","no","way","could","people","my","than","first","water","been","call","who","oil","its","now","find","long","down","day","did","get","come","made","may","cat","dog","cats","dogs"};

        for(int i = 0; i < dictionary.length; i++) {
            if (word == dictionary[i]) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] s = reverse(new int[] {1, 2, 4, 5});
        System.out.println(reverse(s));
    }
}
