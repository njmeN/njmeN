package ir.dunijet.wikipedia.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import ir.dunijet.wikipedia.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    lateinit var binding:ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain3Binding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
    }
}