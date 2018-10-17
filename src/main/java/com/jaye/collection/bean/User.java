package com.jaye.collection.bean;

import javax.jws.soap.SOAPBinding;

/**
 * Program: java
 * Author: Gaowei
 * Date: 2018-10-17 16:27
 * Email: gaoweivf@aliyun.com
 * Description:
 **/

public class User {
    private String userName;
    private String userPhone;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if (obj instanceof User){
            User tempUser = (User) obj;
            if(tempUser!=null){
                if(tempUser.getUserName()==this.userName){
                    return true;
                }
            }else {
                return false;
            }
        }
        return false;
    }
}
