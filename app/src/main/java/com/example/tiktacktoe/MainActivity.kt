package com.example.tiktacktoe
//my tiktaktoe
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.tiktacktoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var btnR1C1: TextView
    private lateinit var btnR1C2: TextView
    private lateinit var btnR1C3: TextView
    private lateinit var btnR2C1: TextView
    private lateinit var btnR2C2: TextView
    private lateinit var btnR2C3: TextView
    private lateinit var btnR3C1: TextView
    private lateinit var btnR3C2: TextView
    private lateinit var btnR3C3: TextView
    private lateinit var btnReset: Button
    private lateinit var dataBinding: ActivityMainBinding
    var flag = false
    val symbol1 = "X"
    val symbol2 = "0"
    val text1 = "1st Player Trun"
    val text2 = "2nd Player Trun"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        init();
    }

    fun init() {
        btnR1C1 = dataBinding.btnR1C1
        btnR1C2 = dataBinding.btnR1C2
        btnR1C3 = dataBinding.btnR1C3
        btnR2C1 = dataBinding.btnR2C1
        btnR2C2 = dataBinding.btnR2C2
        btnR2C3 = dataBinding.btnR2C3
        btnR3C1 = dataBinding.btnR3C1
        btnR3C2 = dataBinding.btnR3C2
        btnR3C3 = dataBinding.btnR3C3
        btnReset = dataBinding.btnReset

        dataBinding.tvPlayer.text = text1
        btnR1C1.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.music);
            mp.start()
            flag = !flag
            changePlayerOption(flag, btnR1C1)
        }
        btnR1C2.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.music);
            mp.start()
            flag = !flag
            changePlayerOption(flag, btnR1C2)
        }
        btnR1C3.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.music);
            mp.start()
            flag = !flag
            changePlayerOption(flag, btnR1C3)
        }
        btnR2C1.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.music);
            mp.start()
            flag = !flag
            changePlayerOption(flag, btnR2C1)
        }
        btnR2C2.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.music);
            mp.start()
            flag = !flag
            changePlayerOption(flag, btnR2C2)
        }
        btnR2C3.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.music);
            mp.start()
            flag = !flag
            changePlayerOption(flag, btnR2C3)
        }
        btnR3C1.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.music);
            mp.start()
            flag = !flag
            changePlayerOption(flag, btnR3C1)
        }
        btnR3C2.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.music);
            mp.start()
            flag = !flag
            changePlayerOption(flag, btnR3C2)
        }
        btnR3C3.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.music);
            mp.start()
            flag = !flag
            changePlayerOption(flag, btnR3C3)
        }
        btnReset.setOnClickListener {
            btnR1C1.text = ""
            btnR1C2.text = ""
            btnR1C3.text = ""
            btnR2C1.text = ""
            btnR2C2.text = ""
            btnR2C3.text = ""
            btnR3C1.text = ""
            btnR3C2.text = ""
            btnR3C3.text = ""
            dataBinding.tvPlayer.text = ""
            flag = false

            btnR1C1.setBackgroundColor(resources.getColor(R.color.gray))
            btnR1C2.setBackgroundColor(resources.getColor(R.color.gray))
            btnR1C3.setBackgroundColor(resources.getColor(R.color.gray))
            btnR2C1.setBackgroundColor(resources.getColor(R.color.gray))
            btnR2C2.setBackgroundColor(resources.getColor(R.color.gray))
            btnR2C3.setBackgroundColor(resources.getColor(R.color.gray))
            btnR3C1.setBackgroundColor(resources.getColor(R.color.gray))
            btnR3C2.setBackgroundColor(resources.getColor(R.color.gray))
            btnR3C3.setBackgroundColor(resources.getColor(R.color.gray))
        }
    }

    fun changePlayerOption(flag: Boolean, btn: TextView) {
        if (flag == true) {
            if (btn.text == "") {
                btn.text = symbol1
                dataBinding.tvPlayer.text = text2
            } else {
                Toast.makeText(this, "Cell Occupied", Toast.LENGTH_SHORT).show()
            }
        } else {
            if (btn.text == "") {
                btn.text = symbol2
                dataBinding.tvPlayer.text = text1
            } else {
                Toast.makeText(this, "Cell Occupied", Toast.LENGTH_SHORT).show()
            }
        }

        gameOver()
    }

    fun gameOver() {
        // TODO: Conditions for Symbol 1
        if (btnR1C1.text == symbol1 && btnR1C2.text == symbol1 && btnR1C3.text == symbol1) {
            boxColor(btnR1C1, btnR1C2, btnR1C3)
            dataBinding.tvPlayer.text = "Player 1 Won"

        }
        else if (btnR2C1.text==symbol1 && btnR2C2.text==symbol1 && btnR2C3.text==symbol1) {
            boxColor(btnR2C1, btnR2C2, btnR2C3)
            dataBinding.tvPlayer.text = "Player 1 Won"

        }
        else if (btnR3C1.text==symbol1 && btnR3C2.text==symbol1 && btnR3C3.text==symbol1) {
            boxColor(btnR3C1, btnR3C2, btnR3C3)
            dataBinding.tvPlayer.text = "Player 1 Won"

        }
        else if (btnR1C1.text==symbol1 && btnR2C1.text==symbol1 && btnR3C1.text==symbol1) {
            boxColor(btnR1C1, btnR2C1, btnR3C1)
            dataBinding.tvPlayer.text = "Player 1 Won"

        }
        else if (btnR1C2.text==symbol1 && btnR2C2.text==symbol1 && btnR3C2.text==symbol1) {
            boxColor(btnR1C2, btnR2C2, btnR3C2)
            dataBinding.tvPlayer.text = "Player 1 Won"

        }
        else if (btnR1C3.text==symbol1 && btnR2C3.text==symbol1 && btnR3C3.text==symbol1) {
            boxColor(btnR1C3, btnR2C3, btnR3C3)
            dataBinding.tvPlayer.text = "Player 1 Won"

        }
        else if (btnR1C1.text==symbol1 && btnR2C2.text==symbol1 && btnR3C3.text==symbol1) {
            boxColor(btnR1C1, btnR2C2, btnR3C3)
            dataBinding.tvPlayer.text = "Player 1 Won"

        }
        else if (btnR1C3.text==symbol1 && btnR2C2.text==symbol1 && btnR3C1.text==symbol1) {
            boxColor(btnR1C3, btnR2C2, btnR3C1)
            dataBinding.tvPlayer.text = "Player 1 Won"
        }

        // TODO: Conditions for Symbol 2
        else if (btnR1C1.text == symbol2 && btnR1C2.text == symbol2 && btnR1C3.text == symbol2) {
            boxColor(btnR1C1, btnR1C2, btnR1C3)
            dataBinding.tvPlayer.text = "Player 2 Won"

        }
        else if (btnR2C1.text==symbol2 && btnR2C2.text==symbol2 && btnR2C3.text==symbol2) {
            boxColor(btnR2C1, btnR2C2, btnR2C3)
            dataBinding.tvPlayer.text = "Player 2 Won"

        }
        else if (btnR3C1.text==symbol2 && btnR3C2.text==symbol2 && btnR3C3.text==symbol2) {
            boxColor(btnR3C1, btnR3C2, btnR3C3)
            dataBinding.tvPlayer.text = "Player 2 Won"

        }
        else if (btnR1C1.text==symbol2 && btnR2C1.text==symbol2 && btnR3C1.text==symbol2) {
            boxColor(btnR1C1, btnR2C1, btnR3C1)
            dataBinding.tvPlayer.text = "Player 2 Won"

        }
        else if (btnR1C2.text==symbol2 && btnR2C2.text==symbol2 && btnR3C2.text==symbol2) {
            boxColor(btnR1C2, btnR2C2, btnR3C2)
            dataBinding.tvPlayer.text = "Player 2 Won"

        }
        else if (btnR1C3.text==symbol2 && btnR2C3.text==symbol2 && btnR3C3.text==symbol2) {
            boxColor(btnR1C3, btnR2C3, btnR3C3)
            dataBinding.tvPlayer.text = "Player 2 Won"

        }
        else if (btnR1C1.text==symbol2 && btnR2C2.text==symbol2 && btnR3C3.text==symbol2) {
            boxColor(btnR1C1, btnR2C2, btnR3C3)
            dataBinding.tvPlayer.text = "Player 2 Won"

        }
        else if (btnR1C3.text==symbol2 && btnR2C2.text==symbol2 && btnR3C1.text==symbol2) {
            boxColor(btnR1C3, btnR2C2, btnR3C1)
            dataBinding.tvPlayer.text = "Player 2 Won"

        }

        if ((btnR1C1.text != "" &&
                    btnR1C2.text != "" &&
                    btnR1C3.text != "" &&
                    btnR2C1.text != "" &&
                    btnR2C2.text != "" &&
                    btnR2C3.text != "" &&
                    btnR3C1.text != "" &&
                    btnR3C2.text != "" &&
                    btnR3C3.text != "")
        ) {

            dataBinding.tvPlayer.text = "GAME OVER"
        }
    }

    fun boxColor(btn1: TextView, btn2: TextView, btn3: TextView) {
        btn1.setBackgroundColor(resources.getColor(R.color.green))
        btn2.setBackgroundColor(resources.getColor(R.color.green))
        btn3.setBackgroundColor(resources.getColor(R.color.green))
    }
}