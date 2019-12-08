package xuankexitong;

public class Test {//类声明
	public static void main(String[] args) {//成员变量
		Student stu0=new Student(2019322030,"LiMing");//成员方法
		Course cour0=new Course(2019,"java","0921",2, "109" );
		Course cour1=new Course(2019,"离散数学","0921",2, "109");
		//调用增加课程方法
		//stu0.addCourse(cour0);
		stu0.addCourse(cour1);
		//调用展示课程方法
		stu0.displayCourse();
		System.out.println(cour0);
		//调用移除课程方法
		//stu0.removeCourse(cour0);
		stu0.displayCourse();
		System.out.println(cour1);
		}
}