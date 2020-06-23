package com.example.resistor

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_accion.setOnClickListener{
            var b1:Double = 0.0
            if(rb_p1.isChecked) b1 = 10.0
            if(rb_p2.isChecked) b1 = 20.0
            if(rb_p3.isChecked) b1 = 30.0
            if(rb_p4.isChecked) b1 = 40.0
            if(rb_p5.isChecked) b1 = 50.0
            if(rb_p6.isChecked) b1 = 60.0
            if(rb_p7.isChecked) b1 = 70.0
            if(rb_p8.isChecked) b1 = 80.0
            if(rb_p9.isChecked) b1 = 90.0

            var b2:Double = 0.0
            if(rb_s1.isChecked) b2 = 1.0
            if(rb_s2.isChecked) b2 = 2.0
            if(rb_s3.isChecked) b2 = 3.0
            if(rb_s4.isChecked) b2 = 4.0
            if(rb_s5.isChecked) b2 = 5.0
            if(rb_s6.isChecked) b2 = 6.0
            if(rb_s7.isChecked) b2 = 7.0
            if(rb_s8.isChecked) b2 = 8.0
            if(rb_s9.isChecked) b2 = 9.0

            var b3 = 1
            if(rb_t1.isChecked) b3 = 10
            if(rb_t2.isChecked) b3 = 100
            if(rb_t3.isChecked) b3 = 1000
            if(rb_t4.isChecked) b3 = 10000
            if(rb_t5.isChecked) b3 = 100000
            if(rb_t6.isChecked) b3 = 1000000
            if(rb_t7.isChecked) b3 = 10000000
            if(rb_t8.isChecked) b3 = 100000000
            if(rb_t9.isChecked) b3 = 1000000000

            val btotal: Double = (b1+b2)*b3

            var b4= "2%"
            if(rb_c1.isChecked) b4 = "5%"
            if(rb_c2.isChecked) b4 = "10%"

            tv_resultado.text = "R = $btotal ohms, con un $b4 de tolerancia"
        }
    }

}

