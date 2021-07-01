package jp.techacademy.kenichi.nadaya.kotlinlog

import  android.util.Log

class Human: Animal {

    var hubby: String

    // 引数付きコンストラクタ
    constructor(name: String, age: Int, hubby:String): super(name, age) {
        this.hubby = hubby
    }

    // animalクラスのメソッドをオーバライド
    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。"+"年は" + this.age + "です。")
    }

    fun think(){
        Log.d("kotlintest", "私は" + this.hubby + "について考える")
    }
}