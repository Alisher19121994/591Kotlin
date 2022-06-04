package com.example.a591kotlin

class Main {
    var feeds:ArrayList<Feeds>? = ArrayList()
    var story:Story? = null
    var isHeaders: Boolean = false

    constructor(feeds: ArrayList<Feeds>?) {
        this.isHeaders = false
        this.feeds = feeds
    }

    constructor(story: Story?) {
        this.story = story
        this.isHeaders = false
    }

    constructor() {
        this.isHeaders = true
    }

}