package com.example.musicplayer.domain.model

data class Song(
    val mediaId: String,
    val title: String,
    val artist: String,
    val songUrl: String,
    val imageUrl: String
)
