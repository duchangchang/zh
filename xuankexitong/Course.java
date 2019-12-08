package xuankexitong;
import java.awt.List;
public class Course {//�����������η�  �ؼ���    ������
	private int courseId;//����   ��Ա����
	private String courseName;
	private String courseAddress;
	private int courseCredit;
	private String courseDate;
	private Teacher teacher;
	private Student[] student;
	
	public Course(int courseId,String courseName,String courseAddress,
			int courseCredit,String courseDate){//����   
		super();//���������ڴ�ռ������
		//��Ա����    ���췽��ʵ����
		this.courseId=courseId;//��ֵ���  ��Ա����=�βΣ��ֲ�������
		this.courseName=courseName;
		this.courseAddress=courseAddress;
		this.courseCredit=courseCredit;
		this.courseDate=courseDate;
		student =new Student[30];//�����µĶ���
		}	
	public Course() {
		// TODO Auto-generated constructor stub
	}
	public int getCourseId() {//����
		return courseId;}	
	public void setCourseId(int courseId) {
		this.courseId = courseId;//ʵ����
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
	  //�μ���ѧ��
    public boolean addStudent(Student stu){
        boolean flag = false;//�Ƿ����ɹ�
        //�ж����  ���ѧ��û��ѡ�����ſΣ�ͬʱ�ε�ѧ����û����ִ��
        if(!isSelectedStudent(stu)&&isNullStudent(stu)){
            for(int i=0;i<student.length;i++){
                if(student[i]==null){
                    student[i]=stu;
                    flag=true;
                    break;}}}
        return flag;
    }   
    //���Ƴ�ѧ��
    public boolean removeStudent(Student stu){
        boolean flag=false;
        if(isSelectedStudent(stu)){//ѡ�����ſ�
            for(int i=0;i<student.length;i++){
                if(student[i]==stu){
                    student[i]=null;
                    flag=true;
                    break; }}}
        return flag;}   
    //��ʾѡ��γ̵�ѧ����
    public void displayStudent(){
        System.out.println("ѡ��Ŀγ̣�"+this.courseName+"��ѧ����:");//������   ������Ĺ���
        for(Student s:student){
            if(s!=null){
                System.out.print(s.studentName+" ");//������   �����Ĺ���
            } }
        System.out.println();//������   �����Ĺ���
    } 
   //ѧ��ѡ�����ſ�
    public boolean isSelectedStudent(Student stu){
        boolean flag=false;
        for(Student s:student){
            if(s==stu){
                flag=true;
                break; }}
        return flag;
    } 
    //ѧ����û����
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
		return "�γ̱��:" + courseId + "�γ�����:" + courseName + "�Ͽεص�:" + courseAddress
				+ "ѧ��:" + courseCredit + "�Ͽ�ʱ��:" + courseDate +"]";
	}
	public static void main(String[] args) {//��������
    }	
	public List list(int semester) {
		return null;
	}}