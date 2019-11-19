package com.example.fook_004_1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.animal.*

class Show : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.animal)
        //ซ่อนไตเติ้ลบาร์
        supportActionBar?.hide()

        val title = intent.extras?.getString(MainActivity().KEY_TITLE,"")
        val animal = intent.extras?.getString(MainActivity().KEY_RESULT,"")

        tv_title.setText(title)
        tv_result.setText("${animal}")
        btn_back.setOnClickListener {
            finish()
        }
    }
}