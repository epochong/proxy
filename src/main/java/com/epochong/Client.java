package com.epochong;

/**
 * @author epochong
 * @date 2019/7/31 17:02
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class Client {
    public static void main(String[] args) throws Exception {

//        IUserManager iUserManager = new StaticProxyObject(new UserManagerImpl());
//        iUserManager.addUserInfo(new UserInfo());
//        iUserManager.delUserInfo(1);
//
//        /////////////////////////////////
//        iUserManager.modifyUserInfo(new UserInfo(),1);
//        iUserManager.queryUserById(1);

        CreateDynamicProxy cdp = new CreateDynamicProxy();
        IUserManager iUserManager = (IUserManager) cdp.createProxyObject(new UserManagerImpl());

        iUserManager.addUserInfo(new UserInfo());
        iUserManager.delUserInfo(1);
        iUserManager.modifyUserInfo(new UserInfo(),1);
        iUserManager.queryUserById(1);


    }
}
