package com.clarissa22.tweeter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TweeterRvAdapter (var tweetList:List<Tweets>):
        RecyclerView.Adapter<TweetsViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetsViewHolder {
        var itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.tweet_list_items,parent,false)
        return TweetsViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: TweetsViewHolder, position: Int) {
        var currentTweets=tweetList.get(position)
        holder.tvHandle.text=currentTweets.Handle
        holder.tvNum1.text=currentTweets.Num1
        holder.tvNum2.text=currentTweets.Num2
        holder.tvNum3.text=currentTweets.Num3
        holder.tvTweet.text=currentTweets.Tweet


    }

    override fun getItemCount(): Int {
        return tweetList.size

    }
}
class TweetsViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var imgShare=itemView.findViewById<ImageView>(R.id.imgShare)
    var imgReaction=itemView.findViewById<ImageView>(R.id.imgReaction)
    var tvHandle=itemView.findViewById<TextView>(R.id.tvHandle)
    var imgRetweet=itemView.findViewById<ImageView>(R.id.imgRetweet)
    var imgMessage=itemView.findViewById<ImageView>(R.id.imgMessage)
    var imgAvatar=itemView.findViewById<ImageView>(R.id.imgAvatar)
    var tvTweet=itemView.findViewById<TextView>(R.id.tvTweet)
    var tvNum1=itemView.findViewById<TextView>(R.id.tvNum1)
    var tvNum2=itemView.findViewById<TextView>(R.id.tvNum2)
    var tvNum3=itemView.findViewById<TextView>(R.id.tvNum3)
}

