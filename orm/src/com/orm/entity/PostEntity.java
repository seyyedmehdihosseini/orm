package com.orm.entity;

import com.orm.annotations.annotation.Column;
import com.orm.annotations.annotation.FetchType;
import com.orm.annotations.annotation.ManyToOne;
import com.orm.annotations.annotation.Table;

@Table(name = "tbl_post")
public class PostEntity {
    @Column(name = "p_id_pk", primaryKey = true)
    private Long id;
    @Column(name = "p_caption")
    private String caption;
    @Column(name = "p_media_url")
    private String mediaUrl;
    // fk_user_id (relation)
    @ManyToOne(fetchType = FetchType.EAGER, fk = "p_user_fk")
    private UserEntity user;


    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

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
                ", user=" + user +
                '}';
    }
}
