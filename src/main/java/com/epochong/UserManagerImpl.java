package com.epochong;

/**
 * @author epochong
 * @date 2019/7/31 16:57
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe TargetObject
 */
public class UserManagerImpl implements IUserManager{
    @Override
    public boolean addUserInfo(UserInfo userInfo) throws Exception {
        System.out.println("=========UserManagerImpl.addUserInfo()=========");
        return false;
    }

    @Override
    public boolean delUserInfo(int id) throws Exception {
        System.out.println("=========UserManagerImpl.delUserInfo()=========");
        return false;
    }

    @Override
    public boolean modifyUserInfo(UserInfo userInfo, int id) throws Exception {
        System.out.println("=========UserManagerImpl.modifyUserInfo()=========");
        return false;
    }

    @Override
    public UserInfo queryUserById(int id) throws Exception {
        System.out.println("=========UserManagerImpl.queryUserById()=========");
        return null;
    }
}
