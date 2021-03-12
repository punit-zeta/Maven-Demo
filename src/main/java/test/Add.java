package test;

public class Add {

    public int add(int a, int b) {
        a = 10;
        b = 5;
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
