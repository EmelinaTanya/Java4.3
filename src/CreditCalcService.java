public class CreditCalcService {
    public double calculate(double percent, long credit, double periodInMonths){
        double part = 1 + (percent / 12);
        double degree =  Math.pow(part, periodInMonths);
        double payment = credit * ((percent / 12) + ((percent / 12)/(degree - 1)));// расчет аннуитетного платежа
        return payment;
    }
}