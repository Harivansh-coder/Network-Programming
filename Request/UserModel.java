package javaRequestExample;

import com.google.gson.annotations.SerializedName;

public class UserModel {

    @SerializedName("name")
    String userName;
    @SerializedName("id")
    int id;
    @SerializedName("followers")
    int followersCount;
    @SerializedName("location")
    String location;

    public UserModel() {
    }

    public UserModel(String userName, int id, int followers, String location) {
        this.userName = userName;
        this.id = id;
        this.followersCount = followers;
        this.location = location;
    }

    void printUser(){
        System.out.println("User name : "+this.userName+"\n"+
                "User id : "+this.id+"\n"+
                "User followers count : "+this.followersCount+"\n"+
                "User location : "+this.location);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(int followersCount) {
        this.followersCount = followersCount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
