package com.orm.entity;

public class PostEntity {
    private Long id;
    private String caption;
    private String mediaUrl;
    // fk_user_id (relation)



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    @Override
    public String toString() {
        return "PostEntity{" +
                "id=" + id +
                ", caption='" + caption + '\'' +
                ", mediaUrl='" + mediaUrl + '\'' +
                '}';
    }
}
