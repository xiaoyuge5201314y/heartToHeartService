package com.yu.hearttoheart.service.impl;

import com.yu.hearttoheart.entity.Message;
import com.yu.hearttoheart.dao.MessageMapper;
import com.yu.hearttoheart.service.IMessageService;
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
public class MessageServiceImpl extends ServiceImpl<MessageMapper, Message> implements IMessageService {

}
