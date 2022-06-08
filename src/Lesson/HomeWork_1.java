package Lesson;

public class HomeWork_1 {
    public static void main(String[] args) {
//Базовый уровень
        //Задача №1
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';

        String result = hi.trim() + world.toLowerCase() + newLine;
        System.out.print(result.repeat(3));

        //Задача №2
        double height = 1.78;
        int weight = 80;
        System.out.println(weight / (height * height));

        //Задача №3
        char[] myArray = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(myArray);
        myArray[3] = 'h';
        System.out.println(myArray);

        //Продвинутый уровень
        //Задача №1
        String myNumbers = "234";
        String myText = "some_text";
        int answer = Integer.parseInt(myNumbers) + myText.length();
        System.out.println(answer);

        //Задача №2
        //Посчитать (a+b)^2 = ?, при a=3, b=5
        int a = 3;
        int b = 5;
        System.out.println("(a+b)^2 = " + (int) Math.pow((a + b), 2));

        //Задача №3
        int[] Array1 = {1, 2, 5, 7, 10};
        int[] Array2 = {2, 3, 2, 17, 15};
        int[] Array3 = new int[15];

        for (int i = 0; i < Array1.length; i++) {
            Array3[i] = Array1[i];
            Array3[i + 5] = Array2[i];
            Array3[i + 10] = Array1[i] * Array2[i];
        }
        for (int i : Array3) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Задача №4
        String words = "Hello world!";
        System.out.println(words.replaceAll("l", "r").toUpperCase().substring(0, 8));

        //Экспертный уровень
        //Задача №1

        String client1 = "<client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client>";
        String client2 = "<client>(Какие то данные)<data></data></client>";
        String client3 = "<client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client>";

        System.out.println(dataMasking(client1));
        System.out.println(dataMasking(client2));
        System.out.println(dataMasking(client3));
    }

    static String dataMasking(String text) {

        int startIndex = text.indexOf("<data>");
        int endIndex = text.indexOf("</data>");
        if (endIndex - startIndex == 6)
        {
            return text;
        }
        String workData = text.substring(startIndex + 6, endIndex);
        String[] words = workData.split(";");
        for (int i = 0; i < words.length; i++)
        {
            if (words[i].matches("\\d{11}"))
            {
                words[i] = words[i].substring(0,4) + "***" + words[i].substring(7);
            }
            if (words[i].matches("(.*)@(.*)"))
            {
                words[i] = words[i].substring(0,words[i].indexOf("@") - 1) + "*@*****" + words[i].substring(words[i].indexOf("."));
            }
            if (words[i].matches("(.*) (.*)"))
            {
               String[] names = words[i].split(" ");
               words[i] = names[0].substring(0,1) + "****" + names[0].substring(names[0].length() - 1) + " " + names[1] + " " + names[2].substring(0,1) +".";
            }
        }
        if (words.length == 3)
        {
            workData = words[0] + ";" + words[1] + ";" + words[2];
        }
        else
        {
            workData = words[0] + ";" + words[1];
        }

        return text.substring(0, startIndex + 6) + workData + "</data></client>";
    }
}
