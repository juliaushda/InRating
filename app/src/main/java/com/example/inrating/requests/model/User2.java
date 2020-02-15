package com.example.inrating.requests.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User2 {
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("created_at_timestamp")
    @Expose
    private Long createdAtTimestamp;
}
