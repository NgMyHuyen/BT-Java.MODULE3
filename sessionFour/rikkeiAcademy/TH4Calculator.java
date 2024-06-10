package sessionFour.rikkeiAcademy;

public class TH4Calculator {
    double a,b;
    public TH4Calculator(double a, double b){
        this.a=a;
        this.b=b;
    }

    public double sum(){
        return this.a + this.b;
    }
    public double minus(){
        return this.a - this.b;
    }
    public double multiplication(){
        return this.a * this.b;
    }
    public double division(){
        return this.a / this.b;
    }
}
