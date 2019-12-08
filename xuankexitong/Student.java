package xuankexitong;

public class Student extends People{//定义继承父类的子类
	public Course[] courses;
	Student(int studentId,String studentName){
		super(studentId,studentName);
		courses=new Course[5];//建立新的对象
	}	
	//学生选课；
    public boolean addCourse(Course course){
        boolean flag=false;
        if(!isSelectedCourse(course)&&isNullCourse(course)){
            for(int i=0;i<this.courses.length;i++){
                if(courses[i]==null){
                    courses[i]=course;
                    course.addStudent(this);//课程也要添加学生
                    flag=true;
                    break;
                }  } }
        return flag;
    }
    //学生移除课程
    public boolean removeCourse(Course course){
        boolean flag=false;
        if(isSelectedCourse(course)){
            for(int i=0;i<this.courses.length;i++){
                if(courses[i]==course){
                    courses[i]=null;
                    course.removeStudent(this);//在课程中移除学生
                    flag=true;
                    break;
                }}}
        return flag;
    }
    //显示学生所选的课程
    public void displayCourse(){
        System.out.println("学生"+this.getStudentName()+"所选课程有：");
        for(Course c:courses){
            if(c!=null){
                System.out.print(c.getCourseName()+" ");
            }
        }
        System.out.println();
    }
    //课是否被选过
    public boolean isSelectedCourse(Course course){
        boolean flag=false;
        for(Course c:courses){
            if(c==course){
                flag=true;
                break;
            }
        }
        return flag;
    }
    //学生是否还有选修课位置
    public boolean isNullCourse(Course course){
        boolean flag=false;
        for(Course c:courses){
            if(c==null){
                flag=true;
                break;
            }
        }
        return flag;}
}