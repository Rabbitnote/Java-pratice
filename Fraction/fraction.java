public class fraction{
 int numerator;
 int denominator;
 public fraction(int numr,int denr){
     numerator=numr;
     denominator=denr;
     reduce();
 }
 public int getnumerator(){
    return numerator;
 }
 public void setnumerator(int numerator){
     this.numerator=numerator;
 }
 public int getdenominator(){
     return denominator;
 }
 public void setdenominator(int denominator){
     this.denominator=denominator;
 }
 public int calgcd(int numerator,int denominator){
     if(numerator%denominator==0){
         return denominator;
     }
     return calgcd(denominator,numerator%denominator);
 }
 public void reduce(){
     int gcd = calgcd(numerator, denominator);
     numerator = numerator/gcd;
     denominator=denominator/gcd;
 }
 public fraction add(fraction fractionsecond){
     int numer = (numerator*fractionsecond.getdenominator())+(fractionsecond.getnumerator()*denominator);
    int denr = denominator*fractionsecond.getdenominator();
    return new fraction(numer,denr);
    }
    public fraction subtract(fraction fractionsecond){
        int newnumerator = (numerator *fractionsecond.denominator)-(fractionsecond.denominator);
        int newdenominator = denominator*fractionsecond.denominator;
        fraction result = new fraction(newnumerator,newdenominator);
        return result;
    }
    public fraction multiply(fraction fractionsecond) {
        int newnumerator = numerator * fractionsecond.numerator;
        int newdenominator = denominator * fractionsecond.denominator;
        fraction result = new fraction(newnumerator, newdenominator);
        return result;
    }
    public fraction divide(fraction fractionsecond) {
        int newnumerator = numerator * fractionsecond.getdenominator();
        int newdenominator = denominator * fractionsecond.numerator;
        fraction result = new fraction(newnumerator, newdenominator);
        return result;
        }
    public String toString(){
        return this.numerator+"/"+this.denominator;
    }
}