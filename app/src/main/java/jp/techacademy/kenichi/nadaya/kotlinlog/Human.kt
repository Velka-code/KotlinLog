package jp.techacademy.kenichi.nadaya.kotlinlog

import  android.util.Log

class Human: Animal,Thinkable {
    val hobby :String

    // 引数付きコンストラクタ
    constructor(name: String, age: Int,hobby:String): super(name, age) {
        this.hobby = hobby
    }


    // animalクラスのメソッドをオーバライド
    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。"+"年は" + this.age + "です。")
    }
    override fun think(){
        Log.d("kotlintest","私は"+this.hobby+"について考える。")
    }

}