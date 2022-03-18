package com.example.linkross

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)



        button_login.setOnClickListener{
            val s_id:String = input_id.text.toString()
            val s_password:String = input_password.text.toString()

            if (s_id == "pastor" && s_password == "1234"){
                val intent = Intent(this,HomeActivity::class .java)
                startActivity(intent)
            } else {
                Toast.makeText(applicationContext,"아이디: paster, 비번: 1234", Toast.LENGTH_LONG).show()
            }
        }


    }
}