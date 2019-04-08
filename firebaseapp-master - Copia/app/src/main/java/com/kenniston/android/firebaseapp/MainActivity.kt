package com.kenniston.android.firebaseapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    private var mAuth : FirebaseAuth? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mAuth = FirebaseAuth.getInstance()

        button.setOnClickListener{login(user.text.toString(), passw.text.toString(),this@MainActivity) }

    }

    private fun login(email:String,passW:String,activity: Activity) {

        val mAuth = FirebaseAuth.getInstance()
        mAuth?.signInWithEmailAndPassword(email,passW)
                ?.addOnCompleteListener(activity){ task ->
                    if(task.isSuccessful){
                        startActivity(Intent(applicationContext, MainActivity2::class.java))
                    } else {
                        Toast.makeText(applicationContext,"Authentication failed.",
                                Toast.LENGTH_SHORT).show()
                    }
                }

    }


}
