package com.yu.hearttoheart.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class UserInfoVO {

    private Long id;

    @ApiModelProperty("用户")
    private String username;

    @ApiModelProperty("姓名")
    private String realname;

    @ApiModelProperty("注册时间")
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty("生日")
    private LocalDateTime birthday;

    @ApiModelProperty("头像")
    private String avatar;

    @ApiModelProperty("身份证")
    private String idcard;

    @ApiModelProperty("昵称")
    private String nickname;

    @ApiModelProperty("个性签名")
    private String signature;

    @ApiModelProperty("年龄")
    private Integer age;

    @ApiModelProperty("性别")
    private Integer sex;

    @ApiModelProperty("电话")
    private String phone;

    @ApiModelProperty("地址")
    private String address;

    @ApiModelProperty("邮箱")
    private String email;
}
