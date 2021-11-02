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
            popularityNumber = 2342,
            likes = 9999,
            follower = 256,
            imageLoc = "https://i2.wp.com/expertist.ph/wp-content/uploads/2021/10/IMG_20211013_091745.jpg?fit=661%2C487&ssl=1"),
        Profile(
            firstName = "John",
            lastName = "Niel",
            title = "Half Human, Half Zombie",
            ranking = 2,
            popularityNumber = 6342,
            likes = 4736,
            follower = 136,
        imageLoc = "https://pbs.twimg.com/profile_images/1235513230081945600/FttYnFCy.jpg" ),
        Profile(
            firstName = "Jerry",
            lastName = "Cool West",
            title = "Half Human, Half Zombie",
            ranking = 3,
            popularityNumber = 6342,
            likes = 4736,
            follower = 136,
            imageLoc = "https://pbs.twimg.com/profile_images/1235513230081945600/FttYnFCy.jpg" ),
        Profile(
            firstName = "Bold",
            lastName = "Hays",
            title = "Half Human, Half Zombie",
            ranking = 4,
            popularityNumber = 6342,
            likes = 4736,
            follower = 136,
            imageLoc = "https://pbs.twimg.com/profile_images/1235513230081945600/FttYnFCy.jpg" ),
        Profile(
            firstName = "David",
            lastName = "Borg",
            title = "Half Human, Half Zombie",
            ranking = 5,
            popularityNumber = 6342,
            likes = 4736,
            follower = 136,
            imageLoc = "https://pbs.twimg.com/profile_images/1235513230081945600/FttYnFCy.jpg" )
        )


}