package com.clarissa22.tweeter

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.clarissa22.tweeter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()
    }


    fun displayContacts(){
        var tweet5=Tweets("","","Virgina_Kenya_254","","","","My Grandpa is my Hero","12","12","13")
        var tweet1=Tweets("","","","","","My grandFather is my Hero","39","60","69","132")
        var tweet2=Tweets("","","","","","My grandFather is my Hero","39","60","69","132")
        var tweet3=Tweets("","","","","","My grandFather is my Hero","39","60","69","132")
        var tweet4=Tweets("","","","","","My grandFather is my Hero","39","60","69","132")
        var tweet6=Tweets("","","","","","My grandFather is my Hero","39","60","69","132")
        var tweet7=Tweets("","","","","","My grandFather is my Hero","39","60","69","132")
        var tweet8=Tweets("","","","","","My grandFather is my Hero","39","60","69","132")


        var  contactList=listOf(tweet1,tweet2,tweet3,tweet4,tweet5,tweet6,tweet7,tweet8)
        var contactAdapter=TweeterRvAdapter(contactList)
        binding.rvTweet.layoutManager= LinearLayoutManager(this)
        binding.rvTweet.adapter=contactAdapter



    }
}