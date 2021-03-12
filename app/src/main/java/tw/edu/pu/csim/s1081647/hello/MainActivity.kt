package tw.edu.pu.csim.s1081647.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var txv: TextView=findViewById<TextView>(R.id.txv)
        txv.test="嗨，我是游騰信"
    }
    fun TestMaster(){
        var txv: TextView=finfViewById<TextView>(R.id.txv)
        txv.text="Master分支"
    }
}