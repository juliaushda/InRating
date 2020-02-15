package com.example.inrating.requests.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    @SerializedName("id")
    @Expose
    private Integer id;

    @SerializedName("nickname")
    @Expose
    private String nickname;

    @SerializedName("avatar_image")
    @Expose
    private Image avatarImage;

    @SerializedName("active_gift")
    @Expose
    private ActiveGift activeGift;//TODO

    @SerializedName("off_page")
    @Expose
    private Boolean offPage;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("last_name")
    @Expose
    private String lastName;

    @SerializedName("status")
    @Expose
    private Boolean status;

    @SerializedName("gender")
    @Expose
    private String gender;

    @SerializedName("is_subscribed")
    @Expose
    private Boolean isSubscribed;

    @SerializedName("is_online")
    @Expose
    private Boolean isOnline;

    @SerializedName("timestamp")
    @Expose
    private Long timestamp;

    @SerializedName("in_my_blacklist")
    @Expose
    private Boolean inMyBlacklist;

    @SerializedName("has_me_in_blacklist")
    @Expose
    private Boolean hasMeInBlacklist;

    @SerializedName("multiplier")
    @Expose
    private Integer multiplier;


}

/*
*  "off_page": false,
            "name": "Влад",
            "lastname": "Шпадий",
            "status": "active",
            "gender": null,
            "is_subscribed": false,
            "is_online": false,
            "last_online_timestamp": 0,
            "in_my_blacklist": false,
            "has_me_in_blacklist": false,
            "multiplier": 1
* */