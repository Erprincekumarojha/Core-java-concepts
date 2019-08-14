class DaemonDemo implement Runnable{

   Thread th;
   DaemonDemo(){
     th=new Thread(this);
     th.start();
   }
   public void run(){
   System.out.println("Run:"+th.isDaemon());
   }
}
class Test30_DaemonDemo{
  public static void main(String args[]){

  }

}