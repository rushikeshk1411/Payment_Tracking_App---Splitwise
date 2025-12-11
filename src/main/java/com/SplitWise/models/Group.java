package com.SplitWise.models;

import java.util.List;

public class Group {
    private String name;
    private String id;
    private String desc;
    private String imgUrl;
    private List<String> userList;

    public String getGroupId(){
        return id;
    }

    public List<String> getUserList(){
        return userList;
    }
}
