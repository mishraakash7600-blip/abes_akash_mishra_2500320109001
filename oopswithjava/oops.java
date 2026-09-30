public class oops{
    public static void main(String[] args) {
        pen p1=new pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.SetTip(5);
        System.out.println(p1.tip);
        p1.color="yellow";
        System.out.println(p1.color);

        bankaccount myaccount=new bankaccount();   //OBJECT CREATION OF THE CLASS BANKACCOUNT
        myaccount.username="akash_mishra";
        // myaccount.password="ifuhuifnsdmnfiewuhrf";    due to private 
        myaccount.set_password("hbgfdsbfddjsdc");
        
    }

}

class bankaccount{   //THIS IS A CLASS
    public String username;
    private String password;

    public void set_password(String pwd){
        password=pwd;
    }
}

class pen{
    String color;
    int tip;

    void setColor(String NewColor){
        color = NewColor;
    }

    void SetTip(int newtip){
        tip= newtip;
    }
}