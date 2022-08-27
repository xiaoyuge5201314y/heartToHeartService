package com.yu.hearttoheart.service.impl;

import com.yu.hearttoheart.entity.User;
import com.yu.hearttoheart.dao.UserMapper;
import com.yu.hearttoheart.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 吴东宇
 * @since 2022-08-28 02:43:57
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
