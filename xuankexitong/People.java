package xuankexitong;

public class People {//������
	public int studentId;
	public String studentName;
	private int teacherId;
	private String teacherName;
	public People(int studentId,String studentName){//����
		this.studentId=studentId;
		this.studentName=studentName;
		}
	public People(int studentId,String studentName,int teacherId,String teacherName){
		this.teacherId=teacherId;
		this.teacherName=teacherName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}	
	public String toString() {
	return "People [studentId=" + studentId + ", studentName=" + studentName + ", teacherId=" + teacherId
				+ ", teacherName=" + teacherName + "]";
	}
	public static void main(String[] args) {
	}
}