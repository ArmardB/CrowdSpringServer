package com.armardbellamy.com.armardbellamy.twitter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by armardbellamy on 10/2/16.
 */

@RestController
@RequestMapping(TwitterController.TWITTER_BASE_URI)
public class TwitterController {


    public static final String TWITTER_BASE_URI = "/svc/v1/tweets";

    @Autowired
    private Twitter twitter;

    @RequestMapping(value = "{hashTag}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<TwitterResponse> getTweets(@PathVariable final String hashTag) {
        return parseTwitterResponse(hashTag);
    }

    private List<TwitterResponse> parseTwitterResponse(String hashtag){
        List<Tweet> twitterResponse = twitter.searchOperations().search(hashtag, 10).getTweets();
        List<TwitterResponse> response = new ArrayList<>();
        for(Tweet tweet: twitterResponse){
            response.add(new TwitterResponse(tweet));
        }

        return response;
    }
}
