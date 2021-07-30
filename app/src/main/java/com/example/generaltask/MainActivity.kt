package com.example.generaltask

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity(){
    private var text : TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text = findViewById(R.id.text)
        text?.text = getInfo()
    }
    fun getInfo(): String {
        return "- build type: ${BuildConfig.BUILD_TYPE}\n" +
                "- flavor: ${BuildConfig.FLAVOR}\n "+
                "- version name: ${BuildConfig.VERSION_NAME}\n" +
                "- BASE_URL: ${BuildConfig.BASE}\""

    }
    }

