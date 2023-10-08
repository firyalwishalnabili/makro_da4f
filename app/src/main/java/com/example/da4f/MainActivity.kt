package com.example.da4f

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tv:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvsatu = findViewById(R.id.tvmain)
        tvdua = findViewById(R.id.tvmain2)

        val username = intent.getParcelableExtra<User>("User")?.username
        val password = intent.getParcelableExtra<User>("User")?.password
        tvsatu.text = "Username : $username"
        tvdua.text = "Password : $username"
    }
}