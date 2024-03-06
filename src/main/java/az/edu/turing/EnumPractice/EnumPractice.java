package az.edu.turing.EnumPractice;

public class EnumPractice {
    public static void main(String[] args) {
     //   DaysOfTheWeek day = DaysOfTheWeek.monday;
       /* if (day.equals(DaysOfTheWeek.friday)){
            System.out.println("Yeahh, it's almost mondayyy");
        } else System.out.println("Another day :(");*/

        /*if (day == DaysOfTheWeek.monday){
            System.out.println("Yeahh, it's almost mondayyy");
        }*/
        for (Chips myChips : Chips.values()){
            System.out.println(myChips);
        }
        System.out.println("======");
        Chips myChip = Chips.PRINGLES;
        System.out.print("Brand: " + myChip.brand + " ");
        System.out.print("Price: " + myChip.price + "usd ");
        System.out.println("levelOfDeliciousness: " + myChip.levelOfDeliciousness);
    }
}
