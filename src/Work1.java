public class Work1 {
    private int x=50;
    private int y=50;
    //the above two are called properties

    public Work1(int num1,int num2){
        this.x=num1;
        this.y=num2;
    }
    public void sum(){
        int result=this.x+this.y;
        System.out.println("the result is"+result);
    }
    public void sub(){
        int result=this.x-this.y;
        System.out.println("The subtraction of values is"+result);
    }
    public void multiply(){
        int result=this.x*this.y;
        System.out.println("The multiplication of values is"+result);
    }
    public void Division(){
        int result=this.x/this.y;
        System.out.println("The division of values is"+result);
    }
    public static void main (String[] args){
        Work1 o1=new Work1(400,500);
        o1.sum();
        o1.sub();
        o1.multiply();
        o1.Division();


    }
}
