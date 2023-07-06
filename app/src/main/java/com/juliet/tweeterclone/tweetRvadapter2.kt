package com.juliet.tweeterclone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.juliet.tweeterclone.databinding.ActivityMainBinding
import com.juliet.tweeterclone.databinding.TweetListItemBinding

class tweetRvadapter2(var tweetslist:List<TweetData>):RecyclerView.Adapter<TweetViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetViewHolder {
        var binding=TweetListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return TweetViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TweetViewHolder, position: Int) {
        var currenttweet=tweetslist.get(position)
        holder.binding.tvName.text=currenttweet.displayName
        holder.binding.tvhandle.text=currenttweet.handle
        holder.binding.tvTweet.text=currenttweet.tweet
        holder.binding.tvreplyCount.text=currenttweet.replyCount.toString()
        holder.binding.tvLikeCount.text=currenttweet.likeCount.toString()
        holder.binding.tvRetweetCount.text=currenttweet.rtCount.toString()
    }

    override fun getItemCount(): Int {
        return tweetslist.size
    }
}
class TweetViewHolder(var binding: TweetListItemBinding):RecyclerView.ViewHolder(binding.root)