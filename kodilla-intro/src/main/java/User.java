public class User {
    private int age;
    private String name;


    public static void main(String [] args){
       User[] users = new User[5];
       users[0] = new User(28, "Michal");
       users[1] = new User(26, "Klaudia");
       users[2] = new User(34, "Adam");
       users[3] = new User(45, "Andrzej");
       users[4] = new User(57, "Eustachy");

       System.out.println("Srednia wieku to " + policzSrednia(users));


       for (int i = 0; i < users.length; i++) {
           if (users[i].getAge() < policzSrednia(users)) {
               System.out.println(users[i].getName());
           }
       }

    }
    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public static double policzSrednia(User[] users){
    int srednia = 0;
    int rozmiar = users.length;
    if (rozmiar == 0) {
        return 0.0;
    } else {
        for (int i = 0; i < users.length; i++) {
            srednia = srednia + users[i].getAge();
        }
        return (double) srednia / users.length;
    }
    }

}
