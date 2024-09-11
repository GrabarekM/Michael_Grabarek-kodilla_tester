public class BMI {
    public static void main(String[] args) {
        double waga = 80;
        double wzrost = 1.78;
        double bmi = kalkulatorBmi(waga, wzrost);
        double okragleBmi = Math.round(bmi * 100.0) / 100.0;
        System.out.println("Twój wynik BMI to" + " " + okragleBmi);
        wyplucieBMI(bmi);
    }

    public static double kalkulatorBmi(double waga, double wzrost) {
        double wynikBmi = waga / (wzrost * wzrost);
        return wynikBmi;
    }
    public static void wyplucieBMI(double bmi) {
        if (bmi > 40) {
            System.out.println("Otyłość skrajna");
        } else if (bmi > 35 && bmi <= 39.99) {
            System.out.println("II stopień otyłości");
        } else if (bmi > 30 && bmi <= 34.99) {
            System.out.println("I stopień otyłości");
        } else if (bmi > 25 && bmi <= 29.99) {
            System.out.println("Nadwaga");
        } else if (bmi > 18.50 && bmi <= 24.99) {
            System.out.println("Wartość prawidłowa");
        } else if (bmi < 18.49) {
            System.out.println("Niedowaga");
        }
    }

}