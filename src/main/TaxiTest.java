package main;

import model.Taxi;
import service.TaxiService;

import java.util.Scanner;

public class TaxiTest {
    public static void main(String[] args) {


        TaxiService service = new TaxiService();
        Taxi taxi1 = service.create();
        Taxi taxi2 = service.create();
        Taxi taxi3 = service.create();
        Taxi[] taxis = {taxi1, taxi2, taxi3};
        Scanner scanner = new Scanner(System.in);
        boolean isActive = true;
        while (isActive) {
            System.out.println("Enter command number");
            System.out.println("1.  print cost and topSpeed if the taxi is sport otherwise print model and country");
            System.out.println("2.  return the Taxi which one is newer (if they have the same age return first one).");
            System.out.println("3.  print country of the Taxi with smallest seats count (if they have the same - print first).");
            System.out.println("4.  print all not sport Taxis.");
            System.out.println("5.  print all sport Taxis which were road more than 50000 km (millage).");
            System.out.println("6.  return the Taxi with minimal weight (if there are some of them return last one).");
            System.out.println("7.  return the Taxi with minimal cost from all sport Taxis (if there are some of them return first one).");
            System.out.println("8.  print Taxis in ascending from order by year.");

            int c = scanner.nextInt();
            switch (c) {
                case 1:
                    service.task1(taxi1);
                    break;
                case 2:
                    service.task2(taxi2, taxi3).printInfo();
                    break;
                case 3:
                    service.task3(taxi2, taxi1, taxi3);
                    break;
                case 4:
                    service.task4(taxis);
                    break;
                case 5:
                    service.task5(taxis);
                    break;
                case 6:
                    service.task6(taxis).printInfo();
                    break;
                case 7:
                    service.task7(taxis).printInfo();
                    break;
                case 8:
                    service.task8(taxis);
                    break;
                default:
                    System.out.println("Invalid command number");
            }
        }
    }
}
