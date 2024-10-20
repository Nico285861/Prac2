package com.delacruz.nicolas.LaboratorioCalificado02

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var greenView: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        greenView = findViewById(R.id.greenView)

        findViewById<Button>(R.id.buttonShow).setOnClickListener {
            showGreenView()
        }

        findViewById<Button>(R.id.buttonHide).setOnClickListener {
            hideGreenView()
        }
    }

    private fun showGreenView() {
        greenView.visibility = View.VISIBLE // Muestra el View verde
    }

    private fun hideGreenView() {
        greenView.visibility = View.GONE // Oculta el View verde
    }
}
