package loadingdata.ashish.revision.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Aashish on 4/21/2017.
 */

    public class Wallpaper {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("source_name")
    @Expose
    private String sourceName;
    @SerializedName("source_link")
    @Expose
    private String sourceLink;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("quad_hd_link")
    @Expose
    private String quadHdLink;
    @SerializedName("full_hd_link")
    @Expose
    private String fullHdLink;
    @SerializedName("hd_link")
    @Expose
    private String hdLink;
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;
    @SerializedName("licence")
    @Expose
    private String licence;
    @SerializedName("added_on")
    @Expose
    private String addedOn;
    @SerializedName("views")
    @Expose
    private String views;
    @SerializedName("downloads")
    @Expose
    private String downloads;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getSourceLink() {
        return sourceLink;
    }

    public void setSourceLink(String sourceLink) {
        this.sourceLink = sourceLink;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getQuadHdLink() {
        return quadHdLink;
    }

    public void setQuadHdLink(String quadHdLink) {
        this.quadHdLink = quadHdLink;
    }

    public String getFullHdLink() {
        return fullHdLink;
    }

    public void setFullHdLink(String fullHdLink) {
        this.fullHdLink = fullHdLink;
    }

    public String getHdLink() {
        return hdLink;
    }

    public void setHdLink(String hdLink) {
        this.hdLink = hdLink;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public String getAddedOn() {
        return addedOn;
    }

    public void setAddedOn(String addedOn) {
        this.addedOn = addedOn;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getDownloads() {
        return downloads;
    }

    public void setDownloads(String downloads) {
        this.downloads = downloads;
    }
}