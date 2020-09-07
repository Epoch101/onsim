package pers.rong.onism.service.impl;

import pers.rong.onism.entity.User;
import pers.rong.onism.mapper.UserMapper;
import pers.rong.onism.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author
 * @since 2020-09-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
