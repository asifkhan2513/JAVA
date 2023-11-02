
class a extends Thread{
    public void run(){
        System.out.println("my name is asif");
     }
    public static void main(String[] args) {
      a t = new a();
        
        t.start();
        
    }
}