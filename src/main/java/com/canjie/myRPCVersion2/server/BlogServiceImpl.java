package com.canjie.myRPCVersion2.server;

import com.canjie.myRPCVersion2.common.Blog;
import com.canjie.myRPCVersion2.service.BlogService;

/**
 * @author zcj
 * @creat 2022-03-16-21:31
 */
public class BlogServiceImpl implements BlogService {
    @Override
    public Blog getBlogById(Integer id) {
        Blog blog = Blog.builder().id(id).title("我的博客").useId(22).build();
        System.out.println("客户端查询了" + id + "博客");
        return blog;
    }
}
