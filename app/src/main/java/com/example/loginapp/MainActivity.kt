package com.example.loginapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var usernameInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var loginBtn: Button
    private lateinit var googleBtn: ImageView
    private lateinit var facebookBtn: ImageView
    private lateinit var linkedinBtn: ImageView
    private lateinit var twitterBtn: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usernameInput = findViewById(R.id.username_input)
        passwordInput = findViewById(R.id.password_input)
        loginBtn = findViewById(R.id.login_btn)
        googleBtn = findViewById(R.id.google_btn)
        facebookBtn = findViewById(R.id.facebook_btn)
        linkedinBtn = findViewById(R.id.linkedin_btn)
        twitterBtn = findViewById(R.id.twitter_btn)

        // Handle Login button click
        loginBtn.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()
            Log.i("Test Credentials", "Username: $username and Password: $password")
        }

        // Google login
        googleBtn.setOnClickListener {
            val googleLoginUrl = "https://accounts.google.com/signin/v2/identifier"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(googleLoginUrl))
            startActivity(intent)
        }

        // Facebook login
        facebookBtn.setOnClickListener {
            val facebookLoginUrl = "https://www.facebook.com/login/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(facebookLoginUrl))
            startActivity(intent)
        }

        // LinkedIn login
        linkedinBtn.setOnClickListener {
            val linkedinLoginUrl = "https://www.linkedin.com/login/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(linkedinLoginUrl))
            startActivity(intent)
        }

        // Twitter login
        twitterBtn.setOnClickListener {
            val twitterLoginUrl = "https://twitter.com/login"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(twitterLoginUrl))
            startActivity(intent)
        }
    }
}
