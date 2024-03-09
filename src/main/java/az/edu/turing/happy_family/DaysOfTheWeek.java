package az.edu.turing.happy_family;

public enum DaysOfTheWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    public static DaysOfTheWeek name(String day){
        for (DaysOfTheWeek value : DaysOfTheWeek.values()){
            if (value.name().equalsIgnoreCase(day)) {
                return value;
            }
        }
        return null;
    }
}
