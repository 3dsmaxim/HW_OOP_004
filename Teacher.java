import java.time.LocalDate;
import java.util.Comparator;

public class Teacher extends User implements Comparator<Teacher> {

    private Long teacherId;
    private int groupId;

    public Teacher() {

    }

    public Teacher(long teacherId, int groupId, String firstName, String secondName, String patronymic,
            LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "Teacher{" + 
                "teacherId=' " + teacherId+ '\'' + "groupId='" + groupId + '\'' +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", patronymic='" + super.getPatronymic() + '\'' +
                ", dateOfBirth=" + super.getDateOfBirth() +
                '}';
    }

    public int compare(Teacher teacher) {
        return teacher.teacherId.compareTo(teacherId);
    }

    @Override
    public int compare(Teacher o1, Teacher o2) {
        
        return this.teacherId.compareTo(teacherId);
    }

}