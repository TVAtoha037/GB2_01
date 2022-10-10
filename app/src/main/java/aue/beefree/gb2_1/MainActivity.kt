package aue.beefree.gb2_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import aue.beefree.gb2_1.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn).setOnClickListener{

        }
    }
}