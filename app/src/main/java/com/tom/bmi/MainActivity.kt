@file:Suppress("DEPRECATION")

package com.tom.bmi
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.tom.bmi.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import android.app.AlertDialog
import android.content.Intent
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider


class MainActivity : AppCompatActivity() {
   // private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(binding.root)
        setContentView(R.layout.activity_main)

        b_help.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("BMI說明")
                .setMessage("體重(KG)/身高的平方(cm)")
                .setPositiveButton("OK", null)
                .show()
        }





        /*
        匿名類別的寫法

        object : View.onClickListener() {
            @Override
            fun onClick(v : View) {

            }


          object : View.onClickListener() {
            @Override
            fun onCliclk(v : View) {
            }
          }
        }
         */

    }

    fun bmi(view: View) {
        val weight : Float = ed_weight.text.toString().toFloat()
        val height : Float = ed_height.text.toString().toFloat()
        val bmi : Float = weight / (height * height)
        Log.d("BMI", bmi.toString())
        val intent = Intent(this, ResultActivity::class.java)
                .apply{
                    startActivity(this)
                }


        //Toast.makeText(this, bmi.toString(), Toast.LENGTH_LONG).show()

        //產生builder物件
        //val builder = AlertDialog.Builder(this)
        //呼叫setMessage方法來顯示文字
        //builder.setMessage("Hello")
        //顯示對話框
        //builder.show()
        /*
        AlertDialog.Builder(this)
                .setMessage(bmi.toString())
                .setTitle("You BMI")
                .setPositiveButton("ok", null)
                .setNeutralButton("Cancel", null)
                .show()


        */
        //AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this)
        //dialog.stetTitle("基本訊息對話框")

    }


}