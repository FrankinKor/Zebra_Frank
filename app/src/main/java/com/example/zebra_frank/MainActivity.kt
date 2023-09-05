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

        mZebraList.add(ZbrSetting("Zebra 기본 세팅 1D", "초기화, 엔터값, ITF 등 활성화", listOf(R.drawable.zbrsetdefaults1d, R.drawable.zbrscanoptions, R.drawable.zbrdatasuffix, R.drawable.zbrenter, R.drawable.zbrcodabar,R.drawable.zbrcode93, R.drawable.zbritf)))
        mZebraList.add(ZbrSetting("Zebra 기본 세팅 2D","초기화, 엔터값", listOf(R.drawable.zbrdefaultdm)))
        mZebraList.add(ZbrSetting("엔터 세팅 I","3개", listOf(R.drawable.zbrscanoptions, R.drawable.zbrdatasuffix, R.drawable.zbrenter)))
        mZebraList.add(ZbrSetting("엔터 세팅 II", "1개", listOf(R.drawable.zbrenterkeylong)))
        mZebraList.add(ZbrSetting("0 추가", "UPCa to EAN13, System Character&Country Code", listOf(R.drawable.zbraddzero)))
        mZebraList.add(ZbrSetting("O 제거", "System Character", listOf(R.drawable.zbrnozero)))
        mZebraList.add(ZbrSetting("TAB 세팅", "", listOf(R.drawable.zbrtab)))
        mZebraList.add(ZbrSetting("ITF AnyLength", "ITF 길이 제한 해제", listOf(R.drawable.zbritfanylength)))
        mZebraList.add(ZbrSetting("영문 세팅", "영문 고정", listOf(R.drawable.zbronlyenglish)))
        mZebraList.add(ZbrSetting("인터페이스 설정", "USB, CDC, RS232", listOf(R.drawable.zbrusb, R.drawable.zbrcdc, R.drawable.zbr232)))
        mZebraList.add(ZbrSetting("톤 (Tone)", "비프음 톤 세팅", listOf(R.drawable.zbrbeeperhigh, R.drawable.zbrbeepermedium,R.drawable.zbrbeeperlow, R.drawable.zbrbeeperoff)))
        mZebraList.add(ZbrSetting("음량(Volume)", "비프음 음량 조절", listOf(R.drawable.zbrvolumehigh, R.drawable.zbrvolumemedium, R.drawable.zbrvolumelow)))
        mZebraList.add(ZbrSetting("RS232 전송 속도", "9,600  19,200  38,400  57,600  115,200", listOf()))
        mZebraList.add(ZbrSetting("도서 바코드 ISBN", "EAN13 Add-on", listOf(R.drawable.zbrisbn)))
        mZebraList.add(ZbrSetting("[무선] 블루투스 연결 모드", "Cardle mode, HID BT, BLE", listOf(R.drawable.zbrcradlemode, R.drawable.zbrhidbt, R.drawable.zbrble)))
        mZebraList.add(ZbrSetting("DPM 모드 & 조명", "DPM 종류별 모드, 조명 설정", listOf(R.drawable.zbrmpmmodedesccription, R.drawable.zbrdpmilluminationdescription,R.drawable.zbrdpmmode1, R.drawable.zbrdpmmode2,R.drawable.zbrdpmdirect, R.drawable.zbrdpmindirect, R.drawable.zbrdpmcycle )))
        mZebraList.add(ZbrSetting("Polling Interval", "1ms ~ 9ms", listOf(R.drawable.zbrpolling1,R.drawable.zbrpolling2,R.drawable.zbrpolling3,R.drawable.zbrpolling4,R.drawable.zbrpolling5,R.drawable.zbrpolling6,R.drawable.zbrpolling7,R.drawable.zbrpolling8,R.drawable.zbrpolling9)))
        mZebraList.add(ZbrSetting("MP7000 기본 세팅", "",listOf(R.drawable.zbrmp70001, R.drawable.zbrmp70002)))
        mZebraList.add(ZbrSetting("[무선]배치 모드", "배치 모드 설정 & 데이터 전송",listOf()))

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
