import java.math.BigDecimal;
import java.math.RoundingMode;

public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("Вывод характеристик компьютера");
        byte ram = 16;
        short releaseYear = 2023;
        int ssdСapacity = 1024;
        byte cpuСores = 8;
        short batteryСapacity = 70;
        float screenSize = 14.2f;
        double weight = 1.55;
        int displayRefreshRate = 120;
        char firmwareVersion = 'Z';
        boolean hasFastCharging = true;
        System.out.println("Год выпуска: " + releaseYear);
        System.out.println("Оперативная память: " + ram + " RAM");
        System.out.println("Объем накопителей SSD: " + ssdСapacity + " Gb");
        System.out.println("Количество ядер процессора: " + cpuСores);
        System.out.println("Емкость аккумулятора: " + batteryСapacity + " (Вт/ч)");
        System.out.println("Диагональ экрана: " + screenSize + "\"");
        System.out.println("Вес: " + weight + " кг");
        System.out.println("Частота обновления экрана: " + displayRefreshRate + " Гц");
        System.out.println("Наличие быстрой зарядки: " + hasFastCharging);
        System.out.println("Версия прошивки: " + firmwareVersion);

        System.out.println("\nРасчет стоимости товара со скидкой");
        var penPrice = new BigDecimal("105.5");
        var bookPrice = new BigDecimal("235.83");
        var totalPrice = penPrice.add(bookPrice).setScale(2, RoundingMode.HALF_UP);
        int discountPercent = 11;
        BigDecimal discountRate = new BigDecimal(discountPercent).divide(new BigDecimal("100"), 2, RoundingMode.HALF_UP);
        var discountSum = totalPrice.multiply(discountRate).setScale(2, RoundingMode.HALF_UP);
        var discountPrice = totalPrice.subtract(discountSum);
        var penDiscount = penPrice.multiply(discountRate).setScale(2, RoundingMode.HALF_UP);
        var bookDiscount = bookPrice.multiply(discountRate).setScale(2, RoundingMode.HALF_UP);
        var penPriceDiscount = penPrice.subtract(penDiscount);
        var bookPriceDiscount = bookPrice.subtract(bookDiscount);
        System.out.println("Cтоимость товаров без скидки: \n" + "Ручка - " + penPrice + " руб.\n" + "Книга - " +
                bookPrice + " руб.");
        System.out.println("Cумма скидки: " + discountSum + " руб.");
        System.out.println("Стоимость товаров со скидкой: " + discountPrice + " руб.\n" + "Стоимость ручки со скидкой: "
                + penPriceDiscount + " руб.\n" + "Стоимость книги со скидкой: " + bookPriceDiscount + " руб.");

        System.out.println("\nВывод слова JAVA");
        System.out.println("    J    a  v     v  a");
        System.out.println("    J   a a  v   v  a a");
        System.out.println(" J  J  aaaaa  V V  aaaaa");
        System.out.println("  JJ  a     a  V  a     a");

        System.out.println("\nВывод min и max значений целых числовых типов");
        byte b = 127;
        short s = 32_767;
        int i = 2_147_483_647;
        long ln = 9_223_372_036_854_775_807L;
        char c = 65_535;
        System.out.println("Первоначальное значение");
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(ln);
        System.out.print(c);
        System.out.println("Значение после инкремента на единицу");
        System.out.println(++b);
        System.out.println(++s);
        System.out.println(++i);
        System.out.println(++ln);
        System.out.print(++c);
        System.out.println("Значение после декремента на единицу");
        System.out.println(--b);
        System.out.println(--s);
        System.out.println(--i);
        System.out.println(--ln);
        System.out.println(--c);

        System.out.println("Перестановка значений переменных");
        int digit1 = 2;
        int digit2 = 5;
        System.out.println("Исходные значения переменных: " + digit1 + " и " + digit2);
        System.out.println("Перестановка с помощью третьей переменной");
        int tmp = digit1;
        digit1 = digit2;
        digit2 = tmp;
        System.out.println(digit1 + " " + digit2);
        System.out.println("Перестановка с помощью арифметических операций");
        digit1 = digit1 + digit2;
        digit2 = digit1 - digit2;
        digit1 = digit1 - digit2;
        System.out.println(digit1 + " " + digit2);
        System.out.println("Перестановка с помощью побитовой операции ^");
        digit1 = digit1 ^ digit2;
        digit2 = digit1 ^ digit2;
        digit1 = digit1 ^ digit2;
        System.out.println(digit1 + " " + digit2);

        System.out.println("Вывод символов и их кодов");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';
        System.out.printf("%d $\n", (int) dollar);
        System.out.printf("%d *\n", (int) asterisk);
        System.out.printf("%d @\n", (int) atSign);
        System.out.printf("%d |\n", (int) verticalBar);
        System.out.printf("%d ~\n", (int) tilde);

        System.out.println("\nВывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char underScore = '_';
        char openBracket = '(';
        char closeBracket = ')';
        char backslash = '\\';
        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underScore + openBracket + " " + closeBracket + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println(slash + "" + underScore + underScore + underScore + underScore + slash + backslash +
                underScore + underScore + backslash);

        System.out.println("\nМанипуляции с сотнями, десятками и единицами числа");
        int num = 543;
        int hundreds = num / 100;
        int tens = (num % 100) / 10;
        int units = num % 10;
        int sumDigits = hundreds + tens + units;
        int productDigits = hundreds * tens * units;
        System.out.println("Число " + num + " содержит:");
        System.out.println("  сотен - " + hundreds);
        System.out.println("  десятков - " + tens);
        System.out.println("  единиц - " + units);
        System.out.println("Сумма разрядов = " + sumDigits);
        System.out.println("Произведение разрядов = " + productDigits);

        System.out.println("\nПеревод секунд в часы, минуты и секунды");
        int totalSeconds = 86399;
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    }
}
