package cn.bdqn.thymeleaf.controller;


import cn.bdqn.thymeleaf.entity.User;
import cn.bdqn.thymeleaf.service.IUserService;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author rumeng
 * @since 2020-03-11
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @RequestMapping("/list")
    public String list(Model model, HttpSession session){
        // List<User> userList = iUserService.list();
        // List<User> userList = iUserService.findUserByWrapper(name);
        List<User> userList = iUserService.list();
        model.addAttribute("userName",userList.get(0).getUserName());
        model.addAttribute("userList",userList);
        model.addAttribute("user",userList.get(0));
        model.addAttribute("user2",userList.get(1));
        model.addAttribute("user3",userList.get(2));
        model.addAttribute("birthday",userList.get(0).getBirthday());
        session.setAttribute("sessionUser",userList.get(1));
        return "index";
    }
    @RequestMapping("/save")
    public String save(){
        // List<User> userList = new ArrayList<>();
        // for (int i = 0; i <10 ; i++) {
        //     User u = new User();
        //     u.setUserCode("code"+i);
        //     u.setUserName("username"+1*i);
        //     userList.add(u);
        // }
        User u = new User();
        u.setId(47L);
        u.setUserCode("code");
        u.setUserName("name");
        boolean b=iUserService.saveOrUpdate(u);
        return "b"+b;
    }
    @RequestMapping("update")
    public String update(){
        UpdateWrapper<User> wrapper = new UpdateWrapper();
        wrapper.set("userName","lastname");
        // wrapper.like("userCode","ooo");
        // wrapper.eq("id","47");
        //不加条件即修改全表

        // User u = new User();
        // u.setUserCode("ooo");
        boolean b = iUserService.update(wrapper);//使用实体+wrapper，实体为更新后对象，wrapper为条件;使用单个wrapper需要设置条件和修改值
        return "b:"+b;
    }
    @RequestMapping("/remove")
    public String remove(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("userCode","ooo");
        boolean b = iUserService.remove(queryWrapper);
        return "b:"+b;
    }
}
