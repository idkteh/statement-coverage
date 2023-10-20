public class StatementCoverage {

    public String tempIndicator (int temp){
        if (temp > 20){
            return "hot";
        } else if (temp > 10){
            return "warm";
        }else{
            return "cold";
        }
    }
}
