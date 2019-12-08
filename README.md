综合性实验  学生选课系统设计

实验目的

分析学生选课系统

使用GUI窗体及其组件设计窗体界面

完成学生选课过程业务逻辑编程

基于文件保存并读取数据

处理异常

系统角色分析及类设计

定义：人员：编号、姓名、性别

教师：编号、姓名、所授课程

学生：姓名、学号、密码

课程：课程编号、课程名称、上课地址、上课时间

要求:

设计GUI窗体，支持学生注册、课程新加、学生选课、学生退课、打印学生选课列表等操作。

基于事件模型对业务逻辑编程，实现在界面上支持上述操作。

针对操作过程中可能会出现的各种异常，做异常处理

基于输入/输出编程，支持学生、课程、教师等数据的读写操作。

过程：

基于之前建立的创建名为course、student、people、teacher、test、denglu、sousuo文件的前提下。

再建立一个名为zhuce的文件。

   在zhuce中设置界面标题为注册系统，设置界面为可见，设置界面大小，分别构建用户名、密码、确认密码和学号的标签，设置标签文本框大小以及文本容量，构造用户名、密码、确认密码和学号的容器大小。设置“保存”按钮，对保存按钮设置监听语句，当输入完用户名、密码、确认密码和学号时弹出注册成功界面，同时将已提交的注册信息保存至名为“shuju”的文本当中，再次点击“确定”将跳转到登录选课界面进行用户登录。

   在 denglu 中继续添加对数据文件的读取功能，当输入的学生姓名、学生密码、学生学号存在于数据文件当中时，即可显示“登陆成功”，并且跳转到学生选课系统界面，输入选择要选的课程，点击选择按钮，即可选课成功。使用try-catch监视try中的语句，如果代码区有错误，则将错误异常输出来。
在sousuo中继续添加对数据文件的保存功能，当输入课程编号、课程名称、上课地址、上课时间和任课教师后，点击“选择”按钮即可选课成功，并且可将课程信息存于“shuju”文件中。

   建立一个名为kecheng的文件,在kecheng中设置课程编号、课程名称、上课地址、上课时间和任课教师的信息，设置界面为可见，设置界面大小，分别构建课程编号、课程名称、上课地址、上课时间和任课教师的标签当输入完课程编号、课程名称、上课地址、上课时间和任课教师时将输入的课程信息保存至名为“shuju”的文本当中。
   
核心代码：中的语句

//异常处理

try {

fileReader = new FileReader("shuju.txt");

int read = fileReader.read();

subname=name.getText();

subpwd=password.getText();

while(read!=-1){

System.out.print((char)read);

read = fileReader.read();

}			 
if(fileReader.toString().contains(subname)&&fileReader.toString().contains(subpwd)){

Information info=new Information();

}	

else {

JOptionPane.showMessageDialog(null, "用户名或密码错误");

}			   
}catch (IOException e) {

System.out.println(e);

}
//读取数据语句

public void readFile1() {

try {
 fileReader = new FileReader("shuju.txt");
 
int read = fileReader.read();

 subname=name.getText();
 
 subpwd=password.getText();   
 
while(read!=-1){

System.out.print((char)read);

read = fileReader.read();

}			   
if(fileReader.toString().contains(subname)&&fileReader.toString().contains(subpwd)){

Model model=new Model();

}			   
else {

JOptionPane.showMessageDialog(null, "用户名或密码错误");

 }			   		   
}catch (IOException e) {

 // TODO Auto-generated catch block
 
System.out.println(e);
}
}	
//保存数据语句
protected void do_button_actionPerformed(ActionEvent e){

char[] password1 = passwordField1.getPassword();

char[] password2 = passwordField2.getPassword();

boolean equals = Arrays.equals(password1, password2);

if (equals) {

String str2=textField.getText()+","+passwordField1; 

File f=new File("shuju.txt"); 

try { if(!f.exists()) { 

f.createNewFile(); } 

FileWriter hu=new FileWriter(f,true);

BufferedWriter buff=new BufferedWriter(hu); 

buff.write(str2);

buff.newLine(); 

buff.flush(); 

buff.close(); 

JOptionPane.showMessageDialog(null, "注册成功"); 

Denglu denglu=new Denglu();
}

catch(Exception e1) { e1.printStackTrace(); }			

} else {

JOptionPane.showMessageDialog(this, "两次密码不同！", null,

JOptionPane.WARNING_MESSAGE);

}
} 
注释：

FileWriter out = new FileWriter（file）  //文件写入流

File f=new File("shuju.txt");//存放数据文件

编程感想：

   通过这次实验，我掌握了文件保存并读取数据的方法，结合之前的实验把整个学生选课系统简单的做了出来，这中间我了解了面向对象的类设计方法、继承、构造方法实例化的方法，掌握了GUI窗体及其组件的使用，初步学会了使用窗体组件AWT和Swing组件布局的方法，了解了事件监听的运用，懂得了如何设置的容器面板的大小，学会了使用for循环语句和if判断语句，了解了异常处理的使用等。通过一次次的课程实验，我慢慢的积累，直到现在掌握了很多了知识，这让我明白了积累的重要性，只要一点点的积累，坚持不放弃，就可以不断进步。
