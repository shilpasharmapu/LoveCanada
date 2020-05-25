package com.example.lovecanada.models;

import android.os.Parcel;
import android.os.Parcelable;

public class CanadaAttraction implements Parcelable {
    private int placeId;
    private String name,address,city,provience,description;
    private int imgaeFlag;

    public CanadaAttraction()
    {

    }
    public CanadaAttraction(int placeId, String name, String address, String city, String provience, String description, int imgaeFlag) {
        this.placeId = placeId;
        this.name = name;
        this.address = address;
        this.city = city;
        this.provience = provience;
        this.description = description;
        this.imgaeFlag = imgaeFlag;
    }

    protected CanadaAttraction(Parcel in) {
        placeId = in.readInt();
        name = in.readString();
        address = in.readString();
        city = in.readString();
        provience = in.readString();
        description = in.readString();
        imgaeFlag = in.readInt();
    }

    public static final Creator<CanadaAttraction> CREATOR = new Creator<CanadaAttraction>() {
        @Override
        public CanadaAttraction createFromParcel(Parcel in) {
            return new CanadaAttraction(in);
        }

        @Override
        public CanadaAttraction[] newArray(int size) {
            return new CanadaAttraction[size];
        }
    };

    public int getPlaceId() {
        return placeId;
    }

    public void setPlaceId(int placeId) {
        this.placeId = placeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvience() {
        return provience;
    }

    public void setProvience(String provience) {
        this.provience = provience;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImgaeFlag() {
        return imgaeFlag;
    }

    public void setImgaeFlag(int imgaeFlag) {
        this.imgaeFlag = imgaeFlag;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {


        dest.writeInt(placeId);
        dest.writeString(name);
        dest.writeString(address);
        dest.writeString(city);
        dest.writeString(provience);
        dest.writeString(description);
        dest.writeInt(imgaeFlag);
    }
    public String getData(){
        return "Name: "+ name +"\n"+
                "Address : "+ address+ "\n"+
                "City: "+ city + "\n"+
                " Address: "+
                "  "+address+", "+city+", "+provience+" \n"+
                "Description : "+description+"\n"
                ;

    }
}
