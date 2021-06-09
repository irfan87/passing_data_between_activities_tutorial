package com.irfanshukri203.passingdatabetweenactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

//        val name = intent.getStringExtra("EXTRA_NAME")
//        val age = intent.getIntExtra("EXTRA_AGE", 0)
//        val country = intent.getStringExtra("EXTRA_COUNTRY")

        val person = intent.getSerializableExtra("EXTRA_PERSON") as Person

//        val personInformationString = """
//            Name: $name
//            Age: $age
//            Live at: $country
//        """.trimIndent()

        val personInformation = """
            User Information
            Name: ${person.name}
            Age: ${person.age}
            Live at: ${person.country}
        """.trimIndent()

        tvPersonResult.text = personInformation

        btnBack.setOnClickListener {
            finish()
        }
    }
}