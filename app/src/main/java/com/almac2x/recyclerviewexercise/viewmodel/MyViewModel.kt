package com.almac2x.recyclerviewexercise.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.almac2x.recyclerviewexercise.Profile

class MyViewModel: ViewModel() {

    var profile = mutableListOf<Profile>(
        Profile(
            firstName = "Rasta",
            lastName = "Man",
            title = "Half Human, Half Zombie",
            ranking = 1,
            popularityNumber = 9999,
            likes = 9999,
            follower = "\\u221e",
            imageLoc = "https://i2.wp.com/expertist.ph/wp-content/uploads/2021/10/IMG_20211013_091745.jpg?fit=661%2C487&ssl=1"),
        Profile(
            firstName = "John",
            lastName = "Niel",
            title = "Half Human, Half Zombie",
            ranking = 2,
            popularityNumber = 9999,
            likes = 9999,
            follower = "\\u221e",
        imageLoc = "https://pbs.twimg.com/profile_images/1235513230081945600/FttYnFCy.jpg" ),
        )


}