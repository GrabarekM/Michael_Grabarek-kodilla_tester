public class Grades {
    private int[] grades;
    private int size;

    public static void main(String[] args) {

        Grades ocena = new Grades();
        ocena.add(1);
        ocena.add(5);
        ocena.add(3);
        ocena.add(5);
        ocena.add(4);

        System.out.println("Ostatnia ocena to " + ocena.getLast());
        System.out.println("średnia ocen to " + ocena.getAverage());
    }

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int getLast() {
        if (this.size == 0) {
            return -1;
        } else {
            return this.grades[this.size - 1];
        }
    }

    public double getAverage() {
        if (this.size == 0) {
            return 0;
        } else {
            double average = 0;
            for (int i = 0; i < this.size; i++) {
                average = average + this.grades[i];
            }
           double wyliczone = average / this.size;
            return wyliczone;
        }
    }
}
