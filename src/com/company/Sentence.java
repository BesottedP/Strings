package com.company;

public class Sentence {
    private String currSent;
    /** Constructs a new Sentence object. */
    public Sentence(String p) {
        currSent = p;
    }
    /** Returns a string containing the current sentence. */
    public String toString() {
        return currSent;
    }
    /** Returns the index of the nth occurrence of str in the current sentence;
     * returns -1 if the nth occurrence does not exist.
     * Precondition: str.length() > 0 and n > 0
     * Postcondition: the current sentence is not modified.
     */
    public int findNthTime(String str, int n) {
        int x = -1;
        for(int i = 1; i<=n; i++){
            x = currSent.indexOf(str, x+1);
            if (x==-1){
                return -1;
            }
        }
        return x;
    }
    /** Modifies the current sentence by replacing the nth occurrence of str with repl
     * If the nth occurrence does not exist, the current sentence is unchanged.
     * Precondition: str.length() > 0 and n > 0
     */
    public void replaceNthTime(String str, int n, String repl) {
        int sb = findNthTime(str, n);
            int end = currSent.length();
            if(sb > 0){
                String newcurrSent = "";
                newcurrSent += currSent.substring(0, sb);
                newcurrSent += repl;
                newcurrSent += currSent.substring(sb + str.length());
                currSent = newcurrSent;
            }
        }
    /** Returns the index of the last occurrence of str in the current sentence:
     * returns -1 if str is not found.
     * Precondition: str.length() > 0
     * Postcondition: the current sentence is not modified.
     */
    public int findLastTime(String str) {
        return 0;
    }

    public static void main(String[] args) {
        Sentence sentence1 = new Sentence("A cat ate late.");
        System.out.println(sentence1.findNthTime("at",1));
        sentence1.replaceNthTime("at", 1, "rane");
        System.out.println(sentence1);

        Sentence sentence2 = new Sentence("A cat ate late.");
        System.out.println(sentence2.findNthTime("at",6));
        sentence2.replaceNthTime("at", 6, "xx");
        System.out.println(sentence2);

        Sentence sentence7 = new Sentence("A cat ate late.");
        System.out.println(sentence7.findNthTime("at",3));
        sentence7.replaceNthTime("at", 3, "xx");
        System.out.println(sentence7);

        Sentence sentence3 = new Sentence("A cat ate late.");
        System.out.println(sentence3.findNthTime("bat",2));
        sentence3.replaceNthTime("bat", 2, "xx");
        System.out.println(sentence3);

        Sentence sentence4 = new Sentence("aaaa");
        System.out.println(sentence4.findNthTime("aa", 1));
        sentence4.replaceNthTime("aa", 1, "xx");
        System.out.println(sentence4);

        Sentence sentence5 = new Sentence("aaaa");
        sentence5.replaceNthTime("aaa", 2, "bbb");
        System.out.println(sentence5);
//
//        Sentence sentence6 = new Sentence("A cat ate late.");
//        System.out.println(sentence6.findLastTime("at"));
//        System.out.println(sentence6.findLastTime("cat"));
//        System.out.println(sentence6.findLastTime("bat"));
    }

}