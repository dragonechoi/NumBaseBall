package com.cys.numbaseball

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.cys.numbaseball.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding : ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        AlertDialog.Builder(this)
            .setMessage("안녕하세요 숫자 야구 게임에 오신걸 \n환영 합니다.\n 간단한 규칙을 설명 드리겠습니다. \n 공 모양을 터치해 숫자를 적어 \n " +
                    "랜덤으로 부여된 숫자를 찾아 \n 승자가 되어 보세요")
            .setIcon(R.drawable.baseline_sports_baseball_24)
            .setPositiveButton("확인", object : DialogInterface.OnClickListener {
                override fun onClick(dialog: DialogInterface?, which: Int) {
                }
            })
            .show()

    }
}