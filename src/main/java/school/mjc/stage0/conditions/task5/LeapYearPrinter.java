package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public static void isLeapYear(int year) {
        int remainderBy4 = year % 4;
        int remainderBy100 = year % 100;
        int remainderBy400 = year % 400;

        switch (remainderBy4) {
            case 0:
                switch (remainderBy100) {
                    case 0:
                        switch (remainderBy400) {
                            case 0:
                                System.out.println("leap");
                                break;
                            default:
                                System.out.println("not leap");
                        }
                        break;
                    default:
                        System.out.println("leap");
                }
                break;
            default:
                System.out.println("not leap");
                break;
        }
    }
    public static void main(String[] args) {
        isLeapYear(2024);
    }
}
