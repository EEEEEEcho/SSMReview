import com.echo.mapper.StudentMapper;
import com.echo.mapper.TeacherMapper;
import com.echo.pojo.Student;
import com.echo.pojo.Teacher;
import com.echo.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        SqlSession sqlSessin = MyBatisUtil.getSqlSession();
        TeacherMapper mapper = sqlSessin.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacherById(1);
        System.out.println(teacher);
        sqlSessin.close();
    }
    @Test
    public void testQueryAllStudnet(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent();
        System.out.println(student);
        sqlSession.close();
    }
    @Test
    public void testQueryAllStudent2(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student2 = mapper.getStudent2();
        System.out.println(student2);
        sqlSession.close();
    }
}
