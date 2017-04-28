package loadingdata.ashish.revision.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import loadingdata.ashish.revision.R;

/**
 * Created by Aashish on 4/21/2017.
 */

public class RecyclerViewHolder extends RecyclerView.ViewHolder implements RecyclerView.OnClickListener{

    public TextView name, source, Category;
    public ImageView imageView;

    public RecyclerViewHolder(View itemView) {
        super(itemView);

        name= (TextView) itemView.findViewById(R.id.nametext);
        source= (TextView) itemView.findViewById(R.id.category);
        imageView=(ImageView)itemView.findViewById(R.id.imageView);
    }

    @Override
    public void onClick(View view) {

    }
}
