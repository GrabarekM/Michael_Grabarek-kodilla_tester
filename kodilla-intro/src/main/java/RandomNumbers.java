public class RandomNumbers {
    private int suma;
    private int max;
    private int min;

    public static void main(String[] args) {

        RandomNumbers randomNumber = new RandomNumbers();
        randomNumber.numberGenerator();
        System.out.println(randomNumber.getSuma());
        System.out.println(randomNumber.minValue());
        System.out.println(randomNumber.maxBalue());
    }

    public RandomNumbers() {
        this.suma = 0;
        this.min = 31;
        this.max = -1;
    }

    public void numberGenerator() {
        for (int i = 0; suma <= 5000; i++) {
            int number = (int) (Math.random() * 31);
            suma = suma + number;

            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
    }
    public int getSuma() {
        return suma;
    }
    public int minValue(){
        return min;
    }
    public int maxBalue(){
        return max;
    }
}



