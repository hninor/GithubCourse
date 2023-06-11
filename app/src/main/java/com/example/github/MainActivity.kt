package com.example.github

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.github.ui.theme.GithubTheme
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_click_me = findViewById<Button>(R.id.btSaludar)
        val etSaludar = findViewById<EditText>(R.id.etNombre)
        val tvSaludar = findViewById<TextView>(R.id.textView)
        btn_click_me.setOnClickListener {
            tvSaludar.text = "Hello ${etSaludar.text}!"
        }

    }
}
