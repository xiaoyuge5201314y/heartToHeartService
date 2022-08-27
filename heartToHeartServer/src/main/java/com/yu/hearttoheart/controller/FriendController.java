package com.yu.hearttoheart.controller;

import com.yu.hearttoheart.entity.Friend;
import com.yu.hearttoheart.service.IFriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 吴东宇
 * @since 2022-08-27 20:09:29
 */
@RestController
@RequestMapping("/friend")
public class FriendController {

    @Autowired
    private IFriendService iFriendService;



}
