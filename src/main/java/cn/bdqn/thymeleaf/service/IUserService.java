package cn.bdqn.thymeleaf.service;

import cn.bdqn.thymeleaf.entity.User;
import cn.bdqn.thymeleaf.mapper.UserMapper;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author rumeng
 * @since 2020-03-11
 */

public interface IUserService extends IService<User> {
    List<User> findUserByWrapper(String name);
}
