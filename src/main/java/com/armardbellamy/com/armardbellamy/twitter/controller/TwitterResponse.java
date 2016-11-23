package com.armardbellamy.com.armardbellamy.twitter.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.TwitterProfile;

import java.lang.reflect.Array;

/**
 * Created by armardbellamy on 10/5/16.
 */

public class TwitterResponse {

    private String screenName;
    private int statusesCount;
    private int followersCount;
//    private String[] recentTweets;
    private String text;
    private String profile_image_url;



    public TwitterResponse(Tweet tweet){
        TwitterProfile profile = tweet.getUser();
        this.screenName = profile.getScreenName();
        this.statusesCount = profile.getStatusesCount();
        this.followersCount = profile.getFollowersCount();
        this.text = tweet.getText();
        this.profile_image_url = tweet.getProfileImageUrl();


    }

    public String getProfile_image_url() {
        return profile_image_url;
    }

    public void setProfile_image_url(String profile_image_url) {
        this.profile_image_url = profile_image_url;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public int getStatusesCount() {
        return statusesCount;
    }

    public void setStatusesCount(int statusesCount) {
        this.statusesCount = statusesCount;
    }

    public int getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(int followersCount) {
        this.followersCount = followersCount;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
