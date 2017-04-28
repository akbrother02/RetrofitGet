package loadingdata.ashish.revision;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.List;

import loadingdata.ashish.revision.adapter.RecyclerViewAdapter;
import loadingdata.ashish.revision.model.UserResponse;
import loadingdata.ashish.revision.model.Wallpaper;
import loadingdata.ashish.revision.network.ApiServices;
import loadingdata.ashish.revision.services.ApiInterface;
import loadingdata.ashish.revision.viewholder.RecyclerViewHolder;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getUserData();
    }

    private void getUserData() {

        ApiInterface apiInterface= ApiServices.getClient().create(ApiInterface.class);
        Call<UserResponse>wallpaperCall=apiInterface.getWallpaperList("all");
        wallpaperCall.enqueue(new Callback<UserResponse>() {
            @Override
            public void onResponse(Call<UserResponse> call, Response<UserResponse> response) {
                List<Wallpaper> wallpaperList=response.body().getWallpapers();
                for(int i=0;i<wallpaperList.size();i++)
                {
                    linearLayoutManager=new LinearLayoutManager(MainActivity.this);
                    RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recyclerview);
                    recyclerView.setLayoutManager(linearLayoutManager);
                    RecyclerViewAdapter recyclerViewAdapter=new RecyclerViewAdapter(wallpaperList,MainActivity.this);
                    recyclerView.setAdapter(recyclerViewAdapter);
                }


            }

            @Override
            public void onFailure(Call<UserResponse> call, Throwable t) {
                Log.d("Error",t.toString());

            }
        });

    }


}
