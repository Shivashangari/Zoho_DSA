package DSA_Basics;

public class StringBufferStringBuilder {
    public void stringBuffer(){
        StringBuffer name=new StringBuffer("Pooja");
        System.out.println(name.reverse());
    }
    public void stringBuilder(){
        StringBuilder stringBuilder=new StringBuilder("Vijay");
        System.out.println(stringBuilder.reverse());
    }

    public static void main(String[] args) {
        StringBufferStringBuilder stringBufferStringBuilder=new StringBufferStringBuilder();
        stringBufferStringBuilder.stringBuffer();
        stringBufferStringBuilder.stringBuilder();
    }
}
