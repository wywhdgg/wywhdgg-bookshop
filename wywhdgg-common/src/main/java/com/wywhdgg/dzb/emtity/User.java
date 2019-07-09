package com.wywhdgg.dzb.emtity;

/***
 *@author lenovo
 *@date 2019/7/9 7:26
 *@Description:
 *@version 1.0
 */
public class User {
    private String name;
    private String sex;


    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public static class Builder  {
        private String name;
        private String sex;

        public Builder name(String n) {
            this.name = n;
            return  this;
        }

        public Builder sex(String s) {
            sex = s;
            return this;
        }

        public User build()  {
            return new User(this);
        }
    }

    private User(Builder builder) {
        name = builder.name;
        sex = builder.sex;
    }
}
