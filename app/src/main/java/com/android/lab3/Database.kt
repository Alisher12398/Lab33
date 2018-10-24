package com.android.lab3

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log

class Database (context: Context) : SQLiteOpenHelper(context, "db", null, 1){

    override fun onCreate(db: SQLiteDatabase) {


        //val CREATE_TABLE = "CREATE TABLE $TABLE_NAME ($ID INTEGER PRIMARY KEY, $NAME TEXT,$PASS TEXT);"
        val CREATE_TABLE = "CREATE TABLE News (id INTEGER PRIMARY KEY, title TEXT, date TEXT, text TEXT, image_url INTEGER);"
        db.execSQL(CREATE_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }


    fun addTask(news: NewsModel) {
        val db = this.writableDatabase
        val values = ContentValues()
        values.put("title", news.title)
        values.put("date", news.date)
        values.put("text", news.text)
        values.put("image_url", news.image_url)
        db.insert("News", null, values)
        db.close()
    }














}