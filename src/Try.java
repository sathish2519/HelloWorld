public class Try {
    int id;
    String name;
    void display(int v1,String v2){
        this.id=v1;
        this.name=v2;
        System.out.println("Nmae is"+ " " +name+" "+"id is"+" "+id);

    }
    public static void main(String[] args) {
        Try t1=new Try();
       t1.display(20,"sathish");
    }
}
