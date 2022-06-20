package school.system;

public class teachers {


    private int id;
    private String name;
    private int salary;

    /**
     * constructor for teachers
     * id - UNIQUE - STATIC
     * Name - NOT UNIQUE - STATIC
     * Salary - UNIQUE - DYNAMIC
     */
    public teachers(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    //returns ID of teacher + static value does not require a setter
    public int get_id(){
        return id;
    }

    //returns NAME of teacher + static value does not require a setter
    public String get_name(){
        return name;
    }

    //sets salary of teacher
    public void set_salary(int salary){
        this.salary = salary;
    }
    //returns SALARY of teacher
    public int get_salary(){
        return salary;
    }
}
