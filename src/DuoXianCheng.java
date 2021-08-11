public class DuoXianCheng {

    private static int i = 0;
    private static Object Lock = new Object();
    public static void main(String[] args) {

        Thread thread1 = new Thread(){
            public void run(){
                while(i < 10){
                    synchronized (Lock){
                        if (i % 2 == 0){
                            System.out.println("0-" + i++ );
                        }
                            Lock.notifyAll();
                            try {
                                Lock.wait(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                    }
                }
            }
        };

        Thread thread2 = new Thread(){
            public void run(){
                while (i < 10){
                    synchronized (Lock){
                        if (i % 2 == 1){
                            System.out.println("1-" + i++);
                        }else {
                            Lock.notifyAll();
                            try{
                                Lock.wait(1000);
                            } catch (InterruptedException e){
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        };
        thread1.start();
        thread2.start();
    }
}
