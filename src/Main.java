public class Main {
    public static void main(String[] args) {

        Hogwarts hogwarts = new Hogwarts();

        Gryffindor harry = new Gryffindor("Гарри Поттер", 12, 46, 34, 2, 89);
        Gryffindor hermyona = new Gryffindor("Гермиона Грейнджер", 34, 55, 4, 2, 1);
        Gryffindor ron = new Gryffindor("Рон Уизли", 5, 42, 76, 12, 8);

        Hufflepuff zacharias = new Hufflepuff("Захария Смит", 2, 65, 14, 47, 96);
        Hufflepuff cedric = new Hufflepuff( "Седрик Диггори", 76, 75, 74, 3, 56);
        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли", 34, 56, 3, 67, 87);

        Ravenclaw cho = new Ravenclaw("Чжоу Чанг", 5,39,22,78, 94, 45);
        Ravenclaw padme = new Ravenclaw("Падма Патил", 4,6,78,32, 47, 23);
        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 85,75,64,53, 24, 94);

        Slytherin drako = new Slytherin("Драко Малфой", 35, 78, 32, 72, 12, 45, 51);
        Slytherin graham = new Slytherin("Грэхэм Монтегрю", 78, 76, 18, 3, 6, 39, 99);
        Slytherin gregory = new Slytherin("Грегори Гойл", 77, 88,22, 11, 91, 44, 55);

        //2 задание
        hogwarts.printStudent(drako);
        //3 задание
        hogwarts.compareGryffindorStudents(harry, hermyona);
        hogwarts.compareHufflepuffStudents(cedric, justin);
        hogwarts.compareRavenclawStudents(padme, cho);
        hogwarts.compareSlytherinStudents(gregory, drako);
        //4 задание
        hogwarts.compareAnyStudents (harry, zacharias);

    }
}