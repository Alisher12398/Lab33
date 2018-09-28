package com.android.lab3

import android.os.Parcel
import android.os.Parcelable

data class CategoryModel(
        var title: String) : Parcelable {

    constructor(parcel: Parcel) : this(
            parcel.readString()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(title)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<NewsModel> {
        override fun createFromParcel(parcel: Parcel): NewsModel {
            return NewsModel(parcel)
        }

        override fun newArray(size: Int): Array<NewsModel?> {
            return arrayOfNulls(size)
        }
    }
}