package xuankexitong;

public class Student extends People{//����̳и��������
	public Course[] courses;
	Student(int studentId,String studentName){
		super(studentId,studentName);
		courses=new Course[5];//�����µĶ���
	}	
	//ѧ��ѡ�Σ�
    public boolean addCourse(Course course){
        boolean flag=false;
        if(!isSelectedCourse(course)&&isNullCourse(course)){
            for(int i=0;i<this.courses.length;i++){
                if(courses[i]==null){
                    courses[i]=course;
                    course.addStudent(this);//�γ�ҲҪ���ѧ��
                    flag=true;
                    break;
                }  } }
        return flag;
    }
    //ѧ���Ƴ��γ�
    public boolean removeCourse(Course course){
        boolean flag=false;
        if(isSelectedCourse(course)){
            for(int i=0;i<this.courses.length;i++){
                if(courses[i]==course){
                    courses[i]=null;
                    course.removeStudent(this);//�ڿγ����Ƴ�ѧ��
                    flag=true;
                    break;
                }}}
        return flag;
    }
    //��ʾѧ����ѡ�Ŀγ�
    public void displayCourse(){
        System.out.println("ѧ��"+this.getStudentName()+"��ѡ�γ��У�");
        for(Course c:courses){
            if(c!=null){
                System.out.print(c.getCourseName()+" ");
            }
        }
        System.out.println();
    }
    //���Ƿ�ѡ��
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
    //ѧ���Ƿ���ѡ�޿�λ��
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