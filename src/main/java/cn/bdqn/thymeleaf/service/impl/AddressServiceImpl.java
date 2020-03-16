package cn.bdqn.thymeleaf.service.impl;

import cn.bdqn.thymeleaf.entity.Address;
import cn.bdqn.thymeleaf.mapper.AddressMapper;
import cn.bdqn.thymeleaf.service.IAddressService;
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
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address> implements IAddressService {

}
