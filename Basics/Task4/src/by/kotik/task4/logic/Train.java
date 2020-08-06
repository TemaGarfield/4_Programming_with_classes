package by.kotik.task4.logic;

public class Train {
    private String destination;
    private int trainNumber;
    private String time;

    public Train() {
    }

    public Train(String destination, int trainNumber, String time) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.time = time;
    }
    
    

    public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void showTrain() {
        System.out.println(getDestination() + " " + getTrainNumber() + " " + getTime());
    }

    public static void sortTrainNumber(Train[] trains) {
        for (int i = 0; i < trains.length; i++) {
            for (int j = trains.length - 1; j > i; j--) {
                if (trains[i].getTrainNumber() > trains[j].getTrainNumber()) {
                    Train tmp = trains[i];
                    trains[i] = trains[j];
                    trains[j] = tmp;
                }
            }
        }

    }

    public boolean showUserTrain(int userNumber) {
        if (userNumber == getTrainNumber()) {
            return true;
        }

        return false;
    }

    public static void sortDestination(Train[] trains) {
        for (int i = 0; i < trains.length; i++) {
            for (int j = trains.length - 1; j > i; j--) {
                if (trains[i].getDestination().compareTo(trains[j].getDestination()) > 0) {
                    Train tmp = trains[i];
                    trains[i] = trains[j];
                    trains[j] = tmp;
                } else if (trains[i].getDestination().compareTo(trains[j].getDestination()) == 0) {
                    if (trains[i].getTime().compareTo(trains[j].getTime()) > 0) {
                        Train tmp = trains[i];
                        trains[i] = trains[j];
                        trains[j] = tmp;
                    }
                }
            }
        }
    }
}
