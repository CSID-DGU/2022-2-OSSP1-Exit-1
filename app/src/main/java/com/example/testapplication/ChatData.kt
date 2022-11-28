package com.example.myapplication

class ChatData {
    var msg:String? = ""
    var name:String? = ""
    var time:String? = ""

    constructor(msg:String?,nickname:String?, time:String?){
        this.msg = msg
        this.name = nickname
        this.time = time
    }

    override fun toString(): String {
        return name + "," + msg + "," + time
    }
}