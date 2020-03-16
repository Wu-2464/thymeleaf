package cn.bdqn.thymeleaf.service.impl;

import cn.bdqn.thymeleaf.entity.Bill;
import cn.bdqn.thymeleaf.mapper.BillMapper;
import cn.bdqn.thymeleaf.service.IBillService;
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
public class BillServiceImpl extends ServiceImpl<BillMapper, Bill> implements IBillService {

}
