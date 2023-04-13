
class Iris {
    private final double a; //Sepal Length
    private final double b; //Sepal Width
    private final double c; //Sepal Length
    private final double d; //Sepal Width
    private final String name;
    public Iris(double a,double b,double c,double d, String Name){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.name=Name;
    }

    public double getA(){
        return a;
    }

    public double getB(){
        return b;
    }

    public double getC(){
        return c;
    }
    public double getD(){
        return d;
    }
    public String getName(){
        return name;
    }
}