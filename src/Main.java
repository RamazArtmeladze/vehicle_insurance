import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your vehicle type");
        System.out.println("car, truck, bus, motorcycle");
        Scanner scan = new Scanner (System.in);
        String type = scan.nextLine();
        int premium = 0;
        switch (type) {
            case "car":
                premium = 200;
                break;
            case "truck":
                premium = 300;
                break;
            case "bus":
                premium = 400;
                break;
            case "motorcycle":
                System.out.println("Enter your motorcycle type (number): ");
                System.out.println("1 - low power, 2 - medium, 3 - high");
                String motorCycleType = scan.nextLine();
                int motorcycleInt = Integer.parseInt(motorCycleType);
                switch (motorcycleInt){
                    case 1:
                        premium = 300;
                        break;
                    case 2:
                        premium = 400;
                        break;
                    case 3:
                        premium = 500;
                        break;
                    default:
                        System.out.println("Unknown motorcycle type");
                }
                break;
            default:
                System.out.println("Unknown vehicle type");
        }
        scan.close();
        System.out.println("The premium is $ " + premium);

    }
}