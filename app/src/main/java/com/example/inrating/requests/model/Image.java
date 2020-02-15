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
public class Image {
    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("url_medium")
    @Expose
    private String urlMedium;

    @SerializedName("url")
    @Expose
    private String url;

    @SerializedName("url_large")
    @Expose
    private String urlLarge;

    @SerializedName("url_small")
    @Expose
    private String urlSmall;

    @SerializedName("url_origin")
    @Expose
    private String urlOrigin;

    @SerializedName("url_medium_origin")
    @Expose
    private String urlMediumOrigin;

    @SerializedName("url_large_origin")
    @Expose
    private String urlLargeOrigin;

    @SerializedName("url_small_origin")
    @Expose
    private String urlSmallOrigin;

    @SerializedName("mentioned_users_count")
    @Expose
    private  Integer mentionedUsersCount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

/*
"url_medium": "https://media.inrating.top/img/G04yV3zlAROqlnv17ZVB_medium.jpg",
                "id": 14658,
                "url": "https://media.inrating.top/img/G04yV3zlAROqlnv17ZVB.jpg",
                "url_large": "https://media.inrating.top/img/G04yV3zlAROqlnv17ZVB_large.jpg",
                "url_small": "https://media.inrating.top/img/G04yV3zlAROqlnv17ZVB_small.jpg",
                "url_origin": "https://media.inrating.top/img/G04yV3zlAROqlnv17ZVB.jpg",
                "url_medium_origin": "https://media.inrating.top/img/G04yV3zlAROqlnv17ZVB_medium.jpg",
                "url_large_origin": "https://media.inrating.top/img/G04yV3zlAROqlnv17ZVB_large.jpg",
                "url_small_origin": "https://media.inrating.top/img/G04yV3zlAROqlnv17ZVB_small.jpg",
                "mentioned_users_count": 0
 */