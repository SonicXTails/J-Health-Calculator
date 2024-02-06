import java.util.Scanner;

public class HealthCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваш текущий вес в килограммах:");
        double weight = scanner.nextDouble();

        System.out.println("Введите ваш рост в метрах:");
        double height = scanner.nextDouble();

        System.out.println("Введите ваш возраст:");
        int age = scanner.nextInt();

        // Вычисление ИМТ
        double IMT = weight / (height * height);

        // Вычисление идеального веса
        double idealWeight = 24.9 * (height * height);

        // Вычисление рекомендуемых калорий
        double recommendedCalories = 655.1 + (9.6 * weight) + (1.85 * (height*100)) - (age * 4.68);

        if (IMT > 24.9) {
            double weightDiff = weight - idealWeight;
            recommendedCalories -= 500;
            System.out.println("Рекомендуется снизить вес для достижения идеального веса. Идеальный вес: " + (int)idealWeight + " кг. " + "Необходимо сбросить: " + (int)Math.abs(weightDiff) + " кг. Рекомендуемый дневной прием калорий: " + (int)recommendedCalories + " ккал.");
        }
        else if (IMT < 18.5) {
            double weightDiff = idealWeight - weight;
            recommendedCalories += 500;
            System.out.println("Рекомендуется увеличить потребление пищи для набора веса. Идеальный вес: " + (int)idealWeight + " кг. " + "Необходимо набрать: " + (int)weightDiff + " кг. Рекомендуемый дневной прием калорий: " + (int)recommendedCalories + " ккал.");
        }
        else {
            System.out.println("Ваш вес находится в пределах нормы. Идеальный вес: " + (int)idealWeight + " кг. Рекомендуемый дневной прием калорий: " + (int)recommendedCalories + " ккал.");
        }
    }
}