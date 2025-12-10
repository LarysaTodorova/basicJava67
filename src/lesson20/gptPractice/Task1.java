package lesson20.gptPractice;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
Напишите программу, которая помогает пользователю рассчитать общую стоимость поездки на автомобиле.
Программа должна запрашивать у пользователя информацию о расстоянии до пункта назначения, расходе топлива на 100 км,
цене топлива за литр и выводить итоговую стоимость поездки.
Программа должна использовать методы и конкатенацию строк.
Создайте метод getTripInfo(), который будет: Запрашивать у пользователя расстояние до пункта назначения (в км),
расход топлива на 100 км (в литрах) и цену топлива за литр.
Сохранять эти данные в отдельные переменные.
Вызывать метод calculateFuelCost(double distance, double fuelConsumption, double fuelPrice),
который будет: Возвращать общую стоимость топлива для поездки.
Затем метод getTripInfo() должен вызвать метод generateTripReport
(double distance, double fuelConsumption, double fuelPrice, double totalCost),
который будет: Выводить отчёт о стоимости поездки, используя конкатенацию строк.
 */

        getTripInfo();

    }

    public static void getTripInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the distance to the destination: ");
        double distance = scanner.nextDouble();
        System.out.println("Please, enter fuel consumption per 100 km: ");
        double fuelConsumption = scanner.nextDouble();
        System.out.println("Choose fuel type:");
        System.out.println("1 - Petrol");
        System.out.println("2 - Diesel");
        System.out.println("3 - Electric");

        int choice = scanner.nextInt();
        double fuelPrice;

        switch (choice) {
            case 1:
                fuelPrice = 2.5;
                break;
            case 2:
                fuelPrice = 2.2;
                break;
            case 3:
                fuelPrice = 0.30;
                break;
            default:
                System.out.println("Invalid option");
                return;
        }
        String unit = (choice == 3) ? "€/kWh" : "€/L";
        double[] totalCost = calculateFuelCost(distance, fuelConsumption, fuelPrice);
        generateTripReport(distance, fuelConsumption, fuelPrice, totalCost, unit);

    }

    public static double[] calculateFuelCost(double distance, double fuelConsumption, double fuelPrice) {
        double liter = (distance / 100) * fuelConsumption;
        double roundedLiter = Math.round(liter * 100.0) / 100.0;
        double cost = liter * fuelPrice;
        double roundedCost = Math.round(cost * 100.0) / 100.0;
        return new double[]{roundedLiter, roundedCost};
    }

    public static void generateTripReport
            (double distance, double fuelConsumption, double fuelPrice, double[] totalCost, String unit) {
        double liters = totalCost[0];
        double cost = totalCost[1];

        System.out.println("\nTrip cost report:");
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fuel consumption: " + fuelConsumption + " L/100km");
        System.out.println("Fuel price: " + fuelPrice + " " + unit);
        System.out.println("Fuel needed: " + liters + " L");
        System.out.println("Total cost: " + cost + " €");
    }


}
