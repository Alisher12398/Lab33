package com.android.lab2.databasetest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var db=Database(this)

        val sqlitedatabase = db.writableDatabase

        val cursor = sqlitedatabase.query("Contact", null, null, null, null ,null, null)
       // val databaseData = ArrayList<String>()

        if (cursor.moveToFirst()) {
            do {
                val data_id = cursor.getInt(cursor.getColumnIndex("id"))
                val data_name = cursor.getString(cursor.getColumnIndex("name"))
                val data_phone = cursor.getInt(cursor.getColumnIndex("password"))
                val data = data_id.toString() + " | " + data_name + " | " + data_phone.toString()

               // databaseData.add(data)

                val toast2 = Toast.makeText(this,
                        data , Toast.LENGTH_LONG)
                toast2.show()
            } while (cursor.moveToNext())
        }
        else{}

        cursor.close()

        /*val listAdapter= ArrayAdapter<String>(this, R.layout.list_layout, databaseData)
        listusers.adapter = listAdapter*/
    }
}
