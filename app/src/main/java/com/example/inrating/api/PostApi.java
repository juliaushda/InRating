package com.example.inrating.api;

import com.example.inrating.requests.PostBookmarks;
import com.example.inrating.requests.PostCommentators;
import com.example.inrating.requests.PostMentioned;
import com.example.inrating.requests.PostReposters;
import com.example.inrating.requests.PostViewers;
import com.example.inrating.requests.model.PostBody;
import com.example.inrating.requests.PostLikers;
import com.example.inrating.requests.model.User;

import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.Call;
import retrofit2.http.Query;


public interface PostApi {

    String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6ImRiYTYzMGE0YzIxYWZlNzRhYTVlNTgwZjBiZjliMDQ1YThmYzY4NWViMjE0ZmFmZTY4ZDAzMGQzZjdiNThhMDg3M2M1MzU3MTNjNjIxNmE5In0.eyJhdWQiOiIyIiwianRpIjoiZGJhNjMwYTRjMjFhZmU3NGFhNWU1ODBmMGJmOWIwNDVhOGZjNjg1ZWIyMTRmYWZlNjhkMDMwZDNmN2I1OGEwODczYzUzNTcxM2M2MjE2YTkiLCJpYXQiOjE1Njg2MzI3MDEsIm5iZiI6MTU2ODYzMjcwMSwiZXhwIjoxNjAwMjU1MTAxLCJzdWIiOiIzMDQ2MTAiLCJzY29wZXMiOltdfQ.BB_dmBJDg-NO72-HSqudwt3Ql4kO7uyVjx4sMTpMURpJZfRpd1-7wUjfERWumhp1JcQzFwiRsihKTLN_rVeLNzspcXUHtp6OTRBEPowrzhQq3tB8-mQxTL-8KV2QPOaDmYufoowtCaxbTp7ciKs7Ybs4t9XYfGQoyBurWJsspOU_ikvWHlZViHZQjs82aAIblC-XyQh94sJz0_3mDHQPcGhlpBXp-RMi-hghGZsFS_ZhugSKvz5bKeR0bzDTui1baUoGnCFOWwSDn_tek1rSpAIdOe5WK1J2Opvjx7kjq7ycjbDy8ZNurWhEExa8rrFRRHlzN2AwiWkwAd6BmMHI_nVhgGbqUzDg88_393nX8T8Fdrek-IU1k461MzAycsRiKTj_vRXVyNie25v-wg3aQ9PciB-zQH1JbBM6wPmavwi-5zWD5Ab5m3FGijBviPCnN2Q-H9aBN3zPLYrYHG305Rmq6DHc_QoC_GYISk_BbbU3_DrvnUml2ey07B0bprVKJPZWYE9LHW5A3k4-yV3eAR5rf-JcQjCigONs0lkcA9uu91R-n3VxmtIyOIO76SLdkiZEebV8yvIC696zrxPMzNktoDUc-SP359MZDHIvmtL2uyy3s83n3LtgwgamZC4e6_-GmU89npACLD5hK7-lVXeVRGAKZuhTHKWuKbEqLJ8";

    @Headers({"Authorization: Bearer "+ token})
    @POST("/v1/users/posts/likers/all")
    Call<PostLikers> getLikers(@Body PostBody id);

    @Headers({"Authorization: Bearer "+ token})
    @POST("/v1/users/posts/reposters/all")
    Call<PostReposters> getReposters(@Body PostBody id);

    @Headers({"Authorization: Bearer "+ token})
    @POST("/v1/users/posts/commentators/all")
    Call<PostCommentators> getComentators(@Body PostBody id);

    @Headers({"Authorization: Bearer "+ token})
    @POST("/v1/users/posts/mentions/all")
    Call<PostMentioned> getMentions(@Body PostBody id);

    @Headers({"Authorization: Bearer "+ token})
    @POST("/v1/users/posts/viewers/all")
    Call<PostViewers> getViewers(@Body PostBody id);

    @Headers({"Authorization: Bearer "+ token})
    @POST("/v1/users/posts/bookmarkers/all")
    Call<PostBookmarks> getBookmarks(@Body PostBody id);
}
