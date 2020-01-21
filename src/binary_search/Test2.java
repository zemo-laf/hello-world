package binary_search;

public class Test2 {
    public static void main(String[] args){
        kaiFang(1.4,1.5);
        System.out.println("====mid:"+Math.sqrt(2));
    }
    static void kaiFang(double low,double high){
        while(high-low>1e-10){
            double mid=(low+high)/2;
            System.out.println("mid:"+mid+"=====>mid^2:"+mid*mid);
            if(mid*mid<=2){
                low=mid;
            }else{
                high=mid;
            }
        }
    }
}
