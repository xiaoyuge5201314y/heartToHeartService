package com.yu.hearttoheart.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Getter
@Setter
@Accessors(chain = true)
@TableName("tr_friend")
@ApiModel(value = "好友", description = "")
public class Friend {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("用户id")
    @TableField("user_id")
    private Long user_id;

    @ApiModelProperty("好友id")
    @TableField("friend_id")
    private Long friend_id;

    @ApiModelProperty("创建时间")
    @TableField("create_time")
    private LocalDateTime createTime;

    @ApiModelProperty("好友状态 0对方申请中1已经好友2我申请中")
    @TableField("state")
    private Integer state;
}
