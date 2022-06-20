package school.system;

public class students {
    /**
        -student class- to keep track of students in system
        -Name
        -Identification #
        -Grade
        -Fees paid/total
    */


    //private in order to protect student ID
    private int id;
    private String name;
    private int grade;
    private int fees_paid;
    private int fees_total;

    /**
     * creating a constructor so that objects of "student class" can be created
     * Fee/Student - $25,000 /yr + DYNAMIC
     * Initial pay - $0 + STATIC
     * @param id - unique + STATIC
     * @param name - not unique + STATIC
     * @param grade - not unique + DYNAMIC
    */

    public students(int id, String name, int grade){
        this.fees_paid = 0; // "this" not necessary, but I prefer it for organizational purposes
        this.fees_total = 25000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public void set_grade(int grade) {
        this.grade = grade;
    }

    // fees_paid updated by adding the fees paid to the fees_paid variable
    public void update_fees(int fees){
        this.fees_paid += fees;
    }

    /**
     *
     * @return name, grade, fees_paid, fees_total
     */

    public String get_name() { return name; }

    public int get_grade() { return grade; }

    public int get_fees_paid() { return fees_paid; }

    public int get_fees_total() { return fees_total; }



}
