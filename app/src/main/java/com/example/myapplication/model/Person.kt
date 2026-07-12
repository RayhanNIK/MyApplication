package com.example.myapplication.model

import android.os.Parcelable

data class Person (
    var name: String?,
    var age: Int?,
    var email: String?,
    var city: String?
) : Parcelable