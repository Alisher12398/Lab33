package com.android.lab3


import android.content.Context
import android.os.Bundle
import android.app.Activity
import android.content.Intent
import android.media.Image
import android.support.design.widget.TabItem
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_blank.*
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.GridLayoutManager
import android.util.Log
import android.widget.Toast
import android.widget.AdapterView.OnItemClickListener

import android.support.v7.widget.RecyclerView.OnItemTouchListener
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class BlankFragment : Fragment() {

    val actors = ArrayList<NewsModel>()


    /*override fun onItemClick(position: Int) {
       // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        actors.add(NewsModel("AA ", "28/09/2018"))
        val toast = Toast.makeText(activity,
                "Проверка2", Toast.LENGTH_SHORT)
        toast.show()

        var adapter2 = NewsAdapter(actors)
        val recycler2 = view!!.findViewById(R.id.recycler) as RecyclerView
        recycler2.adapter = adapter2

    }*/

    //private var actors = ArrayList<NewsModel>()

    //private val mOnClickListener: NewsAdapter.ListItemClickListener? = null


    /*
    val news_1_title: String = getString(R.string.news_1_title)
    val news_1_date: String = getString(R.string.news_1_date)
    val news_1_text: String = getString(R.string.news_1_text)

    val news_2_title: String = getString(R.string.news_2_title)
    val news_2_date: String = getString(R.string.news_2_date)
    val news_2_text: String = getString(R.string.news_2_text)

    val news_3_title: String = getString(R.string.news_3_title)
    val news_3_date: String = getString(R.string.news_3_date)
    val news_3_text: String = getString(R.string.news_3_text)

    val news_4_title: String = getString(R.string.news_4_title)
    val news_4_date: String = getString(R.string.news_4_date)
    val news_4_text: String = getString(R.string.news_4_text)
    */

    val news_1_title: String = "Amazon’s gadget battle with Google"
    val news_1_date: String = "12.04.18"
    val news_1_text: String = "     TP-Link has been enjoying a very good run on Amazon.com. Two of the companys Alexa-enabled smart plugs have dominated Amazons electric " +
            "plugs best-seller list for most of this year, helping the Chinese manufacturer sell thousands of plugs. \n\n" +
            "     Unfortunately for TP-Link, its about to get fresh competition from Amazon itself. The e-commerce giant last month held a product launch event in Seattle, " +
            "where it unveiled a long list of new devices including the Alexa-enabled Amazon Smart Plug. The plug goes on sale for \$25 next week, a few bucks more than TP-Links plugs."

    val news_2_title: String = "Gareth Southgate says Joe Hart could still earn England recall"
    val news_2_date: String = "04.10.18"
    val news_2_text: String = "     There was no space for Burnley keeper Hart in Southgate 25-man squad for the upcoming matches against Croatia and Spain in the UEFA Nations League.\n\n" +
            "     Instead, Southgate selected uncapped duo Marcus Bettinelli and Alex McCarthy along with Jack Butland and Jordan Pickford as his goalkeeping options.\n\n" +
            "     A series of impressive displays for the Clarets has seen Hart keep his place in goal ahead of fellow club team-mates Tom Heaton and Nick Pope."

    val news_3_title: String = "Here come Wi-Fi 4, 5, 6 in plan to simplify 802.11"
    val news_3_date: String = "05.10.18"
    val news_3_text: String = "     The idea is to be clearer about whats better and what your phone or home router can handle without sounding as much like an electronic engineer.\n\n" +
            "     Not that theres anything wrong with electronic engineers, but even techies can have a hard time remembering that IEEE 802.11 means wireless networks,\n\n" +
            "     IEEE 1394 governs FireWire data connections, and IEEE 802.3 is about Ethernet network connections.\n\n" +
            "     The underlying Wi-Fi specifications will keep their IEEE technical names, of course."

    val news_4_title: String = "Uber joins Lyft in offering rides to voters for the midterm elections"
    val news_4_date: String = "15.08.18"
    val news_4_text: String = "     The ride-hailing company announced Thursday that its offering free rides to the polls for those people who say transportation barriers are why they vote.\n\n" +
            "     It also created a polling place button to help voters more easily find where they need to go to cast their ballot on Tuesday, Nov. 6.\n\n" +
            "     With the 2018 elections around the corner, many organizations and companies across the country are going the extra mile to support our democratic process,\n\n" +
            "     Uber CEO Dara Khosrowshahi wrote in a blog post."
    /*val image2 = findViewById<ImageView>(R.id.image_activity2)
    image2.setImageResource(R.drawable.testimage2)*/


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_blank, container, false)


        /*val image2 = root.findViewById<ImageView>(R.id.media_image)
        image2.setImageResource(R.drawable.testimage2)*/

        actors.add(NewsModel(news_1_title, news_1_date, news_1_text, R.drawable.news1))
        actors.add(NewsModel(news_2_title, news_2_date, news_2_text, R.drawable.footbal))
        actors.add(NewsModel(news_3_title, news_3_date, news_3_text, R.drawable.wifi))
        actors.add(NewsModel(news_4_title, news_4_date, news_4_text, R.drawable.uber))

        var adapter2 = NewsAdapter(actors)

        val recycler = root.findViewById(R.id.recycler) as RecyclerView

        recycler.adapter = adapter2

        recycler.layoutManager = LinearLayoutManager(activity)


        recycler.addOnItemTouchListener(RecyclerTouchListener(getActivity()!!.getApplicationContext(), recycler, object : RecyclerTouchListener.ClickListener {
            override fun onClick(view: View, position: Int) {
//                Toast.makeText(context,"is selected!", Toast.LENGTH_SHORT).show()
                val intent = Intent(context, Activity2::class.java)
                intent.putExtra("ExampleItem", actors[position])

                startActivity(intent)
            }

        }))

        /*adapter2.run {
            setOnItemClickListener(object : NewsAdapter.OnItemClickListener {
                @Override
                override fun onItemClick(position: Int) {

                    val toast = Toast.makeText(activity,
                            "Проверка2", Toast.LENGTH_SHORT)
                    toast.show()

                    val toast2 = Toast.makeText(context,
                            "Проверка", Toast.LENGTH_SHORT)
                    toast2.show()


                    val intent = Intent(context, Activity2::class.java)
                    intent.putExtra("Example Item", actors.get(position))

                    startActivity(intent)
                }
            })

        }*/


        /*recycler.setOnClickListener(View.OnClickListener {

            val toast = Toast.makeText(activity,
                    "Проверка", Toast.LENGTH_SHORT)
            toast.show()

            val intent = Intent(activity, Activity2::class.java)

            *//*val args =Bundle()
            args.putSerializable("Arraylist", actors)
            intent.putExtra("Bundle", args)*//*
            intent.putParcelableArrayListExtra("aa", actors)
            startActivity(intent)
        })*/

        //recycler.layoutManager = GridLayoutManager(activity, 2)

        return root
    }

}
