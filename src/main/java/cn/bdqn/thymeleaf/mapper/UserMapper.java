package cn.bdqn.thymeleaf.mapper;

import cn.bdqn.thymeleaf.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author rumeng
 * @since 2020-03-11
 */
@Component
public interface UserMapper extends BaseMapper<User> {

}
