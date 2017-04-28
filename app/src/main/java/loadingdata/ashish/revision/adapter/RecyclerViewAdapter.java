package loadingdata.ashish.revision.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.List;

import loadingdata.ashish.revision.R;
import loadingdata.ashish.revision.model.Wallpaper;
import loadingdata.ashish.revision.viewholder.RecyclerViewHolder;

/**
 * Created by Aashish on 4/21/2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    List<Wallpaper> wallpaperList;
    private Context context;

    public RecyclerViewAdapter(List<Wallpaper> wallpapers, Context context) {
        this.wallpaperList = wallpapers;
        this.context = context;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, null);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.name.setText(wallpaperList.get(position).getName());
        holder.source.setText(wallpaperList.get(position).getCategory());
        String image = wallpaperList.get(position).getThumbnail().toString().replace(" ", "%20");
        Log.d(position + "", "     " + image);
        Picasso.with(context).load(image).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return this.wallpaperList.size();
    }
}
