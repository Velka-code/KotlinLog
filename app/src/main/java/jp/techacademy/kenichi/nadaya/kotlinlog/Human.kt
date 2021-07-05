package jp.techacademy.kenichi.nadaya.kotlinlog

import  android.util.Log

class Human: Animal,Thinkable {
    var hobby: String

    // 引数付きコンストラクタ
    constructor(name: String, age: Int): super(name, age) {
        this.hobby = "映画"
    }

    // animalクラスのメソッドをオーバライド
    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。"+"年は" + this.age + "です。")
    }

    //Thinkableのインターフェイスのメソッドをオーバーライド
    override fun think(){
        Log.d("kotlintest", "私は" + this.hobby + "について考える")
    }
}