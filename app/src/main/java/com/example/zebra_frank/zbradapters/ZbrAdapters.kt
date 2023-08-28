package com.example.zebra_frank.zbradapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.zebra_frank.R
import com.example.zebra_frank.zbrdatas.ZbrSetting

class ZbrAdapters(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<ZbrSetting>): ArrayAdapter<ZbrSetting>(mContext, resId, mList) {

    val inflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inflater.inflate(R.layout.zebra_setting_item, null)
        }

        val row = tempRow!!

        return row
    }

}