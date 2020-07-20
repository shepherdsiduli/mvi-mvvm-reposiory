package com.shepherd.mvi.model

data class Blog(
    var id: Int,//pk
    var title: String,
    var body: String,
    var image: String,
    var category: String
)