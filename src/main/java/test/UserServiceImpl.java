package test;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fish.mianshiya.model.entity.User;
import com.fish.mianshiya.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author abc
* @description 针对表【user(用户)】的数据库操作Service实现
* @createDate 2026-03-15 18:30:51
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




