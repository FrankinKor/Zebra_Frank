package com.example.zebra_frank.zbrdatas

import android.view.autofill.AutofillId
import java.io.Serializable

class ZbrSetting (
    val zbrSetting: String,
    val zbrDescription: String,
    val zbrImageResourceId: List<Int>) : Serializable