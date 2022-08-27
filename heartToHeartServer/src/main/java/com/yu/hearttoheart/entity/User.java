package com.yu.hearttoheart.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author 吴东宇
 * @since 2022-06-11 14:26:33
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("tb_user")
@ApiModel(value = "User对象", description = "")
public class User extends Model<User> {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("用户")
    @TableField("username")
    private String username;

    @ApiModelProperty("姓名")
    @TableField("realname")
    private String realname;

    @ApiModelProperty("注册时间")
    @TableField("create_time")
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    @TableField("update_time")
    private LocalDateTime updateTime;

    @ApiModelProperty("生日")
    @TableField("birthday")
    private LocalDateTime birthday;

    @ApiModelProperty("头像")
    @TableField("avatar")
    private String avatar;

    @ApiModelProperty("身份证")
    @TableField("idcard")
    private String idcard;

    @ApiModelProperty("密码")
    @TableField("password")
    private String password;

    @ApiModelProperty("昵称")
    @TableField("nickname")
    private String nickname;

    @ApiModelProperty("个性签名")
    @TableField("signature")
    private String signature;

    @ApiModelProperty("年龄")
    @TableField("age")
    private Integer age;

    @ApiModelProperty("性别")
    @TableField("sex")
    private Integer sex;

    @ApiModelProperty("电话")
    @TableField("phone")
    private String phone;

    @ApiModelProperty("地址")
    @TableField("address")
    private String address;

    @ApiModelProperty("邮箱")
    @TableField("email")
    private String email;

    @ApiModelProperty("是否冻结")
    @TableField("is_frozen")
    private Integer isFrozen;

    @ApiModelProperty("是否删除")
    @TableField("is_delete")
    private Integer isDelete;


    @Override
    public Serializable pkVal() {
        return this.id;
    }

}
