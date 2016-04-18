
package com.infobion.roundabot.models;

import java.util.ArrayList;
import java.util.List;


public class Videos {

    private LowResolution lowResolution;
    private StandardResolution standardResolution;
    private Comments comments;
    private Object caption;
    private Likes likes;
    private String link;
    private String createdTime;
    private Images images;
    private String type;
    private Object usersInPhoto;
    private String filter;
    private List<Object> tags = new ArrayList<Object>();
    private String id;
    private User user;
    private Object location;

    /**
     * 
     * @return
     *     The lowResolution
     */
    public LowResolution getLowResolution() {
        return lowResolution;
    }

    /**
     * 
     * @param lowResolution
     *     The low_resolution
     */
    public void setLowResolution(LowResolution lowResolution) {
        this.lowResolution = lowResolution;
    }

    /**
     * 
     * @return
     *     The standardResolution
     */
    public StandardResolution getStandardResolution() {
        return standardResolution;
    }

    /**
     * 
     * @param standardResolution
     *     The standard_resolution
     */
    public void setStandardResolution(StandardResolution standardResolution) {
        this.standardResolution = standardResolution;
    }

    /**
     * 
     * @return
     *     The comments
     */
    public Comments getComments() {
        return comments;
    }

    /**
     * 
     * @param comments
     *     The comments
     */
    public void setComments(Comments comments) {
        this.comments = comments;
    }

    /**
     * 
     * @return
     *     The caption
     */
    public Object getCaption() {
        return caption;
    }

    /**
     * 
     * @param caption
     *     The caption
     */
    public void setCaption(Object caption) {
        this.caption = caption;
    }

    /**
     * 
     * @return
     *     The likes
     */
    public Likes getLikes() {
        return likes;
    }

    /**
     * 
     * @param likes
     *     The likes
     */
    public void setLikes(Likes likes) {
        this.likes = likes;
    }

    /**
     * 
     * @return
     *     The link
     */
    public String getLink() {
        return link;
    }

    /**
     * 
     * @param link
     *     The link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * 
     * @return
     *     The createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * 
     * @param createdTime
     *     The created_time
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 
     * @return
     *     The images
     */
    public Images getImages() {
        return images;
    }

    /**
     * 
     * @param images
     *     The images
     */
    public void setImages(Images images) {
        this.images = images;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The usersInPhoto
     */
    public Object getUsersInPhoto() {
        return usersInPhoto;
    }

    /**
     * 
     * @param usersInPhoto
     *     The users_in_photo
     */
    public void setUsersInPhoto(Object usersInPhoto) {
        this.usersInPhoto = usersInPhoto;
    }

    /**
     * 
     * @return
     *     The filter
     */
    public String getFilter() {
        return filter;
    }

    /**
     * 
     * @param filter
     *     The filter
     */
    public void setFilter(String filter) {
        this.filter = filter;
    }

    /**
     * 
     * @return
     *     The tags
     */
    public List<Object> getTags() {
        return tags;
    }

    /**
     * 
     * @param tags
     *     The tags
     */
    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The user
     */
    public User getUser() {
        return user;
    }

    /**
     * 
     * @param user
     *     The user
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * 
     * @return
     *     The location
     */
    public Object getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    public void setLocation(Object location) {
        this.location = location;
    }

}
