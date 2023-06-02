package com.example.jetpackcompose

sealed class Destination(val route: String) {
    object ScreenFirst: Destination("ScreenFirst")
    object ScreenSecond: Destination("ScreenSecond")

}
