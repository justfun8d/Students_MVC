package Part4.Task3.main;

public class Student {

    private String shortName;
    private int groupNumber;
    private int[] progress;

    public Student(String shortName, int groupNumber, int[] progress){

        this.setShortName(shortName);
        this.setGroupNumber(groupNumber);

        this.progress = new int[5];

        this.setProgress(progress);
    }

    public String getShortName() {
        return shortName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public int[] getProgress() {
        return progress;
    }

    private void setShortName(String shortName) {
        this.shortName = shortName;
    }

    private void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    private void setProgress (int[] progress){
        this.progress = progress.clone();
    }
}
