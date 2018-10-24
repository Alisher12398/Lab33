package com.android.lab2.databasetest

import android.database.sqlite.SQLiteOpenHelper
import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase

class Database(context: Context) : SQLiteOpenHelper(context, "db", null, 1) {


    /*fun Database(context: Context, name:String?, factory: SQLiteDatabase.CursorFactory, version : Int){
        super(context, name, factory, version)
    }*/


    override fun onCreate(db: SQLiteDatabase) {
        /*val CREATE_PRODUCTS_TABLE = ("CREATE TABLE " +
                TABLE_PRODUCTS + "("
                + COLUMN_ID + " INTEGER PRIMARY KEY," +
                COLUMN_PRODUCTNAME
                + " TEXT," + COLUMN_QUANTITY + " INTEGER" + ")")*/
        //db?.execSQL("create table Contact(id integer primary key autoincrement, name text, password integer)")


        //val CREATE_TABLE = "CREATE TABLE $TABLE_NAME ($ID INTEGER PRIMARY KEY, $NAME TEXT,$PASS TEXT);"
        val CREATE_TABLE = "CREATE TABLE Contact (id INTEGER PRIMARY KEY, name TEXT,password TEXT);"
        db.execSQL(CREATE_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }

/*
    companion object {
        private val DB_VERSION = 1
        private val DB_NAME = "db"
        private val TABLE_NAME = "Contact"
        private val ID = "id"
        private val NAME = "name"
        private val PASS = "password"
    }
*/



}