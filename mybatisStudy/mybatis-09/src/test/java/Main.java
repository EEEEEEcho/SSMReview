import com.echo.mapper.TaskMapper;
import com.echo.pojo.Task;
import com.echo.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

public class Main {
    @Test
    public void testInsert(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        TaskMapper mapper = sqlSession.getMapper(TaskMapper.class);
        Task task = new Task();
        task.setId(2);
        task.setSerial(UUID.randomUUID().toString().replace(".","-"));
        task.setName("Task" + (int)(Math.random()*100));
        task.setType("QC");
        task.setFiles("F:\\asm\\test.asm");
        task.setDrugDb("202001281225.xls.db");
        task.setPath("F\\asm\\");
        task.setCmd("ping www.baidu.com");
        task.setProcessId("2415");
        task.setResult("F:\\asm\\out\\result.asm");
        task.setResultDir("F:\\asm\\out\\");
        task.setSubmitTime(new Date());
        task.setStartTime(new Date());
        task.setFinishTime(new Date());
        task.setUpdateTime(new Date());
        task.setState(404);
        task.setIsdelete(0);
        mapper.insertTask(task);
        //注意提交
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testStartTask(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        TaskMapper mapper = sqlSession.getMapper(TaskMapper.class);
        Task task = new Task();
        task.setFinishTime(new Date());
        task.setResult("F:\\hhh\\result.asm");
        task.setState(10);
        task.setSerial("8fa002c6-ed28-412b-bc1d-8698f5a1c76b");
        mapper.startTask(task);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testFinishTask(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        TaskMapper mapper = sqlSession.getMapper(TaskMapper.class);
        Task task = new Task();
        task.setFinishTime(new Date());
        task.setResult("F:\\hhh\\result.asm");
        task.setState(60);
        task.setSerial("8fa002c6-ed28-412b-bc1d-8698f5a1c76b");
        mapper.finishTask(task);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testPage(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        TaskMapper mapper = sqlSession.getMapper(TaskMapper.class);
        Map<String ,Object> map = new HashMap<String, Object>();
        map.put("type","QC");
        map.put("isdelete",0);
        map.put("offset",10);
        map.put("pagesize",10);
        List<Task> tasks = mapper.queryListByPage(map);
        System.out.println(tasks);
        sqlSession.close();
    }
}
