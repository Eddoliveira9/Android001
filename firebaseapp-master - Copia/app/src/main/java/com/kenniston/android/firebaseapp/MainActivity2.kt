package com.kenniston.android.firebaseapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity2 : AppCompatActivity() {

    private var mAuth : FirebaseAuth? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        mAuth = FirebaseAuth.getInstance()



        button.setOnClickListener{ login() }

    }

    private fun login() {
        startActivity(Intent(applicationContext, MainActivity::class.java))
    }


}
