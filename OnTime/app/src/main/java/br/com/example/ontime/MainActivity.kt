package br.com.example.ontime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun redirectEvents(view: View) {
        val intent = Intent(this, EventActivity::class.java)
        startActivity(intent)
    }

    fun redirectRotaEvento(view: View) {
        val intent = Intent(this, RotaEventoActivity::class.java)
        startActivity(intent)
    }

    fun redirectRestaurantes(view: View) {
        val intent = Intent(this, RestauranteActivity::class.java)
        startActivity(intent)
    }

    fun redirectRotaHotal(view: View) {
        val intent = Intent(this, RotaHotelActivity::class.java)
        startActivity(intent)
    }
}
