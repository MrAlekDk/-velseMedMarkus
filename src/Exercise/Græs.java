package Exercise;

public class Græs {

    public final double vækstrate = 0.8;


    public Græs(){

    }

    public double antaldage(double højde, double max){

        if(højde>max){
            return 0;
        }
        else{
            return max/vækstrate-højde;
        }

    }

}
