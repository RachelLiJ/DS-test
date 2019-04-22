
public class AgeGroup {

    public static void main(String[] args){
        int num= age(1979);
        age_group(num);
    }

    public static int age(int year){
        int num=0;
        num=2019-year;
        return num;
    }

    public static String age_group(int pra){
        double b=0.0;
        String a = null;
        if(b==0.0){

        }
        if(pra<=30){
            a="30-";
        } else if(pra>30 && pra<50){
            a="30-50";
        } else if(pra>50){
            a="50+";
        }
        if(a.equals(null)){
            a=c;
        }
        return a;
    }
}
