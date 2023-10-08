package com.example.da4f

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tvsatu:TextView
    private lateinit var tvdua:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvsatu = findViewById(R.id.tvmain)
        tvdua = findViewById(R.id.tvmain2)

        val btnFragment:Button = findViewById(R.id.btn_fragment)
        btnFragment.setOnClickListener(this)

        val username = intent.getParcelableExtra<User>("User")?.username
        val password = intent.getParcelableExtra<User>("User")?.password
        tvsatu.text = "Username : $username"
        tvdua.text = "Password : $username"

        R.id.btn_fragment ->{
            val intent = Intent(this@MainActivity, TesActivity::class.java)
            startActivity(intent)
        }
    }
}