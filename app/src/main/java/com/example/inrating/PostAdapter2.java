package com.example.inrating;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.inrating.requests.model.User2;

import java.util.ArrayList;
import java.util.List;

public class PostAdapter2 extends RecyclerView.Adapter<PostAdapter2.ViewHolder2> {

    private List<User2> usersInfo = new ArrayList<>();
    private Context context;


    public PostAdapter2(List<User2> usersInfo, Context context) {
        this.usersInfo = usersInfo;
        this.context = context;
    }

    public void setUsers(List<User2> usersInfo) {
        this.usersInfo = usersInfo;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.likers, parent, false);
        return new ViewHolder2(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder2 holder, int position) {
        String url = usersInfo.get(position).getUser().getAvatarImage().getUrlSmall();
        holder.userNameLikers.setText(usersInfo.get(position).getUser().getNickname());
        Glide.with(context)
                .load(url)
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        if (usersInfo == null)
            return 0;
        return usersInfo.size();
    }

    class ViewHolder2 extends RecyclerView.ViewHolder {
        TextView userNameLikers;
        ImageView imageView;

        ViewHolder2(View v) {
            super(v);
            userNameLikers = (TextView) v.findViewById(R.id.likers_post);
            imageView = (ImageView) v.findViewById(R.id.image_view);
        }
    }
}