package pers.rong.onism.service.impl;

import pers.rong.onism.entity.Blog;
import pers.rong.onism.mapper.BlogMapper;
import pers.rong.onism.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author
 * @since 2020-09-07
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
