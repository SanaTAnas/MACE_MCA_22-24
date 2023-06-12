class Main{
   public static void main(String a[]){
      show();
      Main f=new Main();
      f.disp();
     }
     static void show(){
        System.out.println("This is static method");
        }
     void disp(){
     System.out.println("This is not a static function it is involked by an object");
     }}
