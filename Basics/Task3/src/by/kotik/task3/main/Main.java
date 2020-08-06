package by.kotik.task3.main;

import by.kotik.task3.logic.Student;

/*
 * 3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
 * Создайте массив из 10 элементов такого типа. Добавьте возможность вывода фамилии и номеров групп студентов имеющих оценки, равные
 * только 9 или 10.  */

public class Main {

	public static void main(String[] args) {

        Student[] students = new Student[10];
        students[0] = new Student("Иванов И.И", 123123, new int[]{9, 10, 9, 10, 9});
        students[1] = new Student("Петров П.П.", 111222, new int[] {4, 4, 4, 4, 4});
        students[2] = new Student("Сидоров И.К.", 131626, new int[] {4, 5, 6, 4, 7});
        students[3] = new Student("Золотов Д.И.", 345789, new int[] {5, 7, 9, 10, 8});
        students[4] = new Student("Козлов В.Ф.", 777888, new int[] {10, 10, 9, 10, 10});
        students[5] = new Student("Васильев А.А.", 561342, new int[]{10, 10, 10, 10, 10});
        students[6] = new Student("Ивончик А.А.", 561456, new int[]{6, 8, 10, 7, 4});
        students[7] = new Student("Василюк П.Р.", 234571, new int[]{7, 8, 6, 5, 4});
        students[8] = new Student("Протченко И.А.", 777777, new int[]{7, 10, 9, 8, 7});
        students[9] = new Student("Джобс С.П.", 632182, new int[]{8, 9, 9, 9, 9});
        System.out.println("Students: ");
        for (Student student:students) {
            student.showStudent();
        }

        System.out.println("\nGreat students: ");
        for (Student student:students) {
            student.showGreatStudent();
        }

	}

}
