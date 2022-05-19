package com.javase.homework;

public class UserService {
    private String userName;
    private String passWord;

    public UserService() {
    }

    public UserService(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void register(String username, String password) throws MyException {
        //这个方法中完成注册！
        if ((username.length() >= 6) && (username.length() <= 14)){
            this.userName = username;
            this.passWord = password;
            System.out.println("注册成功。");
        }else{
            throw new MyException("用户名格式错误，请输入6~14位的用户名格式。");
        }
    }
}
