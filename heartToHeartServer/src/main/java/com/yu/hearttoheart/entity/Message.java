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
@TableName("tb_message")
@ApiModel(value = "消息", description = "")
public class Message {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("发送者id")
    @TableField("from_id")
    private Long user_id;

    @ApiModelProperty("接收者id")
    @TableField("target_id")
    private Long friend_id;

    @ApiModelProperty("发送时间")
    @TableField("send_time")
    private LocalDateTime send_time;

    @ApiModelProperty("发送内容")
    @TableField("content")
    private String content;

    @ApiModelProperty("内容类型0文字1图片2音频链接")
    @TableField("content_type")
    private String content_type;

    @ApiModelProperty("消息状态 0已读1未读")
    @TableField("state")
    private Integer state;
}
