
public class Student {
    private int id;
    private String name;
    private String major;
    private int semester;
    private int year;
    private String gender;

    public Student(int id, String name, String major, int semester, int year, String gender) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.semester = semester;
        this.year = year;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public int getSemester() {
        return semester;
    }

    public int getYear() {
        return year;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Major: " + major +
                ", Semester: " + semester + ", Year: " + year + ", Gender: " + gender;
    }
}