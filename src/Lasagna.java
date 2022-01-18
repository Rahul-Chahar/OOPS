/*
 *Author Name: Rahul Chahar
 *IDE: IntelliJ IDEA Community Edition
 *Date: 18/01/2022
 */

public class Lasagna {
    // define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }


    // define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualMinutesLasagnaHasBeenInOven){
        return (expectedMinutesInOven() - actualMinutesLasagnaHasBeenInOven);
    }

    // define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numberOfLayersYouAddedToLasagna){
        return (2*numberOfLayersYouAddedToLasagna);
    }


    //  define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numberOfLayersYouAddedToLasagna, int numberOfMinutesLasagnaHasBeenInOven){
        return ((numberOfLayersYouAddedToLasagna*2)+numberOfMinutesLasagnaHasBeenInOven);
    }

    public static void main(String args []){
        Lasagna lasagna1 = new Lasagna();
        lasagna1.expectedMinutesInOven();

        Lasagna lasagna2 = new Lasagna();
        lasagna2.remainingMinutesInOven(30);

        Lasagna lasagna3 = new Lasagna();
        lasagna3.preparationTimeInMinutes(2);

        Lasagna lasagna4 = new Lasagna();
        lasagna4.totalTimeInMinutes(3, 20);


    }
}
