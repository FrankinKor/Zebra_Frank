package com.example.zebra_frank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.zebra_frank.zbrdatas.ZbrSetting
import kotlinx.android.synthetic.main.activity_zebra_setting_detail.zebraViewPager
import kotlinx.android.synthetic.main.zebra_setting_item.zbrSettingTitle
import kotlinx.android.synthetic.main.activity_zebra_setting_detail.*
import me.relex.circleindicator.CircleIndicator

class ZebraSettingDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zebra_setting_detail)

        val zebraData = intent.getSerializableExtra("setting") as? ZbrSetting

        if (zebraData != null) {
            zbrSettingTitle.text = zebraData.zbrSetting

            val zbrResource = zebraData.zbrResource
            if (zbrResource.isNotEmpty()) {



            } else {
                // 에러 처리를 여기에 추가하세요.



            }

        }
    }
}


