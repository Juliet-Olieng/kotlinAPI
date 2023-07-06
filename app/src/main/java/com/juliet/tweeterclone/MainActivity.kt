package com.juliet.tweeterclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.juliet.tweeterclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        dispayTweets()
    }
    fun dispayTweets(){
        var tweet1=TweetData("","juliet","@julietAnyango","Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
                ,3,6,7)
        var tweet2=TweetData("","teddy","@teddy254","am sorry ."
            ,3,6,7)
        var tweet3=TweetData("","kait","@kaitlin","Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
            ,3,6,7)
        var tweet4=TweetData("","maggie","@magie4","Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
            ,3,6,7)
        var tweetlist= listOf<TweetData>(tweet1,tweet2,tweet3,tweet4)
        binding.rvTweets.layoutManager=LinearLayoutManager(this)
        var tweetAdapter=tweetRvadapter2(tweetlist)
        binding.rvTweets.adapter=tweetAdapter

    }
}