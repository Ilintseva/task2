public class Main {
    public static void main(String[] args) {
// Исходные данные
        int currentBalance = 100; // начальный баланс на счёте клиента
        int depositAmount = 1100; // сумма пополнения

// Параметры программы
        int bonusThreshold = 1000; // порог для начисления бонусов
        int bonusRate = 100; // 1 рубль за каждые 100 рублей пополнения

// Переменная для хранения бонуса
        int bonus = 0;

// Проверяем, превышает ли сумма пополнения порог
        if (depositAmount > bonusThreshold) {
            bonus = depositAmount / bonusRate; // рассчитываем количество бонусных рублей
        }

// Рассчитываем итоговый счёт с учётом бонусов
        int finalBalance = currentBalance + depositAmount + bonus;

// Выводим итоговый счёт и бонусные рубли на экран
        System.out.println("Бонусные рубли: " + bonus);
        System.out.println("Итоговый счёт: " + finalBalance);
    }
}