public class LeanYear {
    public static void main(String[] args) {
        int year = 2019;
        if (isLeapYear(year)) {
            System.out.println("The year is leap");
        } else {
            System.out.println("The year is not leap");
        }
    }
    private static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }
}
