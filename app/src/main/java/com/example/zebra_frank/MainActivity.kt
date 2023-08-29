package com.example.zebra_frank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.zebra_frank.zbradapters.ZbrAdapters
import com.example.zebra_frank.zbrdatas.ZbrSetting
import kotlinx.android.synthetic.main.activity_main.zbrListView

class MainActivity : AppCompatActivity() {

    val mZebraList = ArrayList<ZbrSetting>()

    lateinit var mZbrAdapters: ZbrAdapters
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mZebraList.add(ZbrSetting("Zebra 기본 세팅 1D", "초기화, 엔터값, ITF 등 활성화"))
        mZebraList.add(ZbrSetting("Zebra 기본 세팅 2D","초기화, 엔터값"))
        mZebraList.add(ZbrSetting("엔터 세팅 I","3개"))
        mZebraList.add(ZbrSetting("엔터 세팅 II", "1개"))
        mZebraList.add(ZbrSetting("0 추가", "UPCa to EAN13, System Character&Country Code"))
        mZebraList.add(ZbrSetting("O 제거", "System Character"))
        mZebraList.add(ZbrSetting("TAB 세팅", ""))
        mZebraList.add(ZbrSetting("ITF AnyLength", "ITF 길이 제한 해제"))
        mZebraList.add(ZbrSetting("영문 세팅", "영문 고정"))
        mZebraList.add(ZbrSetting("인터페이스 설정", "USB, CDC, RS232"))
        mZebraList.add(ZbrSetting("톤 (Tone)", "비프음 톤 세팅" ))
        mZebraList.add(ZbrSetting("음량(Volume)", "비프음 음량 조절"))
        mZebraList.add(ZbrSetting("RS232 전송 속도", ""))
        mZebraList.add(ZbrSetting("도서 바코드 ISBN", "EAN13 Add-on"))
        mZebraList.add(ZbrSetting("[무선] 블루투스 연결", ""))
        mZebraList.add(ZbrSetting("DPM 모드 & 조명", "DPM 종류별 모드, 조명 설정"))
        mZebraList.add(ZbrSetting("Polling Interval", "1ms ~ 9ms"))
        mZebraList.add(ZbrSetting("MP7000 기본 세팅", ""))
        mZebraList.add(ZbrSetting("[무선]배치 모드", "배치 모드 설정 & 데이터 전송"))

        mZbrAdapters = ZbrAdapters(this, R.layout.zebra_setting_item, mZebraList)
        zbrListView.adapter = mZbrAdapters

        zbrListView.setOnItemClickListener { adapterView, view, position, l ->

            val clickedZebra = mZebraList[position]

            val  myIntent = Intent(this, ZebraSettingDetailActivity::class.java)
            myIntent.putExtra("setting", clickedZebra)
            startActivity(myIntent)
        }
        }

    }
