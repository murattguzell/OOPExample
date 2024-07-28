package com.muratguzel.kotlinoop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var myUser = User("Murat", 22)
        println(myUser.name + " " + myUser.age)
        println(myUser.information())

        //encapsulation
        // set etmeyi veya get etmeyi sınırlandırır private hesabı
        var james = Musicians("james", "Guitar", 50)
        println(james.age.toString())
        println(james.returnBandName("Atıl"))
        println(james.returnBandName("kirk"))

        //inheritance
        // miras alır
        var lars = SuperMusician("Lars", "Drums", 65)
        println(lars.name)
        println(lars.returnBandName("Atıl"))
        lars.sign()

        //polymorphims
        //aynı ismi kullanarak farklı fonsksiyonlar oluşturabilmeye yarar

        //static polymorphism
        var mathematics = Mathematics()
        println(mathematics.sum())
        println(mathematics.sum(3, 4))
        println(mathematics.sum(3, 4, 5))

        //dynamic polymorphism
        // yukarıdaki işlemi farklı sınıflarda yapmak için kullanılır

        val animal = Animal()
        animal.sign()
        val barley = Dog()
        barley.sing()
        barley.test()

        //abstract & interface
        //aldığın işi derinleştirebilmen sana verilen ipuçları ile tatmin olabilip sorunları ve problemleri kendi başına çözmen ve çok soru sormaman lazımmış
        // sınıftan nesne oluşturamazsın--> abstract

        var myPiano = Piano()
        myPiano.brand = "Yamaha"
        myPiano.digital = false
        println(myPiano.roomName)
        myPiano.info()


        //Lambda gosterimleri
        // bir fonksiyonu tek satırda body açmadan yazmamızı sağlayan gosterim
        fun printString(myString: String) {
            println(myString)
        }
        printString("My Test String")

        val testString = { myString: String -> println(myString) }
        testString("My Lambda String")
        val multiplyLambda = { a: Int, b: Int -> a * b }
        println(multiplyLambda(5, 4))

        val multiplyLambda2: (Int, Int) -> Int = { a, b -> a * b }
        println(multiplyLambda2(5, 5))


        //asynchronus

        //callback function, listener function

        fun downloadMusicians(url: String, completion: (Musicians) -> Unit) {
            // url -> download
            //data
            val kirkHamemt = Musicians("kirk", "guitar", 60)
            completion(kirkHamemt)
        }
        downloadMusicians("metalica.com") { musician ->
            println(musician.name)
        }

    }
}