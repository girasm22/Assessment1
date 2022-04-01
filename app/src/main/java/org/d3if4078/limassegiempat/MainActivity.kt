package org.d3if4078.limassegiempat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.d3if4078.limassegiempat.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnHitung.setOnClickListener { hitung() }

    }
        //editPanjang = findViewById(R.id.ePanjang)
        //editLebar = findViewById(R.id.eLebar)
        //editTinggi = findViewById(R.id.eTinggi)
        //buttonHitung = findViewById(R.id.btnHitung)
        //textHasil = findViewById(R.id.hasil)

        //buttonHitung.setOnClickListener(this)


    private fun hitung() {
        val editPanjang = binding.ePanjang.text.toString()
        if (TextUtils.isEmpty(editPanjang.toString())){
            Toast.makeText(this,R.string.panjang_invalid, Toast.LENGTH_LONG).show()
            return
        }

        val editlebar = binding.eLebar.text.toString()
        if (TextUtils.isEmpty(editlebar.toString())){
            Toast.makeText(this,R.string.lebar_invalid, Toast.LENGTH_LONG).show()
            return
        }

        val editTinggi = binding.eTinggi.text.toString()
        if (TextUtils.isEmpty(editTinggi.toString())){
            Toast.makeText(this,R.string.tinggi_invalid, Toast.LENGTH_LONG).show()
            return
        }

        val volumeLimas = (editPanjang.toDouble()*editlebar.toDouble()*editTinggi.toDouble())/3
        binding.hasil.text = getString(R.string.hasil_x, volumeLimas)
    }


    //override fun onClick(v: View?) {
        //if(v != null){
            //if (v.id == R.id.btnHitung){
                //val masukkanPanjang = editPanjang.text.toString().trim()
                //val masukkanLebar = editLebar.text.toString().trim()
                //val masukkanTinggi = editTinggi.text.toString().trim()

                //var kolomKosong = false
                //if(masukkanPanjang.isEmpty()){
                    //kolomKosong = true
                    //editPanjang.error = "KOLOM INI HARUS DIISI!"
                //}
                //if(masukkanLebar.isEmpty()) {
                    //kolomKosong = true
                    //editLebar.error = "KOLOM INI HARUS DIISI!"
                //}
                //if(masukkanTinggi.isEmpty()) {
                    //kolomKosong = true
                    //editTinggi.error = "KOLOM INI HARUS DIISI!"
                //}
                //if (!kolomKosong){
                    //val volumeLimas = (masukkanPanjang.toDouble()*masukkanLebar.toDouble()*masukkanTinggi.toDouble())/3
                    //textHasil.text = volumeLimas.toString()
                //}
            //}
        //}
    //}
}