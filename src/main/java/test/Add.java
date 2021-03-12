package test;

public class Add {

    public int add(int a, int b) {
        return a + b;

    }
    public int addCopy(int a, int b) {
        return a + b;
    }
}

class Subtraction{
    public int sub(int a,int b){
        if(a > 0) return b;
        else return a;
    }
}
class SubtractionCopy{
    public int sub(int a,int b){
        if(a > 0) return b;
        else return a;
    }
}