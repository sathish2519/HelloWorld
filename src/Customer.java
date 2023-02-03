public class Customer {
    private String name;
     private int customerId;
    private String address;
    private Boolean isMarried;

    Customer(String v1,int v2,String v3,Boolean v4 ){
        this.name=v1;
        this.customerId=v2;
        this.address=v3;
        this.isMarried=v4;
    }
    public void display(){
        System.out.println("The name of the customer is:" +this.name);
        System.out.println("The customer id is:"+this.customerId);
        System.out.println("The customer address is:"+this.address);
        System.out.println("The customer marriage status:"+this.isMarried);

    }
    public static  void main(String []args){
        Customer c1=new Customer("Sathish",222,"perur",false);
        Customer c2=new Customer("Sathish",222,"perur",false);
        Customer listarr[]={c1,c2};
        for(Customer i:listarr){
            i.display();

        }

    }
}
