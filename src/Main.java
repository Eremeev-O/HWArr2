import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
// Задание №1
        System.out.println("Задание №1");
        int[] costAmount = {11000, 11501, 10001, 7800, 13000};
        int sum = 0;
        for ( int i: costAmount) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
// Задание №2
        System.out.println("Задание №2");
        int minCost = costAmount [0];
        int maxCost = minCost;
        for ( int i: costAmount) {
            if ( minCost > i ) {
                minCost = i;
            }
            if ( maxCost < i ) {
                maxCost = i;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minCost + " рублей. Максимальная сумма трат за неделю составила " + maxCost + " рублей");
// Задание №3
        System.out.println("Задание №3");
        sum = 0;
        float averageCost = 0f;
        for ( int i: costAmount) {
            sum += i;
        }
        averageCost = (float) sum / costAmount.length ;
        System.out.println("Средняя сумма трат за месяц составила " + averageCost + " рублей");
// Задание №4
        System.out.println("Задание №4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char tmp;
        int count = reverseFullName.length;
        for ( int i = 0; i < count / 2; i++ ) {
            tmp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[count - i - 1];
            reverseFullName[count - i - 1] = tmp;
        }
        for (char i: reverseFullName) {
            System.out.print(i);
        }
        System.out.println();
    }
}