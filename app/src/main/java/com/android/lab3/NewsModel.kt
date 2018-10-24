package com.android.lab3

import android.os.Parcel
import android.os.Parcelable

/*
data class NewsModel(
        var title: String,
        var date: String,
        var text: String,
        var image_url: Int): Parcelable{
        //var image: String) : Parcelable{
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readInt()
            //parcel.readString()
        )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(title)
        parcel.writeString(date)
        parcel.writeString(text)
        parcel.writeInt(image_url)
        //parcel.writeString(image)
    }

    override fun describeContents(): Int {
        return 0
    }

    fun getImageUrl(): Int {
        return image_url
    }

    companion object CREATOR : Parcelable.Creator<NewsModel> {
        override fun createFromParcel(parcel: Parcel): NewsModel {
            return NewsModel(parcel)
        }

        override fun newArray(size: Int): Array<NewsModel?> {
            return arrayOfNulls(size)
        }
    }
}*/

class NewsModel{
    var title: String = ""
    var date: String = ""
    var text: String = ""
    var image_url = 0

    fun getImageUrl(): Int {
        return image_url
    }
}
