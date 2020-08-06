package by.kotik.task3.logic;

public class Student {
    private String name;
    private int groupNumber;
    private int [] marks = new int[5];

    public Student(String name, int groupNumber, int[] marks) {
        this.name = name;
        this.groupNumber = groupNumber;
        this.marks = marks;
    }
    
    

    public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getGroupNumber() {
		return groupNumber;
	}



	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}



	public int[] getMarks() {
		return marks;
	}



	public void setMarks(int[] marks) {
		this.marks = marks;
	}



	public void showStudent() {
        System.out.println("Name: " + getName() + " Group: " + getGroupNumber());
    }

    public void showGreatStudent() {
        int counter = 0;
        for (int i = 0; i < getMarks().length; i++) {
            if (getMarks()[i] > 8) {
                counter++;
            }
        }

        if (counter == marks.length) {
           showStudent();
        }
    }
}
