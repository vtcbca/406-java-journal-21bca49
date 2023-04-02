class solution4{
    public void display(String s1,String s2){
        System.out.println("The Concated String is:"+(s1+s2));
    }
    public void display(int a,int b){
        System.out.println("The Addition of "+a+" and "+b+" is:"+(a+b));
    }
    public static void main(String args[]){
        solution4 o=new solution4();
        o.display("Wellcome to"," Vnsgu Website");
        o.display(5,10);
        
    }
}
