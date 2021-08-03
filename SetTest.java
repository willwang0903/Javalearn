import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class SetTest{
    public List<Student> students;
    public SetTest(){
        students = new ArrayList<Student>();
    }
    public void testAdd(){
        Student st1 = new Student("1","张三");
        students.add(st1);
        //Student temp = students.get(0);
        //System.out.println("添加了学生："+temp.id+":"+temp.name);

        Student st2 = new Student("2","李四");
        //students.add(0,st2);
        students.add(st2);
        //Student temp2 = students.get(0);
        //System.out.println("添加了学生："+temp2.id+":"+temp2.name);

        Student[] student = {new Student("3","王五"),new Student("4","马六")};
        students.addAll(Arrays.asList(student));
        //Student temp3 = students.get(2);
        //Student temp4 = students.get(3);
        //System.out.println("添加了学生："+temp3.id+":"+temp3.name);
        //System.out.println("添加了学生："+temp4.id+":"+temp4.name);

        Student[] student2 = {new Student("5","周七"),new Student("6","赵八")};
        students.addAll(2,Arrays.asList(student2));
        //Student temp5 = students.get(2);
        //Student temp6 = students.get(3);
        //System.out.println("添加了学生："+temp5.id+":"+temp5.name);
        //System.out.println("添加了学生："+temp6.id+":"+temp6.name);

    }
    
    //通过for each方法访问集合元素
    public void testForEach(){
        System.out.println("有如下学生(通过for each)：");
        for(Object obj : students){
            Student st = (Student)obj;
            System.out.println("学生"+st.id+":"+st.name);
        }
        //students.stream().sorted(Comparator.comparing(x -> x.id)).forEach(System.out::println);
    }
   
    public static void main(String[] args){
        SetTest lt = new SetTest();
        lt.testAdd();
        lt.testForEach();
        PD pd = new PD("1","张老师");
        System.out.println("请："+pd.name+"选择小组成员！");
        Scanner console = new Scanner(System.in);
        for (int i=0;i<3;i++){
            System.out.println("请输入学生ID");
            String studentID = console.next();
            for(Student s:lt.students){
                if(s.id.equals(studentID)){
                    pd.students.add(s);
                }
            }
        }
        lt.testForEachForSer(pd);
        console.close();
    } 
    public void testForEachForSer(PD pd) {
        for(Student s:pd.students){
            System.out.println("选择了学生："+s.id+":"+s.name);
        }
    } 
}