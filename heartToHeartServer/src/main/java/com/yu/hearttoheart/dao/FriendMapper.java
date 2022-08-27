package com.yu.hearttoheart.dao;

import com.yu.hearttoheart.entity.Friend;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 吴东宇
 * @since 2022-08-27 20:09:29
 */
@Repository
@Mapper
public interface FriendMapper extends BaseMapper<Friend> {

}
