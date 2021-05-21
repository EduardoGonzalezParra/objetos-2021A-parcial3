package uaslp.objetos.exams;

public class Student {
    private String name;
    private int code;
    private Integer score[];

    public Student(String name, int code){
        this.code=code;
        this.name=name;
        score =new Integer[3];
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public void setScore(int index, int score) {
        if(index>3 || index <1)
        {
            try {
                throw new InvalidPartialException();
            } catch (InvalidPartialException e) {
                e.printStackTrace();
            }
        }
        this.score[index-1] = score;
    }

    public double getAverage() {
        double average = 0;
        for (int i=0;i<3;i++){
            if (score[i] == null) {
                try {
                    throw new MissingScoreException("Missing partial "+ (i+1));
                } catch (MissingScoreException e) {
                    e.printStackTrace();
                }
            }
            average =average + score[i];
        }
        average = average/3;
        return average;
    }}
