package loadingdata.ashish.revision.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Aashish on 4/21/2017.
 */

public class ApiServices {

    public static Retrofit retrofit=null;
    public static String Base_Url="http://139.59.38.211/WallStack/";
    public static Retrofit getClient()
    {
        if(retrofit==null)
        {
            retrofit=new Retrofit.Builder()
                    .baseUrl(Base_Url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
