public class CutieDemo {
    public static void main(String[] args) {

        // declaram alocam si initializam obiecte ale clasei Cutie
        Cutie cutiaMea1 = new Cutie(10, 20, 15);
        Cutie cutiaMea2 = new Cutie(3, 6, 9);
        double volum;

        //returnam volumul primei cutii
        volum = cutiaMea1.volum();
        System.out.println("Volumul primei cutii este " +volum);

        //volumul la a doua cutie
        volum = cutiaMea2.volum();
        System.out.println("Volumul la a doua cutie este " +volum);
    }
}
