package xuankexitong;
import java.awt.List;
public class Course {//类声明（修饰符  关键字    类名）
	private int courseId;//类体   成员变量
	private String courseName;
	private String courseAddress;
	private int courseCredit;
	private String courseDate;
	private Teacher teacher;
	private Student[] student;
	
	public Course(int courseId,String courseName,String courseAddress,
			int courseCredit,String courseDate){//类体   
		super();//所属父类内存空间的引用
		//成员方法    构造方法实例化
		this.courseId=courseId;//赋值语句  成员变量=形参（局部变量）
		this.courseName=courseName;
		this.courseAddress=courseAddress;
		this.courseCredit=courseCredit;
		this.courseDate=courseDate;
		student =new Student[30];//建立新的对象
		}	
	public Course() {
		// TODO Auto-generated constructor stub
	}
	public int getCourseId() {//类体
		return courseId;}	
	public void setCourseId(int courseId) {
		this.courseId = courseId;//实例化
		}	
	public String getCourseName() {
		return courseName;
	}	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}	
	public String getCourseAddress() {
		return courseAddress;
	}	
	public void setCourseAddress(String courseAddress) {
		this.courseAddress = courseAddress;
	}
	public int getCourseCredit() {
		return courseCredit;
	}	
	public void setCourseCredit(int courseCredit) {
		this.courseCredit = courseCredit;
	}	
	public Teacher getTeacher() {
		return teacher;
	}	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}	
	public String getCourseDate() {
		return courseDate;
	}	
	public void setCourseDate(String courseDate) {
		this.courseDate = courseDate;
	}
	  //课加入学生
    public boolean addStudent(Student stu){
        boolean flag = false;//是否加入成功
        //判断语句  如果学生没有选过这门课，同时课的学生还没满则执行
        if(!isSelectedStudent(stu)&&isNullStudent(stu)){
            for(int i=0;i<student.length;i++){
                if(student[i]==null){
                    student[i]=stu;
                    flag=true;
                    break;}}}
        return flag;
    }   
    //课移除学生
    public boolean removeStudent(Student stu){
        boolean flag=false;
        if(isSelectedStudent(stu)){//选过这门课
            for(int i=0;i<student.length;i++){
                if(student[i]==stu){
                    student[i]=null;
                    flag=true;
                    break; }}}
        return flag;}   
    //显示选择课程的学生：
    public void displayStudent(){
        System.out.println("选择的课程："+this.courseName+"的学生有:");//方法体   方法体的功能
        for(Student s:student){
            if(s!=null){
                System.out.print(s.studentName+" ");//方法体   方法的功能
            } }
        System.out.println();//方法体   方法的功能
    } 
   //学生选过这门课
    public boolean isSelectedStudent(Student stu){
        boolean flag=false;
        for(Student s:student){
            if(s==stu){
                flag=true;
                break; }}
        return flag;
    } 
    //学生还没有满
    public boolean isNullStudent(Student stu){
        boolean flag=false;
        for(Student s:student){
            if(s==null){
                flag=true;
                break;
            } }
        return flag;} 
    @Override
	public String toString() {
		return "课程编号:" + courseId + "课程名称:" + courseName + "上课地点:" + courseAddress
				+ "学分:" + courseCredit + "上课时间:" + courseDate +"]";
	}
	public static void main(String[] args) {//方法声明
    }	
	public List list(int semester) {
		return null;
	}}