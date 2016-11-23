package com.com.armardbellamy.twitter.controller;

import com.armardbellamy.com.armardbellamy.twitter.controller.TwitterController;
import com.armardbellamy.com.armardbellamy.twitter.controller.TwitterResponse;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestTemplate;
import org.springframework.test.web.client.match.MockRestRequestMatchers.*;

import java.util.List;

/**
 * Created by armardbellamy on 10/6/16.
 */
public class TwitterControllerTest {
    @Autowired
    TwitterController twitterController;

    @Autowired
    private RestTemplate restTemplate;

    @Value("${TWITTER_BASE_URI}")
    private String url;

    private MockRestServiceServer mockServer;


    @Before
    public void init(){
       this.mockServer =  MockRestServiceServer.createServer(restTemplate);
    }

    @Test
    public void getTweetsTest(){

    }

    @Test
    public void parseTwitterResponseTest(){



    }
}
