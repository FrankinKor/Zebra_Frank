package com.example.zebra_frank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.zebra_frank.zbrdatas.ZbrSetting
import kotlinx.android.synthetic.main.zebra_setting_item.zbrSettingTitle

class ZebraSettingDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zebra_setting_detail)

        val zebraData = intent.getSerializableExtra("setting") as ZbrSetting

        zbrSettingTitle.text = zebraData.zbrSetting

    }
}