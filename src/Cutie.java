public class Cutie {
    double latime;
    double inaltime;
    double adancime;
    // constructorul pentru Cutie
    Cutie(double l, double i, double a){

        latime = l;
        inaltime = i;
        adancime = a;
    }
    //calculam si returnam volumul cutiei
    double volum (){
        return latime*inaltime*adancime;
    }
}
