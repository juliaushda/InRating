package com.example.inrating.requests.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Meta {
    @SerializedName("current_page")
    @Expose
    private Integer currentPage;

    @SerializedName("from")
    @Expose
    private Integer from;

    @SerializedName("last_page")
    @Expose
    private Integer lastPage;
    @SerializedName("path")
    @Expose
    private String path;
    @SerializedName("per_page")
    @Expose
    private Integer perPage;
    @SerializedName("to")
    @Expose
    private Integer to;
    @SerializedName("total")
    @Expose
    private Integer total;

}


/*
 "current_page": 1,
        "from": 1,
        "last_page": 1,
        "path": "https://api.inrating.top/v1/users/posts/likers/all",
        "per_page": 15,
        "to": 8,
        "total": 8
 */