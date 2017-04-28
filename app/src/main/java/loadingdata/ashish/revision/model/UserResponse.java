package loadingdata.ashish.revision.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Aashish on 4/21/2017.
 */

public class UserResponse{
        @SerializedName("responseCode")
        @Expose
        private Integer responseCode;
        @SerializedName("responseMessage")
        @Expose
        private String responseMessage;
        @SerializedName("totalCount")
        @Expose
        private Integer totalCount;
        @SerializedName("wallpapers")
        @Expose
        private List<Wallpaper> wallpapers = null;

        public Integer getResponseCode() {
            return responseCode;
        }

        public void setResponseCode(Integer responseCode) {
            this.responseCode = responseCode;
        }

        public String getResponseMessage() {
            return responseMessage;
        }

        public void setResponseMessage(String responseMessage) {
            this.responseMessage = responseMessage;
        }

        public Integer getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
        }

        public List<Wallpaper> getWallpapers() {
            return wallpapers;
        }

        public void setWallpapers(List<Wallpaper> wallpapers) {
            this.wallpapers = wallpapers;
        }

}