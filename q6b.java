import java.io.IOException;

class A{
    void m1() throws IOException{
        System.out.println("In m A");
    }
}
class B extends A{
    void m1() throws Exception{   // if the throws IOException then it will not generate error
        System.out.println("In m1 B");
    }
}
public class q6b {
    
public static void main(String[] args) {
    A a=new B();
    try{
        a.m1();
    }
    catch(IOException e){
        e.printStackTrace();
    }
}
}