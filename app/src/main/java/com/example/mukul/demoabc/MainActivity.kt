package com.example.mukul.demoabc

import android.content.DialogInterface
import android.os.Build
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.io.IOException


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = GridLayoutManager(this@MainActivity,2,GridLayoutManager.VERTICAL,false)
        recyclerView.adapter = Adaptor(generateData(),this@MainActivity)
        if(!isConnected()){
            val builder: AlertDialog.Builder
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                builder = AlertDialog.Builder(this@MainActivity, android.R.style.Theme_Material_Dialog_Alert)
            } else {
                builder = AlertDialog.Builder(this@MainActivity)
            }
            builder.setTitle("No Internet Detected")
                    .setMessage("Internet is required to fetch images otherwise all functionality will work except images will not be shown ")
                    .setPositiveButton(android.R.string.ok, DialogInterface.OnClickListener { dialog, which ->
                        dialog.dismiss()
                    })
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .show()

        }

    }

    fun generateData():ArrayList<Data>{
        var data:ArrayList<Data> = ArrayList()
        data.add(Data("A,a",R.raw.a,"https://images.pexels.com/photos/209449/pexels-photo-209449.jpeg?w=1260&h=750&auto=compress&cs=tinysrgb","Apple"))
        data.add(Data("B,b",R.raw.b,"https://images.pexels.com/photos/163304/softball-batter-girl-batting-163304.jpeg?w=1260&h=750&auto=compress&cs=tinysrgb","Baseball"))
        data.add(Data("C,c",R.raw.c,"https://images.pexels.com/photos/280254/pexels-photo-280254.jpeg?w=1260&h=750&auto=compress&cs=tinysrgb","Clock"))
        data.add(Data("D,d",R.raw.d,"https://images.pexels.com/photos/598752/pexels-photo-598752.jpeg?w=1260&h=750&auto=compress&cs=tinysrgb","Donkey"))
        data.add(Data("E,e",R.raw.e,"https://images.pexels.com/photos/70080/elephant-africa-african-elephant-kenya-70080.jpeg?w=1260&h=750&auto=compress&cs=tinysrgb","Elephant"))
        data.add(Data("F,f",R.raw.f,"https://images.pexels.com/photos/105952/pexels-photo-105952.jpeg?w=1260&h=750&auto=compress&cs=tinysrgb","Father"))
        data.add(Data("G,g",R.raw.g,"https://images.pexels.com/photos/12971/pexels-photo-12971.jpeg?w=1260&h=750&auto=compress&cs=tinysrgb","Grand Mother"))
        data.add(Data("H,h",R.raw.h,"https://images.pexels.com/photos/723031/pexels-photo-723031.jpeg?w=1260&h=750&auto=compress&cs=tinysrgb","Hungry"))
        data.add(Data("I,i",R.raw.i,"https://images.pexels.com/photos/147413/twitter-facebook-together-exchange-of-information-147413.jpeg?w=1260&h=750&auto=compress&cs=tinysrgb","Internet"))
        data.add(Data("J,j",R.raw.j,"https://images.pexels.com/photos/159832/justice-law-case-hearing-159832.jpeg?w=1260&h=750&auto=compress&cs=tinysrgb","Justice"))
        data.add(Data("K,k",R.raw.k,"https://images.pexels.com/photos/213793/pexels-photo-213793.jpeg?w=1260&h=750&auto=compress&cs=tinysrgb","Kangaroo"))
        data.add(Data("L,l",R.raw.l,"https://images.pexels.com/photos/50632/pexels-photo-50632.jpeg?w=1260&h=750&auto=compress&cs=tinysrgb","London"))
        data.add(Data("M,m",R.raw.m,"https://images.pexels.com/photos/321552/pexels-photo-321552.jpeg?w=1260&h=750&auto=compress&cs=tinysrgb","Monkey"))
        data.add(Data("N,n",R.raw.n,"https://images.pexels.com/photos/577696/pexels-photo-577696.jpeg?w=1260&h=750&auto=compress&cs=tinysrgb","Norway"))
        data.add(Data("O,o",R.raw.o,"https://images.pexels.com/photos/214200/pexels-photo-214200.jpeg?w=1260&h=750&auto=compress&cs=tinysrgb","Overtime"))
        data.add(Data("P,p",R.raw.p,"https://images.pexels.com/photos/776120/pexels-photo-776120.jpeg?w=1260&h=750&auto=compress&cs=tinysrgb","Pilow"))
        data.add(Data("Q,q",R.raw.q,"https://images.pexels.com/photos/356079/pexels-photo-356079.jpeg?w=1260&h=750&auto=compress&cs=tinysrgb","Question"))
        data.add(Data("R,r",R.raw.r,"https://images.pexels.com/photos/247373/pexels-photo-247373.jpeg?w=1260&h=750&auto=compress&cs=tinysrgb","Rabbit"))
        data.add(Data("S,s",R.raw.s,"https://jaredandkyal.files.wordpress.com/2016/06/superman-3d-art.jpg","Superman"))
        data.add(Data("T,t",R.raw.t,"https://images.pexels.com/photos/163007/phone-old-year-built-1955-bakelite-163007.jpeg?w=1260&h=750&auto=compress&cs=tinysrgb","Telephone"))
        data.add(Data("U,u",R.raw.u,"http://clipart-library.com/data_images/517449.jpg","Underwear"))
        data.add(Data("V,v",R.raw.v,"https://www.wikihow.com/images/thumb/5/5e/Vaccinate-Chickens-Step-15-Version-2.jpg/aid4586383-v4-728px-Vaccinate-Chickens-Step-15-Version-2.jpg","Vaccinate"))
        data.add(Data("W,w",R.raw.w,"https://brandcdn.exacttarget.com/blog/uploads/2014/06/web_browser_w1024.jpeg","World Wide web"))
        data.add(Data("X,x",R.raw.x,"https://images-na.ssl-images-amazon.com/images/I/71TSo37bmFL._SL1500_.jpg","Xylophone"))
        data.add(Data("Y,y",R.raw.y,"https://pbs.twimg.com/media/B1wvy10CIAEmpZI.png","Yogart"))
        data.add(Data("Z,z",R.raw.z,"http://animals.sandiegozoo.org/sites/default/files/2016-08/hero_zebra_animals.jpg","Zebra"))
        return data
    }

    @Throws(InterruptedException::class, IOException::class)
    fun isConnected(): Boolean {
        val command = "ping -c 1 google.com"
        return Runtime.getRuntime().exec(command).waitFor() == 0
    }


}
