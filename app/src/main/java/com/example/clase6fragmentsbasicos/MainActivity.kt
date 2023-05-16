package com.example.clase6fragmentsbasicos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private lateinit var floatingButton: FloatingActionButton
    private var isModoLight: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        floatingButton = findViewById(R.id.floatingActionButton)
        
        floatingButton.setOnClickListener {
            if (isModoLight) {
                supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView3, DarkFragment()).commit()
            } else {
                supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView3, BlankFragment()).commit()
            }

            isModoLight = !isModoLight
        }
    }
}