public class MainThread {

    public static void main(String[] args) throws InterruptedException {

        Thread reloj = new Thread(new Thread01(10, 27, 15));

        reloj.start();

        Thread.sleep(12000);
        reloj.interrupt();

        System.out.println("El hilo secundario ya ha terminado de ejecutarse");

    }
}
