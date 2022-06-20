package school.system;

import java.util.List;

public class school {

    /**
     *
     * teachers - multiple (dynamic) arraylist
     * students - multiple (dynamic) arraylist
     * earnings - single (dynamic)
     * spent - single (dynamic)
     *
     **/

    private List<teachers> teachersList;
    private List<students> studentsList;
    private int total_earnings;
    private int total_spent;

    /**
     * constructs a school by passing list of teachers and students
     */

    public school(List<teachers> teachers, List<students> students) {
        this.teachersList = teachers;
        this.studentsList = students;
        total_earnings = 0;
        total_spent = 0;
    }

    /**
     *
     * get_teacher returns list of teachers
     * add_teacher adds teacher to list<teachers>
     */

    public List<teachers> get_teachers() { return teachersList; }
    public void add_teacher(teachers teacher) { teachersList.add(teacher); }

    /**
     *
     *  get_students() returns list of students
     *  add_student adds student to list<students>
     */

    public List<students> get_students() { return studentsList; }
    public void add_student(students student) { studentsList.add(student); }

    /**
     *
     * @return total money school earned
     * @update_earnings updates earnings
     *
     */
    public int get_earnings() { return total_earnings; }
    public void update_earnings(int money) { total_earnings += money ; }

    /**
     *
     * @return money spent
     *
     */
    public int get_spent() { return total_spent; }
    public void update_spent(int spent) { total_spent += spent; }

}
