package xuankexitong;

public class Test {//������
	public static void main(String[] args) {//��Ա����
		Student stu0=new Student(2019322030,"LiMing");//��Ա����
		Course cour0=new Course(2019,"java","0921",2, "109" );
		Course cour1=new Course(2019,"��ɢ��ѧ","0921",2, "109");
		//�������ӿγ̷���
		//stu0.addCourse(cour0);
		stu0.addCourse(cour1);
		//����չʾ�γ̷���
		stu0.displayCourse();
		System.out.println(cour0);
		//�����Ƴ��γ̷���
		//stu0.removeCourse(cour0);
		stu0.displayCourse();
		System.out.println(cour1);
		}
}