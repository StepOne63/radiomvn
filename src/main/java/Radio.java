public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int anotherStation) {
        if (anotherStation <= 9) {
            if (anotherStation >= 0) {
            }
            this.currentStation = anotherStation;
        }
    }

    public void next() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }


    public void prev() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }


    }

    public int getCurrentVolume() {
        return currentVolume;


    }



    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void setCurrentVolume(int newVolume) {
        if(newVolume >= 0) {
            if(newVolume <= 100){
                this.currentVolume = newVolume;
            }
        }
        this.currentVolume = newVolume;
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }



    }


}







