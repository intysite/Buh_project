package lesson4;

public class HomeWork_2 {
    public static void main(String[] args) {

        // Базовый уровень
        // Задание №1 - Написать цикл, который выводит через пробел 100 чисел с приставкой "a".
        // Ожидаемый результат: 1а 2а 3а .. 100а

        for (int i = 1; i <= 100; i++) {
            System.out.print(i + "a ");
        }
        System.out.println();

        // Задание №2
        // Дано:
        int ageChildren = 10;
        // Задача: Написать условную конструкцию, которая в зависимости от возраста ребенка, отправляет его в учебное заведение
        // если ребенку до 6 лет то в сад, если до 11 лет в младшую школу, если до 17 лет в среднюю школу, иначе в университет
        // Отправляет - имеется в виду, печатает на экран: "пошел с сад", "пошел в младшую школу" и т.д.
        // Проверьте работоспособность условий, через изменение значения переменной.

        if (ageChildren < 6) {
            System.out.println("пошел в сад");
        } else if (ageChildren < 11) {
            System.out.println("пошел в младшую школу");
        } else if (ageChildren < 17) {
            System.out.println("пошел в среднюю школу");
        } else {
            System.out.println("пошел в университет");
        }

        // Задание №3
        // Дано:
        boolean chicken = true;
        boolean vegetables = true;
        boolean sour = false;
        boolean toast = true;
        boolean sausage = true;
        boolean eggs = true;
        // Задача: Повара попросили сделать салат.
        // Если у повара есть все ингредиенты для "Цезаря" (курица, овощи, соус и гренки), то лучше сделать "Цезарь".
        // Если для "Цезаря" ингредиентов не нашлось, то сделать Оливье (овощи, колбаса или курица, яйца).
        // Если и для Оливье не нашлось ингредиентов, то сделать Овощной салат (нужны только овощи).
        // Если ингредиентов нет, то повар объявляет: У меня ничего нет
        // Написать набор условий, приготовления салатов, по приоритету (от Цезаря к овощному). Либо объявить о невозможности сделать салат.
        // Ожидаемый результат: вывод на экран сделанного салата или объявление о том, что ничего нет.
        // Проверьте работоспособность условий, через изменение значения переменных.

        if (chicken && vegetables && sour && toast) {
            System.out.println("Цезарь");
        } else if (vegetables && (sausage || chicken) && eggs) {
            System.out.println("Оливье");
        } else if (vegetables) {
            System.out.println("Овощной салат");
        } else {
            System.out.println("Невозможно сделать салат");
        }
        if (!chicken && !vegetables && !sour && !toast && !sausage && !eggs) {
            System.out.println("Ингредиентов нет");
        }

        // Задание №4
        // Создать два класса, которые описывают какое либо животное (имеют два атрибута).
        // Написать к ним конструктор, сеттеры, геттеры.

        Animal leopard = new Animal(8, "Africa");
        System.out.println(leopard.getData());
        leopard.setAge(9);
        leopard.setHabitat("India");
        System.out.println(leopard.getData());

        SeaAnimal dolphin = new SeaAnimal(300, "Catalina");
        dolphin.setWeight(310);
        dolphin.setResearchProject("Escaped");
        System.out.println(dolphin.getWeight() + " " + dolphin.getResearchProject());

        // Продвинутый уровень
        // Задание №1: Написать цикл, который будет прибавлять число к result до тех пор,
        // пока не получиться больше 1_000_000.
        // Дано:
        double increment = 0.01123;
        double result = 0;
        // Вывести на экран, количество итераций, которое потребовалось, чтобы дойти до миллиона.
        // Если число отрицательное, то сразу заканчиваем цикл, ничего не выводя.
        // Внимание: число может измениться, и не должно приводить к изменению вашего кода.

        long count = 0;
        while (result <= 1_000_000) {
            if (increment <= 0) {
                break;
            }
            result += increment;
            count++;
        }
        System.out.println("Число итераций составило: " + count);

        // Задание №2: Дан массив единиц, произвольной длины. Создать цикл, который заменяет каждый четный элемент на 0;
        // Например, дано: [1,1,1,1,1]
        // Ожидаемый результат: [0,1,0,1,0]
        // Подсказка: прочитай про операнд "%".

        // Вариант 1
        int[] dataArray = {1, 1, 1, 1, 1};
        for (int i = 0; i < dataArray.length; i++) {
            if (i % 2 == 0) {
                dataArray[i] = 0;
            }
        }
        for (int num : dataArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Вариант 2
        int[] arrayNumbers = {1, 1, 1, 1, 1};
        for (int i = 0; i < arrayNumbers.length; i += 2) {
            arrayNumbers[i] = 0;
        }
        for (int num : arrayNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Задание №3:
        // Дано:
        boolean hasFuel = true;
        boolean hasElectricsProblem = true;
        boolean hasMotorProblem = true;
        boolean hasTransmissionProblem = false;
        boolean hasWheelsProblem = false;
        // В автосервис приехала сломанная машина. Механики находят неисправность следующим способом:
        // Если у машины нет бензина и ничего не сломано, то отдают машину владельцу и берут 1000 рублей за консультацию.
        // Если у машины проблема с двигателем, то чинят и берут 10 000.
        // Если у машины проблема с электрикой, то чинят и берут 5000.
        // Если у машины проблема с коробкой передач, то чинят и берут 4000.
        // Если у машины проблема с колесами, то чинят и берут 2000.
        // Если две детали сломаны, то на общий счет идет скидка 10%.
        // Если сломана коробка передач, и электрика или двигатель, то на общий счет скидка 20%.
        // Если нет бензина и что-то сломано, то за консультацию денег не берут.
        // Ситуации, что бензин есть и ничего не сломано - быть не может.
        // Ожидаемый результат: выведен на экран счет клиенту.

        int check = 0;
        int countProblems = 0;
        if ((!hasFuel && !hasElectricsProblem && !hasMotorProblem && !hasTransmissionProblem && !hasWheelsProblem)) {
            check += 1000;
        }
        if (hasFuel) {
            if (hasMotorProblem) {
                check += 10000;
                countProblems++;
            }
            if (hasElectricsProblem) {
                check += 5000;
                countProblems++;
            }
            if (hasTransmissionProblem) {
                check += 4000;
                countProblems++;
            }
            if (hasWheelsProblem) {
                check += 2000;
                countProblems++;
            }
            if (hasTransmissionProblem && (hasElectricsProblem || hasMotorProblem)) {
                check = (int) (check * 0.8);
            } else if (countProblems == 2) {
                check = (int) (check * 0.9);
            }
        }
        System.out.println("Сумма за ремонт автомобиля составляет " + check + " рублей.");

        // Задание №4:
        // Написать систему управления складскими запасами. Создать класс склад, создать класс работники
        // (написать геттеры на все аттрибуты).
        // Количество работников минимум 3.
        // Работники берут из склада товар, и портят его. Нужно написать взаимодействие через методы работников и склад:
        // Работник берет из склада товар, на складе товар уменьшается. Работник когда взял товар, выводит на экран
        // "Ура я испортил водку!" и добавляет к себе в журнал количество испорченного товара.
        // У склада есть только одна позиция - Водка.

        Warehouse outskirts = new Warehouse(100);
        Worker atos = new Worker("Atos");
        Worker portos = new Worker("Portos");
        Worker aramis = new Worker("Aramis");

        atos.setTakeGoods(outskirts, 20);
        System.out.println(atos.getLogBook());

        portos.setTakeGoods(outskirts, 70);
        System.out.println(portos.getLogBook());

        aramis.setTakeGoods(outskirts,15);
        System.out.println(aramis.getLogBook());

        System.out.println("Остаток на складе: " + outskirts.getBalanse());

    }
}
