import java.util.ArrayList;

public class Division {
    private String department;
    private String section;
    private int id;
    private String staff;
    private String role;
    private String responsibilities;
//    private static ArrayList<Division>  = new ArrayList<>();
//    private Boolean shape;

    public Division(String department, String section, int id, String staff, String role, String responsibilities) {
        this.department = department;
        this.section = section;
        this.id = id;
        this.staff = staff;
        this.role = role;
        this. responsibilities = responsibilities;
//        this.mInstances.add(this);
    }

    public String getDepartment() {
        return department;
    }
    public String getSection() {
        return section;
    }
    public int getId() {
        return id;
    }
    public String getStaff() {
        return staff;
    }
    public String getRole() {
        return role;
    }
    public String getResponsibilities() {
        return responsibilities;
    }

//    public static ArrayList<Rectangle> getAll() {
//        return mInstances;
//    }
//
//    public boolean getShape() {
//        return shape;
//    }
//
//    public boolean isRectSquare() {
//        if (height == width) {
//            return true;
//        } else {
//            return false;
//        }
//    }
}