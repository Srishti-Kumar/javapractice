package classpracticeJAVA5;

public class thisKeyword {

    int x;
    thisKeyword(int x){
        this.x  = x;
    }
    public static void main(String[] args){

        thisKeyword obj1 = new thisKeyword(5);
        thisKeyword obj2 = new thisKeyword(7);
        System.out.println(obj1.x);
        System.out.println(obj2.x);

    }

}
