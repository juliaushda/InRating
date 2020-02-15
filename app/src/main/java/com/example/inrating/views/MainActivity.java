package com.example.inrating.views;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.inrating.PostAdapter;
import com.example.inrating.PostAdapter2;
import com.example.inrating.requests.PostBookmarks;
import com.example.inrating.requests.PostCommentators;
import com.example.inrating.requests.PostMentioned;
import com.example.inrating.requests.PostReposters;
import com.example.inrating.requests.PostViewers;
import com.example.inrating.requests.model.PostBody;
import com.example.inrating.R;

import com.example.inrating.requests.PostLikers;

import com.example.inrating.requests.model.User;
import com.example.inrating.service.NetworkService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerLikers;
    RecyclerView recyclerReposters;
    RecyclerView recyclerComentators;
    RecyclerView recyclerMentions;

    PostAdapter likersAdapter;
    PostAdapter repostersAdapter;
    PostAdapter comentatorsAdapter;
    PostAdapter mentionsAdapter;
    PostAdapter bookmarkAdapter;
    PostAdapter2 viewersAdapter;

    private TextView textViewsCount;
    private TextView textViewLikersCount;
    private TextView textViewComentatorsCount;
    private TextView textViewMentionsCount;
    private TextView textViewRepostsCount;
    private TextView textViewBookmarksCountPost;
    public static final int USER_ID = 2028;
    List<User> usersInfo = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewsCount = findViewById(R.id.views_count);
        textViewLikersCount = findViewById(R.id.likers_count);
        textViewComentatorsCount = findViewById(R.id.comentators_count);
        textViewMentionsCount = findViewById(R.id.mentions_count);
        textViewRepostsCount = findViewById(R.id.reposts_count);
        textViewBookmarksCountPost = findViewById(R.id.bookmarks_count_post);

        recyclerLikers = (RecyclerView) findViewById(R.id.likers_recycle_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerLikers.setLayoutManager(layoutManager);
        likersAdapter = new PostAdapter(usersInfo,this);
        recyclerLikers.setAdapter(likersAdapter);

        recyclerReposters = (RecyclerView)findViewById(R.id.reposts_recycle_view);
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);
        recyclerReposters.setLayoutManager(linearLayoutManager1);
        repostersAdapter = new PostAdapter(usersInfo,this);
        recyclerReposters.setAdapter(repostersAdapter);

        recyclerComentators = (RecyclerView)findViewById(R.id.comentators_recycle_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);
        recyclerComentators.setLayoutManager(linearLayoutManager);
        comentatorsAdapter = new PostAdapter(usersInfo,this);
        recyclerComentators.setAdapter(comentatorsAdapter);

        recyclerMentions = (RecyclerView)findViewById(R.id.mentions_recycle_view);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);
        recyclerMentions.setLayoutManager(linearLayoutManager2);
        mentionsAdapter = new PostAdapter(usersInfo,this);
        recyclerMentions.setAdapter(mentionsAdapter);

        getLikers();
        getReposters();
        getComentators();
        getMentions();
        getBookmarks();
        getViews();
        //getPostsData();

    }

    public void getViews() {
        NetworkService.getInstance().getJSONApi().
                getViewers(new PostBody(USER_ID)).enqueue(new Callback<PostViewers>() {
            @Override
            public void onResponse(@NonNull Call<PostViewers> call, @NonNull Response<PostViewers> response) {
                Log.i("TEST_getViewers", "message = " + response.message());
                if (response.body() != null) {
//                    viewersAdapter.setUsers(response.body().getData());
//                    Integer t = response.body().getData().size();
                    textViewsCount.setText(response.body().getData().size()+"");
                }
            }

            @Override
            public void onFailure(@NonNull Call<PostViewers> call, @NonNull Throwable t) {
                Log.i("TEST_getViewers", "message = " + t.getMessage());
            }
        });
    }

    public void getBookmarks() {
        NetworkService.getInstance().getJSONApi().
                getBookmarks(new PostBody(USER_ID)).enqueue(new Callback<PostBookmarks>() {
            @Override
            public void onResponse(@NonNull Call<PostBookmarks> call, @NonNull Response<PostBookmarks> response) {
                Log.i("TEST_getBookmarks", "message = " + response.message());
                if (response.body() != null) {
//                    bookmarkAdapter.setUsers(response.body().getData());
                    textViewBookmarksCountPost.setText(response.body().getData().size()+"");
                }
            }

            @Override
            public void onFailure(@NonNull Call<PostBookmarks> call, @NonNull Throwable t) {
                Log.i("TEST_getBookmarks", "message = " + t.getMessage());
            }
        });
    }


    public void getLikers() {
        NetworkService.getInstance().getJSONApi().
                getLikers(new PostBody(USER_ID)).enqueue(new Callback<PostLikers>() {
            @Override
            public void onResponse(@NonNull Call<PostLikers> call, @NonNull Response<PostLikers> response) {
                Log.i("TEST_getLikers", "message = " + response.message());
                if (response.body() != null) {
                    likersAdapter.setUsers(response.body().getData());
                    textViewLikersCount.setText(response.body().getData().size()+"");
                }
            }

            @Override
            public void onFailure(@NonNull Call<PostLikers> call, @NonNull Throwable t) {
                Log.i("TEST_getLikers", "message = " + t.getMessage());
            }
        });
    }

    public void getReposters(){
        NetworkService.getInstance().getJSONApi().getReposters(new PostBody(USER_ID)).enqueue(new Callback<PostReposters>() {
            @Override
            public void onResponse(@NonNull Call<PostReposters> call, @NonNull Response<PostReposters> response) {
                Log.i("TEST_getReposters", "response.body = " + response.body().getData().size());
                Log.i("TEST_getReposters", "message = " + response.message());
                if (response.body() != null) {
                    repostersAdapter.setUsers(response.body().getData());
                    textViewRepostsCount.setText(response.body().getData().size()+"");
                }
            }
            @Override
            public void onFailure(@NonNull Call<PostReposters> call, @NonNull Throwable t) {
                Log.i("TEST_getReposters", "message = " + t.getMessage());
            }
        });
    }

    public void getComentators(){
        NetworkService.getInstance().getJSONApi().getComentators(new PostBody(USER_ID)).enqueue(new Callback<PostCommentators>() {
            @Override
            public void onResponse(Call<PostCommentators> call, Response<PostCommentators> response) {
                Log.i("TEST_getComentators", "response.body = " + response.body());
                Log.i("TEST_getComentators", "message = " + response.message());
                if (response.body() != null) {
                    comentatorsAdapter.setUsers(response.body().getData());
                    textViewComentatorsCount.setText(response.body().getData().size()+"");
                }
            }
            @Override
            public void onFailure(@NonNull Call<PostCommentators> call, @NonNull Throwable t) {
                Log.i("TEST_getComentators", "message = " + t.getMessage());
            }
        });
    }

    public void getMentions(){
        NetworkService.getInstance().getJSONApi().getMentions(new PostBody(USER_ID)).enqueue(new Callback<PostMentioned>() {
            @Override
            public void onResponse(Call<PostMentioned> call, Response<PostMentioned> response) {
                Log.i("TEST_getMentions", "response.body = " + response.body());
                Log.i("TEST_getMentions", "message = " + response.message());
                if (response.body() != null) {
                    mentionsAdapter.setUsers(response.body().getData());
                    textViewMentionsCount.setText(response.body().getData().size()+" ");
                }
            }
            @Override
            public void onFailure(@NonNull Call<PostMentioned> call, @NonNull Throwable t) {
                Log.i("TEST_getMentions", "message = " + t.getMessage());
            }
        });
    }

}



