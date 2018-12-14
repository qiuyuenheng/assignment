package com.example.huawei.assignment;

public class people{
    private static String name;
    private int imageId;
    public people(String  name, int imageId){
        this.name = name;
        this.imageId = imageId;
    }
    public static String getName(){
        return name;
    }

    public int getImageId(){
        return imageId;
    }
}