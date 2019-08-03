package com.epochong;

/**
 * @author epochong
 * @date 2019/7/31 16:52
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public interface IUserManager {
    boolean addUserInfo(UserInfo userInfo) throws Exception;

    boolean delUserInfo(int id) throws Exception;

    boolean modifyUserInfo(UserInfo userInfo, int id) throws Exception;

    UserInfo queryUserById(int id) throws Exception;
}
