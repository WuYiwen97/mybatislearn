import com.wuyiwen.dao.BlogMapper;
import com.wuyiwen.pojo.Blog;
import com.wuyiwen.utils.IDUtil;
import com.wuyiwen.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class MyTest {

    @Test
    public void addBlog(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Blog blog = new Blog();
        blog.setId(IDUtil.getId());
        blog.setTitle("Mybatisjiandan");
        blog.setAuthor("qiangjiang");
        blog.setCreateTime(new Date());
        blog.setViews(9999);


        mapper.addBlog(blog);

        blog.setId(IDUtil.getId());
        blog.setTitle("Javavava");

        mapper.addBlog(blog);

        blog.setId(IDUtil.getId());
        blog.setTitle("SpringMVVV");

        mapper.addBlog(blog);

        blog.setId(IDUtil.getId());
        blog.setTitle("cloud ddddoucker");
        mapper.addBlog(blog);

        sqlSession.close();
    }


    @Test
    public void queryByIf(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap hashMap = new HashMap();
        hashMap.put("title","Javavava");
        hashMap.put("author","qiangjiang");
        List<Blog> blogs = mapper.queryBlogIF(hashMap);
        blogs.forEach(e-> System.out.println(e));

        //hashMap.put("views",1000);
        //List<Blog> blogs1 = mapper.queryBlogChoose(hashMap);
        //blogs1.forEach(e-> System.out.println(e));
        sqlSession.close();
    }


    @Test
    public void updateBySet(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap hashMap = new HashMap();
        hashMap.put("title","cloi docker");
        hashMap.put("id","7835db1af6584553ba85d634cd600b9c");
        mapper.updateBlog(hashMap);
        sqlSession.close();
    }

    @Test
    public void queryBlogForeach(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap hashMap = new HashMap();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        hashMap.put("ids",arrayList);

        List<Blog> blogs = mapper.queryBlogForeach(hashMap);
        blogs.forEach(e-> System.out.println(e));
        sqlSession.close();
    }
}
