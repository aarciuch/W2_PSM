package tm.lab.w2_psm

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import tm.lab.w2_psm.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding
    private var name1 = NameClass("Ala")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main2)
        binding.nameWidok = name1
        binding.b2.setOnClickListener {
            //binding.tv2.text = "Ala ma kota"
            name1.name = "Gosia"
            binding.invalidateAll()
        }

    }
}