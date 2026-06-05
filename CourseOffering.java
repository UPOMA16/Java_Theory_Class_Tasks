import java.time.LocalDate;

class CourseOffering {
    private int StudentID;
    private int InstructorID;
    private int CourseID;
    private LocalDate Time;
    private int SectionNo;
    private int RoomId;
    private int Year;
    private String Semester;

    public CourseOffering(int StudentID, int InstructorID, int CourseID, LocalDate Time,
            int SectionNo, int RoomId, int Year, String Semester) {
        this.StudentID = StudentID;
        this.InstructorID = InstructorID;
        this.CourseID = CourseID;
        this.Time = Time;
        this.SectionNo = SectionNo;
        this.RoomId = RoomId;
        this.Year = Year;
        this.Semester = Semester;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int StudentID) {
        this.StudentID = StudentID;
    }

    public int getInstructorID() {
        return InstructorID;
    }

    public void setInstructorID(int InstructorID) {
        this.InstructorID = InstructorID;
    }

    public int getCourseID() {
        return CourseID;
    }

    public void setCourseID(int CourseID) {
        this.CourseID = CourseID;
    }

    public LocalDate getTime() {
        return Time;
    }

    public void setTime(LocalDate Time) {
        this.Time = Time;
    }

    public int getSectionNo() {
        return SectionNo;
    }

    public void setSectionNo(int SectionNo) {
        this.SectionNo = SectionNo;
    }

    public int getRoomId() {
        return RoomId;
    }

    public void setRoomId(int RoomId) {
        this.RoomId = RoomId;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }
}

class Instructor {
    private int ID;
    private String Name;
    private String Department;
    private String Title;

    public Instructor(int ID, String Name, String Department, String Title) {
        this.ID = ID;
        this.Name = Name;
        this.Department = Department;
        this.Title = Title;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }
}

class Course {
    private int ID;
    private String Syllabus;
    private String Title;
    private String Credits;
    private String Prerequisite;

    public Course(int ID, String Syllabus, String Title, String Credits, String Prerequisite) {
        this.ID = ID;
        this.Syllabus = Syllabus;
        this.Title = Title;
        this.Credits = Credits;
        this.Prerequisite = Prerequisite;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getSyllabus() {
        return Syllabus;
    }

    public void setSyllabus(String Syllabus) {
        this.Syllabus = Syllabus;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getCredits() {
        return Credits;
    }

    public void setCredits(String Credits) {
        this.Credits = Credits;
    }

    public String getPrerequisite() {
        return Prerequisite;
    }

    public void setPrerequisite(String Prerequisite) {
        this.Prerequisite = Prerequisite;
    }
}


