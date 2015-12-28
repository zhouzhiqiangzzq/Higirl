package com.mci.higirl.model.splashlist;

/**
 * Created by Administrator on 2015/12/18.
 */
public class SplashListData {
    public String ClickUrl;
    public String CreateDate;
    public int Id;
    public String Image1;
    public String Image2;
    public String Image3;
    public String Image4;
    public String ModifyDate;
    public String Name;
    public String StatUrl;
    public int State;
    public int Type;
    public String Url;
    public int UserId;
    public String UsingDate;

    public String getClickUrl() {
        return ClickUrl;
    }

    public void setClickUrl(String clickUrl) {
        ClickUrl = clickUrl;
    }

    public String getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(String createDate) {
        CreateDate = createDate;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getImage1() {
        return Image1;
    }

    public void setImage1(String image1) {
        Image1 = image1;
    }

    public String getImage2() {
        return Image2;
    }

    public void setImage2(String image2) {
        Image2 = image2;
    }

    public String getImage3() {
        return Image3;
    }

    public void setImage3(String image3) {
        Image3 = image3;
    }

    public String getImage4() {
        return Image4;
    }

    public void setImage4(String image4) {
        Image4 = image4;
    }

    public String getModifyDate() {
        return ModifyDate;
    }

    public void setModifyDate(String modifyDate) {
        ModifyDate = modifyDate;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getStatUrl() {
        return StatUrl;
    }

    public void setStatUrl(String statUrl) {
        StatUrl = statUrl;
    }

    public int getState() {
        return State;
    }

    public void setState(int state) {
        State = state;
    }

    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getUsingDate() {
        return UsingDate;
    }

    public void setUsingDate(String usingDate) {
        UsingDate = usingDate;
    }

    @Override
    public String toString() {
        return "SplashListData{" +
                "ClickUrl='" + ClickUrl + '\'' +
                ", CreateDate='" + CreateDate + '\'' +
                ", Id=" + Id +
                ", Image1='" + Image1 + '\'' +
                ", Image2='" + Image2 + '\'' +
                ", Image3='" + Image3 + '\'' +
                ", Image4='" + Image4 + '\'' +
                ", ModifyDate='" + ModifyDate + '\'' +
                ", Name='" + Name + '\'' +
                ", StatUrl='" + StatUrl + '\'' +
                ", State=" + State +
                ", Type=" + Type +
                ", Url='" + Url + '\'' +
                ", UserId=" + UserId +
                ", UsingDate='" + UsingDate + '\'' +
                '}';
    }
}
