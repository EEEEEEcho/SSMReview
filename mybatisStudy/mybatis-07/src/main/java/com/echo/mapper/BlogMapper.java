package com.echo.mapper;

import com.echo.pojo.Blog;
import org.apache.ibatis.annotations.Insert;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    int addBlog(Blog blog);

    List<Blog> queryBlogIf(Map map);

    List<Blog> queryBlogIf2(Map map);

    List<Blog> queryByChoose(Map map);

    int updateBlog(Map map);

    List<Blog> queryBlogByForEach(Map map);
}
