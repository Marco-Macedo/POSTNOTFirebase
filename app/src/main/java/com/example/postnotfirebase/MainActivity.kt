package com.example.postnotfirebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.auth.FirebaseAuth


// ********************************************************* ATIVIDADE DE INSCRIÇÃO

class MainActivity : AppCompatActivity() {

    // Variáveis globais //
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        auth = FirebaseAuth.getInstance()
    }

    public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = auth.currentUser
  /*      updateUI(currentUser)*/
    }

    fun login(view: View) {

    }

    fun registar(view: View) {

    }

    /* fun updateUI(currentUser: FirebaseUser?)*/
}