package loadingdata.ashish.revision.services;

import java.util.List;

import loadingdata.ashish.revision.model.UserResponse;
import loadingdata.ashish.revision.model.Wallpaper;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Aashish on 4/21/2017.
 */

public interface ApiInterface {
@GET("getWallpapers.php")
Call<UserResponse> getWallpaperList(@Query("name") String name);

}
