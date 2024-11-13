public class RevRec {
    public static void main(String[] args) {
        String s = "This is realy nice stuff" ;
        Rev lolclass = new Rev();
        lolclass.reverse(s);
        lolclass.getReversedString();
    }
}

class Rev{
    int count = 0;
    StringBuffer strbfr = new StringBuffer();
    void reverse(String s){
        char str[] = s.toCharArray();
        count++ ;
        if(count<s.length()){
            reverse(s);
        }
        strbfr.append(str[--count]);
    }
    void getReversedString(){
        System.out.println(strbfr);
    }
}
