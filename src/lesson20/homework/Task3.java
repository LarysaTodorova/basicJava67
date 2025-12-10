package lesson20.homework;

import java.util.Scanner;

public class Task3 {
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
        System.out.println("Please, enter fuel price per liter: ");
        double fuelPrice = scanner.nextDouble();
        double totalCost = calculateFuelCost(distance, fuelConsumption, fuelPrice);
        generateTripReport(distance, fuelConsumption, fuelPrice, totalCost);

    }

    public static double calculateFuelCost(double distance, double fuelConsumption, double fuelPrice) {
        double totalFuelConsumption = (distance / 100) * fuelConsumption;
        return totalFuelConsumption * fuelPrice;
    }

    public static void generateTripReport
            (double distance, double fuelConsumption, double fuelPrice, double totalCost) {
        System.out.println("Trip cost report: distance " + distance + " , fuelConsumption " + fuelConsumption
                + " , fuelPrice " + fuelPrice + " , totalCost " + totalCost);
    }
}
