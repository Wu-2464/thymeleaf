package cn.bdqn.thymeleaf.service.impl;

import cn.bdqn.thymeleaf.entity.User;
import cn.bdqn.thymeleaf.mapper.UserMapper;
import cn.bdqn.thymeleaf.service.IUserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author rumeng
 * @since 2020-03-11
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> findUserByWrapper(String name) {
        if (name !=null && !name.isEmpty()){
            QueryWrapper<User> queryWrapper = new QueryWrapper<>();
            queryWrapper.like("userName","name");
            return userMapper.selectList(queryWrapper);
        }
        return null;
    }
}
