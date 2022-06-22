package lesson5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class HomeWork_3 {
    public static void main(String[] args) throws IOException {
            //Базовый уровень (для зачета нужно сделать хотя бы 2 из 3)
            //Задача №1
            //Дано: у нас есть две модели машин - жигули и toyota. Каждая из этих машин умеет: начинать движение,
            //останавливаться, включать фары. У жигули есть особенность: она ломается. У Toyota особенность: включает музыку
            //Необходимо:
            // 1.Создать абстрактный класс, который будет описывать общие действия этих машин (методы будут не абстрактные)
            // 2.Создать два класса, которые будут наследоваться от абстрактного класса, и реализовывать особенности этих машин
            // Методы должны просто печатать на экран действия машин (начал движение, включил музыку и тд.)

        Lada lada = new Lada();
        lada.carBrocken();
        Toyota toyota = new Toyota();
        toyota.musicOn();

        //Задача №2
            //Необходимо:
            // 1. Создать папку resource, пометить ее как папку Resourсe root.
            // 2. Создать в ней файл "my_first_file.txt". На первой строке написать: "Моя бабушка", на второй: "читает газету жизнь"
            // 3. Прочитать файл, и вывести на экран все слова файла в одну строку
            // Ожидаемый результат: "Моя бабушка читает газету жизнь"

        FileReader fileReader = new FileReader("D:\\Buh_project\\resource\\my_first_file.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String result = "";
        while (bufferedReader.ready()) {
            result += bufferedReader.readLine() + " ";
        }                                 
        System.out.println(result.trim());
        fileReader.close();

            //Задача №3
            //Необходимо:
            // 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
            // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
            // 3. Создать объект этого класса прямо здесь (class Homework3, метод main), с доходами 500, расходами 300
            // 4. Записать в файл "report.txt" данные из объекта класса.
            // Ожидаемый результат: в файле report.txt - одна строка: доходы = 500, расходы 300

        Financial_record financial_record = new Financial_record(500, 300);
        FileWriter fileWriter = new FileWriter("D:\\Buh_project\\resource\\report.txt");
        String reporting = String.join(";",
                String.valueOf(financial_record.getIncomes()),
                String.valueOf(financial_record.getOutcomes()));
        fileWriter.write(reporting + "\n");
        fileWriter.close();
        
        //Продвинутый уровень
            //Задача №1
            // Сделать задачу №1 из базовой.
            // 1. Создать класс CarFactory, у которого есть два статических методы: создать жигули, создать toyota.
            // 2. Создать 20 тойот, 20 жигулей с помощью CarFactory, положить их в один массив.
            // 3. Пройтись по массиву, проверить к какому классу принадлежит машина, привести тип к классу машины
            // и вызвать характерные для нее методы.

        Car[] newCars = new Car[40];
        for (int i = 0; i < newCars.length / 2; i++) {
            newCars[i] = CarFactory.createLada();
            newCars[i + newCars.length / 2] = CarFactory.createToyota();
        }
        for (Car customCar : newCars) {
            if(customCar instanceof Lada) {
                Lada myCar = (Lada) customCar;
                myCar.carBrocken();
            } else if (customCar instanceof Toyota) {
                Toyota myCar = (Toyota) customCar;
                myCar.musicOn();
            }
        }

            //Задача №2
            // 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
            // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
            // 3. Создать 10 отчетов, с разными доходами и расходами (Смотри класс new Random(1).nextInt() )
            // 4. Записать в файл "report.txt" все данные из отчетов.
            // 5. Прочитать файл report.txt, просуммировать все доходы и вывести на экран, тоже самое с расходами
            // Ожидаемый результат: общие доходы - (какое то число), общие расходы - (какое то число)

        int incomesResult = 0;
        int outcomesResult = 0;
        Random random = new Random(1);
        Financial_record[] reportings = new Financial_record[10];
        FileWriter fileWriter2 = new FileWriter("D:\\Buh_project\\resource\\report.txt", true);
        for (int i = 0; i < reportings.length; i++) {
              reportings[i] = new Financial_record(random.nextInt(1000), random.nextInt(1000));
            String currentReport = String.join(";",
                                        String.valueOf(reportings[i].getIncomes()),
                                        String.valueOf(reportings[i].getOutcomes()));
            fileWriter2.write(currentReport + "\n");
        }
        fileWriter2.close();
        FileReader fileReader2 = new FileReader("D:\\Buh_project\\resource\\report.txt");
        BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
        while (bufferedReader2.ready()) {
            String currentReport = bufferedReader2.readLine();
            String[] dataArray = currentReport.split(";");
            incomesResult += Integer.parseInt(dataArray[0]);
            outcomesResult += Integer.parseInt(dataArray[1]);
        }
        fileReader2.close();
        System.out.println("Общие доходы " + incomesResult + ", общие расходы " + outcomesResult);
    }

}
