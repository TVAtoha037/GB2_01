package aue.beefree.gb2_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import aue.beefree.gb2_1.R

class MainActivity : AppCompatActivity() {

    var count = 1
    lateinit var weatherItem: WeatherItem

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        weatherItem = WeatherItem(System.currentTimeMillis(), 17, "Moscow")

        findViewById<Button>(R.id.btn).setOnClickListener{


            when(count){
                1 -> Toast.makeText(applicationContext, weatherItem.time.toString(), Toast.LENGTH_SHORT).show()
                2 -> Toast.makeText(applicationContext, weatherItem.value.toString(), Toast.LENGTH_SHORT).show()
                3 -> Toast.makeText(applicationContext, weatherItem.point, Toast.LENGTH_SHORT).show()
                else -> count = 0
            }

            count++
        }

        findViewById<Button>(R.id.btn_copy).setOnClickListener{
            val weatherItemCopy = weatherItem.copy(System.currentTimeMillis(),28, "Krasnodar")
            Toast.makeText(applicationContext, weatherItemCopy.point, Toast.LENGTH_SHORT).show()
        }

    }
}