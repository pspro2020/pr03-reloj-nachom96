public class Thread01 implements Runnable{

    private int hora, min, seg;

    public Thread01(int hora, int min, int seg){
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }

    @Override
    public void run() {

        while (!Thread.currentThread().isInterrupted()){
            System.out.println(segundos_Reloj());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

                return;
            }
        }

    }

    public String segundos_Reloj(){
       String hora_actual = "";

       if (hora < 10){
           hora_actual += "0" + hora;
       } else {
           hora_actual += hora;
       }
       hora_actual += ":";

        if (min < 10){
            hora_actual += "0" + min;
        } else {
            hora_actual += min;
        }
        hora_actual += ":";

        if (seg < 10){
            hora_actual += "0" + seg;
        } else {
            hora_actual += seg;
        }
        seg++;

        if (seg == 60){
            min++;
            seg = 0;
        }
        else if(min ==  60){
            hora++;
            min = 0;
        }
        else if (hora == 24){
            hora = 0;
        }

        return hora_actual;

    }
}
