public class DemoAchitareBrut {
    public static void main(String[] args) {
        double ore = 25;
        double oreleLucrateDeMine = 37.5;
        calculareBrut(8);
        calculareBrut(ore);
        calculareBrut(oreleLucrateDeMine);
    }
    public static void calculareBrut(double ore){
        final double RATA_STANDARD = 13.75;
        double brut ;
        brut = ore * RATA_STANDARD;
        System.out.println(ore + " ore cu achitarea in dolari " + RATA_STANDARD+" pe ora va fi $"+brut);
    }
}
