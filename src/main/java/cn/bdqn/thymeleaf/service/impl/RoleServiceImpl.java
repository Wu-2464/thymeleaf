package cn.bdqn.thymeleaf.service.impl;

import cn.bdqn.thymeleaf.entity.Role;
import cn.bdqn.thymeleaf.mapper.RoleMapper;
import cn.bdqn.thymeleaf.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author rumeng
 * @since 2020-03-11
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
