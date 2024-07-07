public class PassByValueExample1{
    int a =10;
    int b=20;
    public static void main(String ar[]){
        PassByValueExample1 obj=new PassByValueExample1();
        System.out.println("Values before change:"+obj.a+" "+obj.b);
        changeValue(obj);
         System.out.println("Values after change:"+obj.a+" "+obj.b);
    }
    private static void changeValue(PassByValueExample1 obj){
        obj.a=obj.a+10;
        obj.b=obj.b+10;
    }
}