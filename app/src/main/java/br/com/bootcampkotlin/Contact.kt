package br.com.bootcampkotlin

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Contact(
    var name: String,
    var phone: String,
    var photograph: String
): Parcelable