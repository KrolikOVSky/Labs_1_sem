import java.util.Date;
public class Lab1
{
    public static void main(String [] arg)
    {
        Date d;
        d = new Date();
        int countOfStudents = 228;
        int sizeOfCash = 10000;
        int commonSize = countOfStudents * sizeOfCash;
        System.out.println("Программу выполнил: ");
        System.out.println("Садриев Алан Эмильевич");
        System.out.print("Шифр группы, ");
        System.out.println("ИВТ/б-19-2-о");
        System.out.println("Дата, " + d);
        System.out.println("Номер варианта: 23");
        System.out.println("Количество студентов сдавших сессию на 4 и 5: " + countOfStudents);
        System.out.println("Размер стипендии в рублях: " + sizeOfCash);
        System.out.println("Размер стипендиального фонда в рублях: " + commonSize);
        System.out.println("Проверил: ");
        System.out.println("Грабовец Роман Александрович");
    }
}