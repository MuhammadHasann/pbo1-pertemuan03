package percabangan;

public class IfElseCondition {
    public static void main(String[] args) {
        double uangBelanja = 3000;
        double totalBelanja = 5000;

        if(totalBelanja<uangBelanja){
            System.out.println("uang pas, bulik hati-hati kolo di rampok");
        }else if(totalBelanja>uangBelanja){
            double angsul = totalBelanja-uangBelanja;
            System.out.println("uang cukup, nah nang angsulannya " + angsul);
        }else{
            System.out.println("uang pas, dah bulik sana");
        }
    }
}
