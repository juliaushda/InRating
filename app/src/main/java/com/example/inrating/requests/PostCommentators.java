package com.example.inrating.requests;

import com.example.inrating.requests.model.Link;
import com.example.inrating.requests.model.Meta;
import com.example.inrating.requests.model.User;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PostCommentators {
    @SerializedName("data")
    @Expose
    private List<User> data;

    @SerializedName("links")
    @Expose
    private Link links;

    @SerializedName("meta")
    @Expose
    private Meta meta;
}
