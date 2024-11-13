public class StingComparisons {
    public static void main(String[] args) {
        //equals() and equalsIgnoreCase()
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Good-bye";
        String s4 = "HELLO";
        System.out.println(s1 + " equals " + s2 + " is " + s1.equals(s2));
        System.out.println(s1 + " equals " + s3 + " is " + s1.equals(s3));
        System.out.println(s1 + " equals " + s4 + " is " + s1.equals(s4));
        System.out.println(s1 + " equalsIgnoreCase " + s4 + " is " +s1.equalsIgnoreCase(s4));

        /* 
         * string1.regionMatches(int startIndex, String str2, int str2StartIndex,int numChars)
         * Outputs boolean
         * compares specific regions inside two strings
         * To compare by ignoring cases:
            string1.regionMatches(boolean ignoreCase,int startIndex, String str2, int str2StartIndex,int numChars)
         * start of the indeces are also included when comparing.

        */

        String str1 = "Hey this is me" ; 
        String str2 = "sss this is me" ; 
        System.out.println("Is the given parts equal?" + str1.regionMatches(2,str2,2,5));
        System.out.println("Is the given parts equal?" + str1.regionMatches(3,str2,3,5));

        //str1.startsWith(str2) and str1.endsWith(str2)
        System.out.println("Does Football end with ball? "+"Football".endsWith("ball"));
        System.out.println("Does Football end with bal? "+"Football".endsWith("bal"));
        System.out.println("Does Football start with Foo? "+"Football".startsWith("Foo"));
        System.out.println("Does Football end with Food? "+"Football".startsWith("bal"));


        //equals() vs ==
        /* 
            equals() compares characters of two strings at their respective 
            positions while '==' operator compares the object reference 
            to see whether they refer to the same instances.
        */ 

        String str3 = "Lmao";
        String str4 = new String(str3);
        System.out.println("Is str3 equals() str4? "+ str3.equals(str4));
        System.out.println("Is str3 == str4? "+ (str3==str4));
    }
}
