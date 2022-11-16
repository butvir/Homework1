package advanced;

public class Task3 {
    public static void main(String[] args) {
        boolean hasFuel = true;
        boolean hasElectricsProblem = false;
        boolean hasMotorProblem = false;
        boolean hasTransmissionProblem = false;
        boolean hasWheelsProblem = true;

        int sum = 0;
        int kol = 0;
        if (hasFuel == false && (hasElectricsProblem == false && hasMotorProblem == false && hasTransmissionProblem == false && hasWheelsProblem == false)){
            sum+=1000;
        } else if (hasFuel) {
            if (hasMotorProblem){
                sum+=10000;
                kol++;
            }

            if (hasElectricsProblem) {
                sum+=5000;
                kol++;
            }

            if (hasTransmissionProblem) {
                sum+=4000;
                kol++;
            }

            if (hasWheelsProblem) {
                sum+=2000;
                kol++;
            }

            if (kol == 2) {
                sum *=0.9;
            }

            if (hasTransmissionProblem && (hasElectricsProblem || hasMotorProblem)) {
                sum*=0.8;
            } 
        }
        System.out.println("Счет клиента " + sum);


    }
}
