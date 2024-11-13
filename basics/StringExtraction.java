

public class StringExtraction {
    public static void main(String[] args) {
        String str = "I am a String lol, use me however you want";
        //charAt
        System.out.println(str.charAt(2));
        System.out.println("abcd".charAt(3));
        /*
         getChars()
            -Used to get moe than one character at a time
            -getChars(int sourceStart,int sourceEnd, char target[], int targetStart)
            -the extracted substring contains characters from sourceStart to sourceEnd-1
            -the exracted substring is stored at a target array at location targetStart
        */

        int start = 2;
        int end = 15 ; 
        
        char target[] = new char[(end - start)];

        str.getChars(start, end,target,0);
        System.out.println(target);

        /*
         * getBytes()
            * Used to extract characters from an array of bytes
            * Uses default character to byte convertion
                – Most Internet protocols and text file formats use 8-bit
                ASCII for all text interchange.
        */

        /* 
         * toCharArray()
            *Converts all characters in a String object into a 
            character array
        */
        int count = 0;
        for(char c : str.toCharArray()){
            System.out.print(count+"."+c+" ");
            count++;
        }

    }
}
