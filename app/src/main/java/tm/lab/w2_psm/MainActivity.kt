package tm.lab.w2_psm

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView
import java.util.Date

class MainActivity : AppCompatActivity() {

    private lateinit var tv1L : TextView
    private lateinit var b1L:  Button
    private lateinit var rGL: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv1L = findViewById(R.id.tv1)

        b1L = findViewById(R.id.b1)
        b1L.setOnClickListener {
            tv1L.text = Date().toString()
        }

        rGL = findViewById(R.id.rG)
        rGL.setOnCheckedChangeListener { group, checkedId ->
            if (checkedId == R.id.rb1) {
                tv1L.setBackgroundColor(Color.rgb(10,10,10))
            } else if (checkedId == R.id.rb2) {
                tv1L.setBackgroundColor(Color.rgb(100,100,100))
            } else if (checkedId == R.id.rb3) {
                startActivity(Intent(applicationContext,MainActivity2::class.java))
            }
        }
    }
}