public class DayEnum {
    private Day day;

    public DayEnum(){

    }

    public DayEnum(Day day) {
        this.day = day;
    }

    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;

            case FRIDAY:
                System.out.println("Fridays are better.");
                break;

            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;

            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }

    public void mapEnum(Day day){
        switch (day) {
            case MONDAY:
                System.out.println("This is Monday");
                break;

            case FRIDAY:
                System.out.println("This is Friday");
                break;

            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;

            default:
                System.out.println("Midweek days");
                break;
        }
    }






}
