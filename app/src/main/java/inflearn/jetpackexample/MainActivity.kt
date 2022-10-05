package inflearn.jetpackexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //findViewById
//        val btn1 : Button = findViewById(R.id.btn1)
//        val btn2 : Button = findViewById(R.id.btn2)
//        val btn3 : Button = findViewById(R.id.btn3)
//
//        btn1.text = "new text1"
//        btn2.text = "new text2"
//        btn3.text = "new text3"

        //Kotlin Extensions
        btn1.text = "new text1"
        btn2.text = "new text2"
        btn3.text = "new text3"

        //NullPointerException 발생 -> 앱 중단됨
        second_btn1.text = "new text1"
        second_btn2.text = "new text2"
        second_btn3.text = "new text3"

        //구글에서는 ViewBinding, DataBinding 사용 권장
    }
}