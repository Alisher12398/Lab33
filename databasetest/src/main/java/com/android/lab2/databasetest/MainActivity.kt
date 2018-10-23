package com.android.lab2.databasetest

import android.content.ContentValues
import android.content.Intent
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.ArrayAdapter



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name_edittext = findViewById<EditText>(R.id.name_edittext)
        val password_edittext = findViewById<EditText>(R.id.password_edittext)
        val button_adduser = findViewById<Button>(R.id.button_adduser)
        val button_showusers = findViewById<Button>(R.id.button_showusers)
        val button_deleteusers = findViewById<Button>(R.id.button_deleteusers)
        val button_deleteuser = findViewById<Button>(R.id.button_deleteuser)
        val button_updateuser = findViewById<Button>(R.id.button_updateuser)
        val listusers = findViewById<ListView>(R.id.listusers)
        val db = Database(this)

        val sqlitedatabase = db.writableDatabase

        button_adduser.setOnClickListener(){
            val cv = ContentValues()
            cv.put("name", name_edittext.text.toString())
            cv.put("password", password_edittext.text.toString())
            sqlitedatabase.insert("Contact", null, cv)

            val toast = Toast.makeText(this,
                    "User added", Toast.LENGTH_LONG)
            toast.show()
        }


        button_showusers.setOnClickListener(){


            /*val cursor = sqlitedatabase.query("Contact", null, null, null, null ,null, null)

            cursor.moveToNext()
            val phone = cursor.getInt(cursor.getColumnIndex("password"))
            val id2 = cursor.getInt(cursor.getColumnIndex("id"))

            val text = "\n\n\nid: " +  id2.toString() + "II Phone:  " + phone.toString() + "\n\n\n"
            val toast2 = Toast.makeText(this,
                    text , Toast.LENGTH_LONG)
            toast2.show()*/


            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)


        }


        button_deleteusers.setOnClickListener(){
            sqlitedatabase.delete("Contact", null, null)
        }


        button_deleteuser.setOnClickListener(){

        }

        button_updateuser.setOnClickListener(){

        }


    }
}
