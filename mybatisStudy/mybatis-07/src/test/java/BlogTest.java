import com.echo.mapper.BlogMapper;
import com.echo.pojo.Blog;
import com.echo.util.IDutil;
import com.echo.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

public class BlogTest {
    @Test
    public void insertTest(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IDutil.getId());
        blog.setTitle("Mybatis");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);

        mapper.addBlog(blog);

        blog.setId(IDutil.getId());
        blog.setTitle("Java");
        mapper.addBlog(blog);

        blog.setId(IDutil.getId());
        blog.setTitle("Spring");
        mapper.addBlog(blog);

        blog.setId(IDutil.getId());
        blog.setTitle("微服务");
        mapper.addBlog(blog);

        sqlSession.close();
    }

    @Test
    public void testIf(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        // map中不添加任何条件
        Map<String,Object> map = new HashMap<String, Object>();
        List<Blog> blogs = mapper.queryBlogIf(map);
        System.out.println(blogs);
    }
    @Test
    public void testIf2(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap<String, Object> stringObjectHashMap = new HashMap<String, Object>();
        stringObjectHashMap.put("title","Mybatis");
        List<Blog> blogs = mapper.queryBlogIf(stringObjectHashMap);
        System.out.println(blogs);
        sqlSession.close();
    }
    @Test
    public void testIf3(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap<String, Object> stringObjectHashMap = new HashMap<String, Object>();
        stringObjectHashMap.put("author","狂神说");
        List<Blog> blogs = mapper.queryBlogIf(stringObjectHashMap);
        System.out.println(blogs);
        sqlSession.close();
    }
    @Test
    public void testChoose(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String,Object> map = new HashMap<String, Object>();
        List<Blog> blogs = mapper.queryByChoose(map);
        System.out.println(blogs);
        sqlSession.close();
    }
    @Test
    public void testSet(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("title","Java如此简单2");
        map.put("author","孟石说");
        map.put("id","9caa73eb-89c9-4076-b06c-7b5844146125");
        int i = mapper.updateBlog(map);
        System.out.println(i);
        sqlSession.close();
    }
    @Test
    public void testSqlFrag(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        // map中不添加任何条件
        Map<String,Object> map = new HashMap<String, Object>();
        List<Blog> blogs = mapper.queryBlogIf2(map);
        System.out.println(blogs);
    }

    @Test
    public void testForEach(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        hashMap.put("ids",arrayList);
        List<Blog> blogs = mapper.queryBlogByForEach(hashMap);
        System.out.println(blogs);
        sqlSession.close();
    }
}
