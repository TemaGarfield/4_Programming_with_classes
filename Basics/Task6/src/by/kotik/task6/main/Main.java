package by.kotik.task6.main;

import by.kotik.task6.logic.Time;

/*
 * 6. Составьте описания класса для представления времени.
 * Предусмотрите возмжность установки времени и изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых
 * значений.
 * В случае недопустимых значений полей поле устанавливается в значение 0.
 * Создать методы изменения времени на заданное количество часов, минут и секунд.*/

public class Main {

	public static void show(int h, int m, int s) {
	    System.out.println("Time: " + h + ":" + m + ":" + s);
	}

	public static void main(String[] args) {
	    Time time = new Time(11, 70, -25);

	    show(time.getHours(), time.getMinutes(), time.getSeconds());
	    time.editHours(11, "+");
	    show(time.getHours(), time.getMinutes(), time.getSeconds());
	    time.editMinutes(23, "+");
	    show(time.getHours(), time.getMinutes(), time.getSeconds());
	    time.editSeconds(59, "+");
	    show(time.getHours(), time.getMinutes(), time.getSeconds());
	}
}
