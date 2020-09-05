package com.itheima.domain;

import java.util.Date;

/**
 * @author tangkaihua
 * @create 2020-05-30-11:08
 */
public class User {
    /**
     * ID
     */
    private String id;

    /**
     * 登录名称
     */
    private String loginName;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 出生年月日
     */
    private Date birthDay;

    /**
     * 性别
     */
    private String sex;

    /**
     * E-Mail
     */
    private String email;

    /**
     * 粉丝数
     */
    private int fansCount;

    /**
     * 关注数
     */
    private int followCount;

//    `avatar` varchar(100) DEFAULT NULL COMMENT '头像',
//    `image` varchar(100) DEFAULT NULL COMMENT '图像',
//    `regdate` datetime DEFAULT NULL COMMENT '注册日期',
//    `updatedate` datetime DEFAULT NULL COMMENT '修改日期',
//    `lastdate` datetime DEFAULT NULL COMMENT '最后登陆日期',
//    `online` bigint(20) DEFAULT NULL COMMENT '在线时长（分钟）',
//    `interest` varchar(100) DEFAULT NULL COMMENT '兴趣',
//    `personality` varchar(100) DEFAULT NULL COMMENT '个性',


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getFansCount() {
        return fansCount;
    }

    public void setFansCount(int fanscount) {
        this.fansCount = fanscount;
    }

    public int getFollowCount() {
        return followCount;
    }

    public void setFollowCount(int followCount) {
        this.followCount = followCount;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id='").append(id).append('\'');
        sb.append(", loginName='").append(loginName).append('\'');
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", nickName='").append(nickName).append('\'');
        sb.append(", birthDay=").append(birthDay);
        sb.append(", sex='").append(sex).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", fansCount=").append(fansCount);
        sb.append(", followCount=").append(followCount);
        sb.append('}');
        return sb.toString();
    }
}
