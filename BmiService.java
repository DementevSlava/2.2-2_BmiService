package Blok_4_Testability.Z2_Bmi;

public class BmiService {
    public static double calculate(int weight, int height){
        return (double) weight * 100 * 100 / height / height;
    }

}
