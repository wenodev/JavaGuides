public class DayEnumTest {
    public static void main(String[] args) {
        final DayEnum firstDay = new DayEnum(Day.MONDAY);
        firstDay.tellItLikeItIs();

        final DayEnum thirdDay = new DayEnum(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();

        final DayEnum fifthDay = new DayEnum(Day.FRIDAY);
        fifthDay.tellItLikeItIs();

        final DayEnum sixthDay = new DayEnum(Day.SATURDAY);
        sixthDay.tellItLikeItIs();

        final DayEnum seventhDay = new DayEnum(Day.SUNDAY);
        seventhDay.tellItLikeItIs();


        final DayEnum dayEnum = new DayEnum();
        dayEnum.mapEnum(Day.THURSDAY);

    }
}
