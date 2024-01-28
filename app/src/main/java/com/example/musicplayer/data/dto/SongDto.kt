package com.example.musicplayer.data.dto

data class SongDto(
    val mediaId: String = "",
    val title: String = "",
    val artist: String = "",
    val songUrl: String = "",
    val imageUrl: String = ""
)