
public class Pay {
    public double[] PayYear(double a){
        //a это месячная плата
        double netto=0;
        double sum = a*12;//общая сумма без налога.
        
        double strah = sum *0.016;
        
        if(sum >14400 && sum<25200){
            netto = 6000-6000 / 10800 *(sum - 14400);
        }else if(sum<=14400){
            netto = 6000;
        }else{
            netto=0;
        }
        
        double yearsPay = (sum - netto - strah) *0.2;
        if(yearsPay<0) yearsPay = 0;
        
       
        
        return new double[] {yearsPay/12 , a *0.016,(sum-yearsPay-strah)/12};
        
        
        
             
            
        
        
        
    }
    
}
