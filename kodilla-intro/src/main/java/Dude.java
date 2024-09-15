public class Dude {
    double age;
    double height;
    String name;

    public Dude(double age, double height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }
    public void checkDude() {
        if (this.name != null) {
            if (this.age > 30 && this.height > 160) {
                System.out.println("User is old");
            } else {
                System.out.println("User is 30");
            }
        }

    }

public static void main(String[] args) {

    Dude guy = new Dude(30.5, 178, "Adam");
    guy.checkDude();
}


}
