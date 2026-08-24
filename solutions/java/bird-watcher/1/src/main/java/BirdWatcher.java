
class BirdWatcher {
    private final int[] birdsPerDay;
//    private static int[] birdsPerDayCopy;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
//        birdsPerDayCopy  = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new BirdWatcher(new int[]{0, 2, 5, 3, 7, 8, 4}).birdsPerDay.clone();
    }

    public int getToday() {
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        int count = getToday();
        count++;
        this.birdsPerDay[this.birdsPerDay.length - 1] = count;
    }

    public boolean hasDayWithoutBirds() {
        boolean hasBirds = false;
        for(int i = 0; i < this.birdsPerDay.length; i++) {
            if(this.birdsPerDay[i] == 0) {
                return hasBirds = true;
            }
        }
        return hasBirds;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;

        if(numberOfDays < this.birdsPerDay.length){
            for(int i = 0; i < numberOfDays; i++) {
                count += this.birdsPerDay[i];
            }
        }else {
            for(int i = 0; i < this.birdsPerDay.length; i++) {
                count += this.birdsPerDay[i];
            }
        }

        return count;
    }

    public int getBusyDays() {
        int count = 0;
        for(int i = 0; i < this.birdsPerDay.length - 1; i++) {
            if(this.birdsPerDay[i] >= 5) {
                count++;
            }
        }
        return count;
    }
}
