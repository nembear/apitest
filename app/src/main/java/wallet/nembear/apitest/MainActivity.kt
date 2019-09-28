package wallet.nembear.apitest

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.text.InputType.TYPE_CLASS_NUMBER
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.bumptech.glide.Glide
import com.ryuta46.nemkotlin.client.RxNemApiClient
import com.ryuta46.nemkotlin.util.ConvertUtils
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.concurrent.schedule


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        leanBackMode()

        val rxClient = RxNemApiClient("http://62.75.251.134:7890")
        var getTx = 0

//        Slideを1にする設定
//        val latestNowTx = 100
//        var nowTx = 100

//        Slideを更新する設定
        var nowTx = getLatestNowTxId()
        val latestNowTx = getLatestNowTxId()

        if (nowTx == 0){
            nowTx = 1
        }else{
            nowTx = latestNowTx
        }


//        ボタン押下後の動作
        button.setOnClickListener {
            val myedit = EditText(this)
            myedit.setInputType(TYPE_CLASS_NUMBER)
            val dialog = AlertDialog.Builder(this)

            dialog.setTitle("Tip数を入力してください")
            dialog.setView(myedit)
            dialog.setPositiveButton("OK", { _, _ ->
                //                 OKボタン押したときの処理
                    val userText = myedit.getText().toString()
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse
                        ("https://raccoonwallet.com/payment?addr=${ADDRESS}&amount=${userText.toInt()*1000000}&msg= "))
                    startActivity(intent)
                })
                dialog.setNegativeButton("キャンセル", null)
                dialog.show()
        }


        mybtn.setOnClickListener {
            val myedit1 = EditText(this)
            val dialog1 = AlertDialog.Builder(this)

            dialog1.setTitle("Messageを入力してください")
            dialog1.setView(myedit1)
            dialog1.setPositiveButton("OK", { _, _ ->
//                 OKボタン押したときの処理
                val myedit2 = EditText(this)
                myedit2.setInputType(TYPE_CLASS_NUMBER)
                val dialog2 = AlertDialog.Builder(this)
                dialog2.setTitle("Tip数を入力してください")
                dialog2.setView(myedit2)
                dialog2.setPositiveButton("OK", { _, _ ->

                    val userText1 = myedit1.getText().toString()
                    val userText2 = myedit2.getText().toString()
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse
                    ("https://raccoonwallet.com/payment?addr=${ADDRESS}&amount=${userText2.toInt()*1000000}&msg=${userText1}"))
                startActivity(intent)
                })
                dialog2.setNegativeButton("キャンセル", null)
                dialog2.show()
                })
            dialog1.setNegativeButton("キャンセル", null)
            dialog1.show()
            }


//        Tx読込開始
        Timer().schedule(1000, 20000) {
            rxClient.accountTransfersIncoming(ADDRESS)
                .subscribeOn(
                    Schedulers.io()
                ).observeOn(AndroidSchedulers.mainThread())
                .subscribe({ transactionList ->


                    progressBar.visibility = android.widget.ProgressBar.INVISIBLE


//          id情報取得
                    val id = transactionList.get(0).meta.id
                    val id2 = transactionList.get(1).meta.id
                    val id3 = transactionList.get(2).meta.id
                    val id4 = transactionList.get(3).meta.id
                    val id5 = transactionList.get(4).meta.id
                    val id6 = transactionList.get(5).meta.id
                    val id7 = transactionList.get(6).meta.id
                    val id8 = transactionList.get(7).meta.id
                    val id9 = transactionList.get(8).meta.id
                    val id10 = transactionList.get(9).meta.id
                    val id11 = transactionList.get(10).meta.id
                    val id12 = transactionList.get(11).meta.id
                    val id13 = transactionList.get(12).meta.id
                    val id14 = transactionList.get(13).meta.id
                    val id15 = transactionList.get(14).meta.id
                    val id16 = transactionList.get(15).meta.id
                    val id17 = transactionList.get(16).meta.id
                    val id18 = transactionList.get(17).meta.id
                    val id19 = transactionList.get(18).meta.id
                    val id20 = transactionList.get(19).meta.id
                    val id21 = transactionList.get(20).meta.id
                    val id22 = transactionList.get(21).meta.id
                    val id23 = transactionList.get(22).meta.id
                    val id24 = transactionList.get(23).meta.id
                    val id25 = transactionList.get(24).meta.id


//          message情報取得
                    val message1 = transactionList.get(0).transaction.message?.payload
                    val message2 = transactionList.get(1).transaction.message?.payload
                    val message3 = transactionList.get(2).transaction.message?.payload
                    val message4 = transactionList.get(3).transaction.message?.payload
                    val message5 = transactionList.get(4).transaction.message?.payload
                    val message6 = transactionList.get(5).transaction.message?.payload
                    val message7 = transactionList.get(6).transaction.message?.payload
                    val message8 = transactionList.get(7).transaction.message?.payload
                    val message9 = transactionList.get(8).transaction.message?.payload
                    val message10 = transactionList.get(9).transaction.message?.payload
                    val message11 = transactionList.get(10).transaction.message?.payload
                    val message12 = transactionList.get(11).transaction.message?.payload
                    val message13 = transactionList.get(12).transaction.message?.payload
                    val message14 = transactionList.get(13).transaction.message?.payload
                    val message15 = transactionList.get(14).transaction.message?.payload
                    val message16 = transactionList.get(15).transaction.message?.payload
                    val message17 = transactionList.get(16).transaction.message?.payload
                    val message18 = transactionList.get(17).transaction.message?.payload
                    val message19 = transactionList.get(18).transaction.message?.payload
                    val message20 = transactionList.get(19).transaction.message?.payload
                    val message21 = transactionList.get(20).transaction.message?.payload
                    val message22 = transactionList.get(21).transaction.message?.payload
                    val message23 = transactionList.get(22).transaction.message?.payload
                    val message24 = transactionList.get(23).transaction.message?.payload
                    val message25 = transactionList.get(24).transaction.message?.payload


//          messsage10進法情報取得
                    val getMessage1 = String(ConvertUtils.toByteArray(message1.toString()), Charsets.UTF_8)
                    val getMessage2 = String(ConvertUtils.toByteArray(message2.toString()), Charsets.UTF_8)
                    val getMessage3 = String(ConvertUtils.toByteArray(message3.toString()), Charsets.UTF_8)
                    val getMessage4 = String(ConvertUtils.toByteArray(message4.toString()), Charsets.UTF_8)
                    val getMessage5 = String(ConvertUtils.toByteArray(message5.toString()), Charsets.UTF_8)
                    val getMessage6 = String(ConvertUtils.toByteArray(message6.toString()), Charsets.UTF_8)
                    val getMessage7 = String(ConvertUtils.toByteArray(message7.toString()), Charsets.UTF_8)
                    val getMessage8 = String(ConvertUtils.toByteArray(message8.toString()), Charsets.UTF_8)
                    val getMessage9 = String(ConvertUtils.toByteArray(message9.toString()), Charsets.UTF_8)
                    val getMessage10 = String(ConvertUtils.toByteArray(message10.toString()), Charsets.UTF_8)
                    val getMessage11 = String(ConvertUtils.toByteArray(message11.toString()), Charsets.UTF_8)
                    val getMessage12 = String(ConvertUtils.toByteArray(message12.toString()), Charsets.UTF_8)
                    val getMessage13 = String(ConvertUtils.toByteArray(message13.toString()), Charsets.UTF_8)
                    val getMessage14 = String(ConvertUtils.toByteArray(message14.toString()), Charsets.UTF_8)
                    val getMessage15 = String(ConvertUtils.toByteArray(message15.toString()), Charsets.UTF_8)
                    val getMessage16 = String(ConvertUtils.toByteArray(message16.toString()), Charsets.UTF_8)
                    val getMessage17 = String(ConvertUtils.toByteArray(message17.toString()), Charsets.UTF_8)
                    val getMessage18 = String(ConvertUtils.toByteArray(message18.toString()), Charsets.UTF_8)
                    val getMessage19 = String(ConvertUtils.toByteArray(message19.toString()), Charsets.UTF_8)
                    val getMessage20 = String(ConvertUtils.toByteArray(message20.toString()), Charsets.UTF_8)
                    val getMessage21 = String(ConvertUtils.toByteArray(message21.toString()), Charsets.UTF_8)
                    val getMessage22 = String(ConvertUtils.toByteArray(message22.toString()), Charsets.UTF_8)
                    val getMessage23 = String(ConvertUtils.toByteArray(message23.toString()), Charsets.UTF_8)
                    val getMessage24 = String(ConvertUtils.toByteArray(message24.toString()), Charsets.UTF_8)
                    val getMessage25 = String(ConvertUtils.toByteArray(message25.toString()), Charsets.UTF_8)



                    val latestId = getLatestTransactionId()
                    val fileName: String = "slide" + (nowTx)
                    val picId: Int = resources.getIdentifier(fileName, "drawable", packageName)
                    val fileName2: String = if (6 > getTx){"get" + (getTx)} else{"get" + (6)}
                    val gifMovie: Int = resources.getIdentifier(fileName2, "raw", packageName)
                    val fileName3: String = "get" + (7)
                    val gifMovie2: Int = resources.getIdentifier(fileName3, "raw", packageName)



                    if (nowTx >= 1000) {
                        Log.d("TAG", "3以上だよ")
                        imageView.post(Runnable {
                            imageView.setImageResource(R.drawable.slide1000)
                        })
                    }

                    else {
                        Log.d("TAG", "2以下だよ")
                        imageView.post(Runnable {
                            imageView.setImageResource(picId)
                        })
                    }

                    if (getTx > 0) {
                        if (nowTx >= 1000){
                            imageView.post(Runnable {
                                Glide.with(this@MainActivity).load(gifMovie2).into(imageView)
                            })
                        }

                        else {
                            imageView.post(Runnable {
                                Glide.with(this@MainActivity).load(gifMovie).into(imageView)
                            })
                        }
                    }

                    else {

                        if (nowTx >= 1000) {
                            Log.d("TAG", "3以上だよ")
                            imageView.post(Runnable {
                                imageView.setImageResource(R.drawable.slide1000)
                            })
                        }

                        else {
                            Log.d("TAG", "2以下だよ")
                            imageView.post(Runnable {
                                imageView.setImageResource(picId)
                            })
                        }
                    }

                    if (latestId >= id) {
                        Log.d("TAG", "TxZero")
                        getTx = 0
                        saveTransactionId(id)
                        saveNowTx(nowTx)
                        return@subscribe
                    }

                    if (latestId >= id2){
                        Log.d("TAG", "1TxGet!!")
                        getTx = 1
                        nowTx += getTx
                        saveTransactionId(id)
                        saveNowTx(nowTx)

                        if(getMessage1 != "��") {
                            Toast.makeText(this@MainActivity,getMessage1, Toast.LENGTH_LONG).show()
                        }

                        return@subscribe
                    }

                    if (latestId >= id3) {
                        Log.d("TAG", "2TxGet!!")
                        getTx = 2
                        nowTx += getTx
                        saveTransactionId(id)
                        saveNowTx(nowTx)

                        if(getMessage2 != "��") {Toast.makeText(this@MainActivity,getMessage2, Toast.LENGTH_LONG).show()}
                        if(getMessage1 != "��") {Toast.makeText(this@MainActivity,getMessage1, Toast.LENGTH_LONG).show()}

                        return@subscribe
                    }

                    if (latestId >= id4) {
                        Log.d("TAG", "3TxGet!!")
                        getTx = 3
                        nowTx += getTx
                        saveTransactionId(id)
                        saveNowTx(nowTx)

                        if(getMessage3 != "��") {Toast.makeText(this@MainActivity,getMessage3, Toast.LENGTH_LONG).show()}
                        if(getMessage2 != "��") {Toast.makeText(this@MainActivity,getMessage2, Toast.LENGTH_LONG).show()}
                        if(getMessage1 != "��") {Toast.makeText(this@MainActivity,getMessage1, Toast.LENGTH_LONG).show()}

                        return@subscribe
                    }

                    if (latestId >= id5) {
                        Log.d("TAG", "4TxGet!!")
                        getTx = 4
                        nowTx += getTx
                        saveTransactionId(id)
                        saveNowTx(nowTx)

                        if(getMessage4 != "��") {Toast.makeText(this@MainActivity,getMessage4, Toast.LENGTH_LONG).show()}
                        if(getMessage3 != "��") {Toast.makeText(this@MainActivity,getMessage3, Toast.LENGTH_LONG).show()}
                        if(getMessage2 != "��") {Toast.makeText(this@MainActivity,getMessage2, Toast.LENGTH_LONG).show()}
                        if(getMessage1 != "��") {Toast.makeText(this@MainActivity,getMessage1, Toast.LENGTH_LONG).show()}

                        return@subscribe
                    }

                    if (latestId >= id6) {
                        Log.d("TAG", "5TxGet!!")
                        getTx = 5
                        nowTx += getTx
                        saveTransactionId(id)
                        saveNowTx(nowTx)

                        if(getMessage5 != "��") {Toast.makeText(this@MainActivity,getMessage5, Toast.LENGTH_LONG).show()}
                        if(getMessage4 != "��") {Toast.makeText(this@MainActivity,getMessage4, Toast.LENGTH_LONG).show()}
                        if(getMessage3 != "��") {Toast.makeText(this@MainActivity,getMessage3, Toast.LENGTH_LONG).show()}
                        if(getMessage2 != "��") {Toast.makeText(this@MainActivity,getMessage2, Toast.LENGTH_LONG).show()}
                        if(getMessage1 != "��") {Toast.makeText(this@MainActivity,getMessage1, Toast.LENGTH_LONG).show()}

                        return@subscribe
                    }

                    if (latestId >= id7) {
                        Log.d("TAG", "6TxGet!!")
                        getTx = 6
                        nowTx += getTx
                        saveTransactionId(id)
                        saveNowTx(nowTx)

                        if(getMessage6 != "��") {Toast.makeText(this@MainActivity,getMessage6, Toast.LENGTH_LONG).show()}
                        if(getMessage5 != "��") {Toast.makeText(this@MainActivity,getMessage5, Toast.LENGTH_LONG).show()}
                        if(getMessage4 != "��") {Toast.makeText(this@MainActivity,getMessage4, Toast.LENGTH_LONG).show()}
                        if(getMessage3 != "��") {Toast.makeText(this@MainActivity,getMessage3, Toast.LENGTH_LONG).show()}
                        if(getMessage2 != "��") {Toast.makeText(this@MainActivity,getMessage2, Toast.LENGTH_LONG).show()}
                        if(getMessage1 != "��") {Toast.makeText(this@MainActivity,getMessage1, Toast.LENGTH_LONG).show()}

                        return@subscribe
                    }

                    if (latestId >= id8) {
                        Log.d("TAG", "7TxGet!!")
                        getTx = 7
                        nowTx += getTx
                        saveTransactionId(id)
                        saveNowTx(nowTx)

                        if(getMessage7 != "��") {Toast.makeText(this@MainActivity,getMessage7, Toast.LENGTH_LONG).show()}
                        if(getMessage6 != "��") {Toast.makeText(this@MainActivity,getMessage6, Toast.LENGTH_LONG).show()}
                        if(getMessage5 != "��") {Toast.makeText(this@MainActivity,getMessage5, Toast.LENGTH_LONG).show()}
                        if(getMessage4 != "��") {Toast.makeText(this@MainActivity,getMessage4, Toast.LENGTH_LONG).show()}
                        if(getMessage3 != "��") {Toast.makeText(this@MainActivity,getMessage3, Toast.LENGTH_LONG).show()}
                        if(getMessage2 != "��") {Toast.makeText(this@MainActivity,getMessage2, Toast.LENGTH_LONG).show()}
                        if(getMessage1 != "��") {Toast.makeText(this@MainActivity,getMessage1, Toast.LENGTH_LONG).show()}

                        return@subscribe
                    }

                    if (latestId >= id9) {
                        Log.d("TAG", "8TxGet!!")
                        getTx = 8
                        nowTx += getTx
                        saveTransactionId(id)
                        saveNowTx(nowTx)

                        if(getMessage8 != "��") {Toast.makeText(this@MainActivity,getMessage8, Toast.LENGTH_LONG).show()}
                        if(getMessage7 != "��") {Toast.makeText(this@MainActivity,getMessage7, Toast.LENGTH_LONG).show()}
                        if(getMessage6 != "��") {Toast.makeText(this@MainActivity,getMessage6, Toast.LENGTH_LONG).show()}
                        if(getMessage5 != "��") {Toast.makeText(this@MainActivity,getMessage5, Toast.LENGTH_LONG).show()}
                        if(getMessage4 != "��") {Toast.makeText(this@MainActivity,getMessage4, Toast.LENGTH_LONG).show()}
                        if(getMessage3 != "��") {Toast.makeText(this@MainActivity,getMessage3, Toast.LENGTH_LONG).show()}
                        if(getMessage2 != "��") {Toast.makeText(this@MainActivity,getMessage2, Toast.LENGTH_LONG).show()}
                        if(getMessage1 != "��") {Toast.makeText(this@MainActivity,getMessage1, Toast.LENGTH_LONG).show()}

                        return@subscribe
                    }

                    if (latestId >= id10) {
                        Log.d("TAG", "9TxGet!!")
                        getTx = 9
                        nowTx += getTx
                        saveTransactionId(id)
                        saveNowTx(nowTx)

                        if(getMessage9 != "��") {Toast.makeText(this@MainActivity,getMessage9, Toast.LENGTH_LONG).show()}
                        if(getMessage8 != "��") {Toast.makeText(this@MainActivity,getMessage8, Toast.LENGTH_LONG).show()}
                        if(getMessage7 != "��") {Toast.makeText(this@MainActivity,getMessage7, Toast.LENGTH_LONG).show()}
                        if(getMessage6 != "��") {Toast.makeText(this@MainActivity,getMessage6, Toast.LENGTH_LONG).show()}
                        if(getMessage5 != "��") {Toast.makeText(this@MainActivity,getMessage5, Toast.LENGTH_LONG).show()}
                        if(getMessage4 != "��") {Toast.makeText(this@MainActivity,getMessage4, Toast.LENGTH_LONG).show()}
                        if(getMessage3 != "��") {Toast.makeText(this@MainActivity,getMessage3, Toast.LENGTH_LONG).show()}
                        if(getMessage2 != "��") {Toast.makeText(this@MainActivity,getMessage2, Toast.LENGTH_LONG).show()}
                        if(getMessage1 != "��") {Toast.makeText(this@MainActivity,getMessage1, Toast.LENGTH_LONG).show()}

                        return@subscribe
                    }

                    if (latestId >= id11) {
                        Log.d("TAG", "10TxGet!!")
                        getTx = 10
                        nowTx += getTx
                        saveTransactionId(id)
                        saveNowTx(nowTx)

                        if(getMessage10 != "��") {Toast.makeText(this@MainActivity,getMessage10, Toast.LENGTH_LONG).show()}
                        if(getMessage9 != "��") {Toast.makeText(this@MainActivity,getMessage9, Toast.LENGTH_LONG).show()}
                        if(getMessage8 != "��") {Toast.makeText(this@MainActivity,getMessage8, Toast.LENGTH_LONG).show()}
                        if(getMessage7 != "��") {Toast.makeText(this@MainActivity,getMessage7, Toast.LENGTH_LONG).show()}
                        if(getMessage6 != "��") {Toast.makeText(this@MainActivity,getMessage6, Toast.LENGTH_LONG).show()}
                        if(getMessage5 != "��") {Toast.makeText(this@MainActivity,getMessage5, Toast.LENGTH_LONG).show()}
                        if(getMessage4 != "��") {Toast.makeText(this@MainActivity,getMessage4, Toast.LENGTH_LONG).show()}
                        if(getMessage3 != "��") {Toast.makeText(this@MainActivity,getMessage3, Toast.LENGTH_LONG).show()}
                        if(getMessage2 != "��") {Toast.makeText(this@MainActivity,getMessage2, Toast.LENGTH_LONG).show()}
                        if(getMessage1 != "��") {Toast.makeText(this@MainActivity,getMessage1, Toast.LENGTH_LONG).show()}

                        return@subscribe
                    }

                    if (latestId >= id12) {
                        Log.d("TAG", "11TxGet!!")
                        getTx = 11
                        nowTx += getTx
                        saveTransactionId(id)
                        saveNowTx(nowTx)

                        if(getMessage11 != "��") {Toast.makeText(this@MainActivity,getMessage11, Toast.LENGTH_LONG).show()}
                        if(getMessage10 != "��") {Toast.makeText(this@MainActivity,getMessage10, Toast.LENGTH_LONG).show()}
                        if(getMessage9 != "��") {Toast.makeText(this@MainActivity,getMessage9, Toast.LENGTH_LONG).show()}
                        if(getMessage8 != "��") {Toast.makeText(this@MainActivity,getMessage8, Toast.LENGTH_LONG).show()}
                        if(getMessage7 != "��") {Toast.makeText(this@MainActivity,getMessage7, Toast.LENGTH_LONG).show()}
                        if(getMessage6 != "��") {Toast.makeText(this@MainActivity,getMessage6, Toast.LENGTH_LONG).show()}
                        if(getMessage5 != "��") {Toast.makeText(this@MainActivity,getMessage5, Toast.LENGTH_LONG).show()}
                        if(getMessage4 != "��") {Toast.makeText(this@MainActivity,getMessage4, Toast.LENGTH_LONG).show()}
                        if(getMessage3 != "��") {Toast.makeText(this@MainActivity,getMessage3, Toast.LENGTH_LONG).show()}
                        if(getMessage2 != "��") {Toast.makeText(this@MainActivity,getMessage2, Toast.LENGTH_LONG).show()}
                        if(getMessage1 != "��") {Toast.makeText(this@MainActivity,getMessage1, Toast.LENGTH_LONG).show()}

                        return@subscribe
                    }

                    if (latestId >= id13) {
                        Log.d("TAG", "12TxGet!!")
                        getTx = 12
                        nowTx += getTx
                        saveTransactionId(id)
                        saveNowTx(nowTx)

                        if(getMessage12 != "��") {Toast.makeText(this@MainActivity,getMessage12, Toast.LENGTH_LONG).show()}
                        if(getMessage11 != "��") {Toast.makeText(this@MainActivity,getMessage11, Toast.LENGTH_LONG).show()}
                        if(getMessage10 != "��") {Toast.makeText(this@MainActivity,getMessage10, Toast.LENGTH_LONG).show()}
                        if(getMessage9 != "��") {Toast.makeText(this@MainActivity,getMessage9, Toast.LENGTH_LONG).show()}
                        if(getMessage8 != "��") {Toast.makeText(this@MainActivity,getMessage8, Toast.LENGTH_LONG).show()}
                        if(getMessage7 != "��") {Toast.makeText(this@MainActivity,getMessage7, Toast.LENGTH_LONG).show()}
                        if(getMessage6 != "��") {Toast.makeText(this@MainActivity,getMessage6, Toast.LENGTH_LONG).show()}
                        if(getMessage5 != "��") {Toast.makeText(this@MainActivity,getMessage5, Toast.LENGTH_LONG).show()}
                        if(getMessage4 != "��") {Toast.makeText(this@MainActivity,getMessage4, Toast.LENGTH_LONG).show()}
                        if(getMessage3 != "��") {Toast.makeText(this@MainActivity,getMessage3, Toast.LENGTH_LONG).show()}
                        if(getMessage2 != "��") {Toast.makeText(this@MainActivity,getMessage2, Toast.LENGTH_LONG).show()}
                        if(getMessage1 != "��") {Toast.makeText(this@MainActivity,getMessage1, Toast.LENGTH_LONG).show()}

                        return@subscribe
                    }

                    if (latestId >= id14) {
                        Log.d("TAG", "13TxGet!!")
                        getTx = 13
                        nowTx += getTx
                        saveTransactionId(id)
                        saveNowTx(nowTx)

                        if(getMessage13 != "��") {Toast.makeText(this@MainActivity,getMessage13, Toast.LENGTH_LONG).show()}
                        if(getMessage12 != "��") {Toast.makeText(this@MainActivity,getMessage12, Toast.LENGTH_LONG).show()}
                        if(getMessage11 != "��") {Toast.makeText(this@MainActivity,getMessage11, Toast.LENGTH_LONG).show()}
                        if(getMessage10 != "��") {Toast.makeText(this@MainActivity,getMessage10, Toast.LENGTH_LONG).show()}
                        if(getMessage9 != "��") {Toast.makeText(this@MainActivity,getMessage9, Toast.LENGTH_LONG).show()}
                        if(getMessage8 != "��") {Toast.makeText(this@MainActivity,getMessage8, Toast.LENGTH_LONG).show()}
                        if(getMessage7 != "��") {Toast.makeText(this@MainActivity,getMessage7, Toast.LENGTH_LONG).show()}
                        if(getMessage6 != "��") {Toast.makeText(this@MainActivity,getMessage6, Toast.LENGTH_LONG).show()}
                        if(getMessage5 != "��") {Toast.makeText(this@MainActivity,getMessage5, Toast.LENGTH_LONG).show()}
                        if(getMessage4 != "��") {Toast.makeText(this@MainActivity,getMessage4, Toast.LENGTH_LONG).show()}
                        if(getMessage3 != "��") {Toast.makeText(this@MainActivity,getMessage3, Toast.LENGTH_LONG).show()}
                        if(getMessage2 != "��") {Toast.makeText(this@MainActivity,getMessage2, Toast.LENGTH_LONG).show()}
                        if(getMessage1 != "��") {Toast.makeText(this@MainActivity,getMessage1, Toast.LENGTH_LONG).show()}

                        return@subscribe
                    }

                    if (latestId >= id15) {
                        Log.d("TAG", "14TxGet!!")
                        getTx = 14
                        nowTx += getTx
                        saveTransactionId(id)
                        saveNowTx(nowTx)

                        if(getMessage14 != "��") {Toast.makeText(this@MainActivity,getMessage14, Toast.LENGTH_LONG).show()}
                        if(getMessage13 != "��") {Toast.makeText(this@MainActivity,getMessage13, Toast.LENGTH_LONG).show()}
                        if(getMessage12 != "��") {Toast.makeText(this@MainActivity,getMessage12, Toast.LENGTH_LONG).show()}
                        if(getMessage11 != "��") {Toast.makeText(this@MainActivity,getMessage11, Toast.LENGTH_LONG).show()}
                        if(getMessage10 != "��") {Toast.makeText(this@MainActivity,getMessage10, Toast.LENGTH_LONG).show()}
                        if(getMessage9 != "��") {Toast.makeText(this@MainActivity,getMessage9, Toast.LENGTH_LONG).show()}
                        if(getMessage8 != "��") {Toast.makeText(this@MainActivity,getMessage8, Toast.LENGTH_LONG).show()}
                        if(getMessage7 != "��") {Toast.makeText(this@MainActivity,getMessage7, Toast.LENGTH_LONG).show()}
                        if(getMessage6 != "��") {Toast.makeText(this@MainActivity,getMessage6, Toast.LENGTH_LONG).show()}
                        if(getMessage5 != "��") {Toast.makeText(this@MainActivity,getMessage5, Toast.LENGTH_LONG).show()}
                        if(getMessage4 != "��") {Toast.makeText(this@MainActivity,getMessage4, Toast.LENGTH_LONG).show()}
                        if(getMessage3 != "��") {Toast.makeText(this@MainActivity,getMessage3, Toast.LENGTH_LONG).show()}
                        if(getMessage2 != "��") {Toast.makeText(this@MainActivity,getMessage2, Toast.LENGTH_LONG).show()}
                        if(getMessage1 != "��") {Toast.makeText(this@MainActivity,getMessage1, Toast.LENGTH_LONG).show()}

                        return@subscribe
                    }


                    if (latestId >= id16) {
                        Log.d("TAG", "15TxGet!!")
                        getTx = 15
                        nowTx += getTx
                        saveTransactionId(id)
                        saveNowTx(nowTx)

                        if(getMessage15 != "��") {Toast.makeText(this@MainActivity,getMessage15, Toast.LENGTH_LONG).show()}
                        if(getMessage14 != "��") {Toast.makeText(this@MainActivity,getMessage14, Toast.LENGTH_LONG).show()}
                        if(getMessage13 != "��") {Toast.makeText(this@MainActivity,getMessage13, Toast.LENGTH_LONG).show()}
                        if(getMessage12 != "��") {Toast.makeText(this@MainActivity,getMessage12, Toast.LENGTH_LONG).show()}
                        if(getMessage11 != "��") {Toast.makeText(this@MainActivity,getMessage11, Toast.LENGTH_LONG).show()}
                        if(getMessage10 != "��") {Toast.makeText(this@MainActivity,getMessage10, Toast.LENGTH_LONG).show()}
                        if(getMessage9 != "��") {Toast.makeText(this@MainActivity,getMessage9, Toast.LENGTH_LONG).show()}
                        if(getMessage8 != "��") {Toast.makeText(this@MainActivity,getMessage8, Toast.LENGTH_LONG).show()}
                        if(getMessage7 != "��") {Toast.makeText(this@MainActivity,getMessage7, Toast.LENGTH_LONG).show()}
                        if(getMessage6 != "��") {Toast.makeText(this@MainActivity,getMessage6, Toast.LENGTH_LONG).show()}
                        if(getMessage5 != "��") {Toast.makeText(this@MainActivity,getMessage5, Toast.LENGTH_LONG).show()}
                        if(getMessage4 != "��") {Toast.makeText(this@MainActivity,getMessage4, Toast.LENGTH_LONG).show()}
                        if(getMessage3 != "��") {Toast.makeText(this@MainActivity,getMessage3, Toast.LENGTH_LONG).show()}
                        if(getMessage2 != "��") {Toast.makeText(this@MainActivity,getMessage2, Toast.LENGTH_LONG).show()}
                        if(getMessage1 != "��") {Toast.makeText(this@MainActivity,getMessage1, Toast.LENGTH_LONG).show()}

                        return@subscribe
                    }


                    if (latestId >= id17) {
                        Log.d("TAG", "16TxGet!!")
                        getTx = 16
                        nowTx += getTx
                        saveTransactionId(id)
                        saveNowTx(nowTx)

                        if(getMessage16 != "��") {Toast.makeText(this@MainActivity,getMessage16, Toast.LENGTH_LONG).show()}
                        if(getMessage15 != "��") {Toast.makeText(this@MainActivity,getMessage15, Toast.LENGTH_LONG).show()}
                        if(getMessage14 != "��") {Toast.makeText(this@MainActivity,getMessage14, Toast.LENGTH_LONG).show()}
                        if(getMessage13 != "��") {Toast.makeText(this@MainActivity,getMessage13, Toast.LENGTH_LONG).show()}
                        if(getMessage12 != "��") {Toast.makeText(this@MainActivity,getMessage12, Toast.LENGTH_LONG).show()}
                        if(getMessage11 != "��") {Toast.makeText(this@MainActivity,getMessage11, Toast.LENGTH_LONG).show()}
                        if(getMessage10 != "��") {Toast.makeText(this@MainActivity,getMessage10, Toast.LENGTH_LONG).show()}
                        if(getMessage9 != "��") {Toast.makeText(this@MainActivity,getMessage9, Toast.LENGTH_LONG).show()}
                        if(getMessage8 != "��") {Toast.makeText(this@MainActivity,getMessage8, Toast.LENGTH_LONG).show()}
                        if(getMessage7 != "��") {Toast.makeText(this@MainActivity,getMessage7, Toast.LENGTH_LONG).show()}
                        if(getMessage6 != "��") {Toast.makeText(this@MainActivity,getMessage6, Toast.LENGTH_LONG).show()}
                        if(getMessage5 != "��") {Toast.makeText(this@MainActivity,getMessage5, Toast.LENGTH_LONG).show()}
                        if(getMessage4 != "��") {Toast.makeText(this@MainActivity,getMessage4, Toast.LENGTH_LONG).show()}
                        if(getMessage3 != "��") {Toast.makeText(this@MainActivity,getMessage3, Toast.LENGTH_LONG).show()}
                        if(getMessage2 != "��") {Toast.makeText(this@MainActivity,getMessage2, Toast.LENGTH_LONG).show()}
                        if(getMessage1 != "��") {Toast.makeText(this@MainActivity,getMessage1, Toast.LENGTH_LONG).show()}

                        return@subscribe
                    }


                    if (latestId >= id18) {
                        Log.d("TAG", "17TxGet!!")
                        getTx = 17
                        nowTx += getTx
                        saveTransactionId(id)
                        saveNowTx(nowTx)

                        if(getMessage17 != "��") {Toast.makeText(this@MainActivity,getMessage17, Toast.LENGTH_LONG).show()}
                        if(getMessage16 != "��") {Toast.makeText(this@MainActivity,getMessage16, Toast.LENGTH_LONG).show()}
                        if(getMessage15 != "��") {Toast.makeText(this@MainActivity,getMessage15, Toast.LENGTH_LONG).show()}
                        if(getMessage14 != "��") {Toast.makeText(this@MainActivity,getMessage14, Toast.LENGTH_LONG).show()}
                        if(getMessage13 != "��") {Toast.makeText(this@MainActivity,getMessage13, Toast.LENGTH_LONG).show()}
                        if(getMessage12 != "��") {Toast.makeText(this@MainActivity,getMessage12, Toast.LENGTH_LONG).show()}
                        if(getMessage11 != "��") {Toast.makeText(this@MainActivity,getMessage11, Toast.LENGTH_LONG).show()}
                        if(getMessage10 != "��") {Toast.makeText(this@MainActivity,getMessage10, Toast.LENGTH_LONG).show()}
                        if(getMessage9 != "��") {Toast.makeText(this@MainActivity,getMessage9, Toast.LENGTH_LONG).show()}
                        if(getMessage8 != "��") {Toast.makeText(this@MainActivity,getMessage8, Toast.LENGTH_LONG).show()}
                        if(getMessage7 != "��") {Toast.makeText(this@MainActivity,getMessage7, Toast.LENGTH_LONG).show()}
                        if(getMessage6 != "��") {Toast.makeText(this@MainActivity,getMessage6, Toast.LENGTH_LONG).show()}
                        if(getMessage5 != "��") {Toast.makeText(this@MainActivity,getMessage5, Toast.LENGTH_LONG).show()}
                        if(getMessage4 != "��") {Toast.makeText(this@MainActivity,getMessage4, Toast.LENGTH_LONG).show()}
                        if(getMessage3 != "��") {Toast.makeText(this@MainActivity,getMessage3, Toast.LENGTH_LONG).show()}
                        if(getMessage2 != "��") {Toast.makeText(this@MainActivity,getMessage2, Toast.LENGTH_LONG).show()}
                        if(getMessage1 != "��") {Toast.makeText(this@MainActivity,getMessage1, Toast.LENGTH_LONG).show()}

                        return@subscribe
                    }


                    if (latestId >= id19) {
                        Log.d("TAG", "18TxGet!!")
                        getTx = 18
                        nowTx += getTx
                        saveTransactionId(id)
                        saveNowTx(nowTx)

                        if(getMessage18 != "��") {Toast.makeText(this@MainActivity,getMessage18, Toast.LENGTH_LONG).show()}
                        if(getMessage17 != "��") {Toast.makeText(this@MainActivity,getMessage17, Toast.LENGTH_LONG).show()}
                        if(getMessage16 != "��") {Toast.makeText(this@MainActivity,getMessage16, Toast.LENGTH_LONG).show()}
                        if(getMessage15 != "��") {Toast.makeText(this@MainActivity,getMessage15, Toast.LENGTH_LONG).show()}
                        if(getMessage14 != "��") {Toast.makeText(this@MainActivity,getMessage14, Toast.LENGTH_LONG).show()}
                        if(getMessage13 != "��") {Toast.makeText(this@MainActivity,getMessage13, Toast.LENGTH_LONG).show()}
                        if(getMessage12 != "��") {Toast.makeText(this@MainActivity,getMessage12, Toast.LENGTH_LONG).show()}
                        if(getMessage11 != "��") {Toast.makeText(this@MainActivity,getMessage11, Toast.LENGTH_LONG).show()}
                        if(getMessage10 != "��") {Toast.makeText(this@MainActivity,getMessage10, Toast.LENGTH_LONG).show()}
                        if(getMessage9 != "��") {Toast.makeText(this@MainActivity,getMessage9, Toast.LENGTH_LONG).show()}
                        if(getMessage8 != "��") {Toast.makeText(this@MainActivity,getMessage8, Toast.LENGTH_LONG).show()}
                        if(getMessage7 != "��") {Toast.makeText(this@MainActivity,getMessage7, Toast.LENGTH_LONG).show()}
                        if(getMessage6 != "��") {Toast.makeText(this@MainActivity,getMessage6, Toast.LENGTH_LONG).show()}
                        if(getMessage5 != "��") {Toast.makeText(this@MainActivity,getMessage5, Toast.LENGTH_LONG).show()}
                        if(getMessage4 != "��") {Toast.makeText(this@MainActivity,getMessage4, Toast.LENGTH_LONG).show()}
                        if(getMessage3 != "��") {Toast.makeText(this@MainActivity,getMessage3, Toast.LENGTH_LONG).show()}
                        if(getMessage2 != "��") {Toast.makeText(this@MainActivity,getMessage2, Toast.LENGTH_LONG).show()}
                        if(getMessage1 != "��") {Toast.makeText(this@MainActivity,getMessage1, Toast.LENGTH_LONG).show()}

                        return@subscribe
                    }

                    if (latestId >= id20) {
                        Log.d("TAG", "19TxGet!!")
                        getTx = 19
                        nowTx += getTx
                        saveTransactionId(id)
                        saveNowTx(nowTx)

                        if(getMessage19 != "��") {Toast.makeText(this@MainActivity,getMessage19, Toast.LENGTH_LONG).show()}
                        if(getMessage18 != "��") {Toast.makeText(this@MainActivity,getMessage18, Toast.LENGTH_LONG).show()}
                        if(getMessage17 != "��") {Toast.makeText(this@MainActivity,getMessage17, Toast.LENGTH_LONG).show()}
                        if(getMessage16 != "��") {Toast.makeText(this@MainActivity,getMessage16, Toast.LENGTH_LONG).show()}
                        if(getMessage15 != "��") {Toast.makeText(this@MainActivity,getMessage15, Toast.LENGTH_LONG).show()}
                        if(getMessage14 != "��") {Toast.makeText(this@MainActivity,getMessage14, Toast.LENGTH_LONG).show()}
                        if(getMessage13 != "��") {Toast.makeText(this@MainActivity,getMessage13, Toast.LENGTH_LONG).show()}
                        if(getMessage12 != "��") {Toast.makeText(this@MainActivity,getMessage12, Toast.LENGTH_LONG).show()}
                        if(getMessage11 != "��") {Toast.makeText(this@MainActivity,getMessage11, Toast.LENGTH_LONG).show()}
                        if(getMessage10 != "��") {Toast.makeText(this@MainActivity,getMessage10, Toast.LENGTH_LONG).show()}
                        if(getMessage9 != "��") {Toast.makeText(this@MainActivity,getMessage9, Toast.LENGTH_LONG).show()}
                        if(getMessage8 != "��") {Toast.makeText(this@MainActivity,getMessage8, Toast.LENGTH_LONG).show()}
                        if(getMessage7 != "��") {Toast.makeText(this@MainActivity,getMessage7, Toast.LENGTH_LONG).show()}
                        if(getMessage6 != "��") {Toast.makeText(this@MainActivity,getMessage6, Toast.LENGTH_LONG).show()}
                        if(getMessage5 != "��") {Toast.makeText(this@MainActivity,getMessage5, Toast.LENGTH_LONG).show()}
                        if(getMessage4 != "��") {Toast.makeText(this@MainActivity,getMessage4, Toast.LENGTH_LONG).show()}
                        if(getMessage3 != "��") {Toast.makeText(this@MainActivity,getMessage3, Toast.LENGTH_LONG).show()}
                        if(getMessage2 != "��") {Toast.makeText(this@MainActivity,getMessage2, Toast.LENGTH_LONG).show()}
                        if(getMessage1 != "��") {Toast.makeText(this@MainActivity,getMessage1, Toast.LENGTH_LONG).show()}

                        return@subscribe
                    }


                    if (latestId >= id21) {
                        Log.d("TAG", "20TxGet!!")
                        getTx = 20
                        nowTx += getTx
                        saveTransactionId(id)
                        saveNowTx(nowTx)

                        if(getMessage20 != "��") {Toast.makeText(this@MainActivity,getMessage20, Toast.LENGTH_LONG).show()}
                        if(getMessage19 != "��") {Toast.makeText(this@MainActivity,getMessage19, Toast.LENGTH_LONG).show()}
                        if(getMessage18 != "��") {Toast.makeText(this@MainActivity,getMessage18, Toast.LENGTH_LONG).show()}
                        if(getMessage17 != "��") {Toast.makeText(this@MainActivity,getMessage17, Toast.LENGTH_LONG).show()}
                        if(getMessage16 != "��") {Toast.makeText(this@MainActivity,getMessage16, Toast.LENGTH_LONG).show()}
                        if(getMessage15 != "��") {Toast.makeText(this@MainActivity,getMessage15, Toast.LENGTH_LONG).show()}
                        if(getMessage14 != "��") {Toast.makeText(this@MainActivity,getMessage14, Toast.LENGTH_LONG).show()}
                        if(getMessage13 != "��") {Toast.makeText(this@MainActivity,getMessage13, Toast.LENGTH_LONG).show()}
                        if(getMessage12 != "��") {Toast.makeText(this@MainActivity,getMessage12, Toast.LENGTH_LONG).show()}
                        if(getMessage11 != "��") {Toast.makeText(this@MainActivity,getMessage11, Toast.LENGTH_LONG).show()}
                        if(getMessage10 != "��") {Toast.makeText(this@MainActivity,getMessage10, Toast.LENGTH_LONG).show()}
                        if(getMessage9 != "��") {Toast.makeText(this@MainActivity,getMessage9, Toast.LENGTH_LONG).show()}
                        if(getMessage8 != "��") {Toast.makeText(this@MainActivity,getMessage8, Toast.LENGTH_LONG).show()}
                        if(getMessage7 != "��") {Toast.makeText(this@MainActivity,getMessage7, Toast.LENGTH_LONG).show()}
                        if(getMessage6 != "��") {Toast.makeText(this@MainActivity,getMessage6, Toast.LENGTH_LONG).show()}
                        if(getMessage5 != "��") {Toast.makeText(this@MainActivity,getMessage5, Toast.LENGTH_LONG).show()}
                        if(getMessage4 != "��") {Toast.makeText(this@MainActivity,getMessage4, Toast.LENGTH_LONG).show()}
                        if(getMessage3 != "��") {Toast.makeText(this@MainActivity,getMessage3, Toast.LENGTH_LONG).show()}
                        if(getMessage2 != "��") {Toast.makeText(this@MainActivity,getMessage2, Toast.LENGTH_LONG).show()}
                        if(getMessage1 != "��") {Toast.makeText(this@MainActivity,getMessage1, Toast.LENGTH_LONG).show()}

                        return@subscribe
                    }

                    if (latestId >= id22) {
                        Log.d("TAG", "21TxGet!!")
                        getTx = 21
                        nowTx += getTx
                        saveTransactionId(id)
                        saveNowTx(nowTx)

                        if(getMessage21 != "��") {Toast.makeText(this@MainActivity,getMessage21, Toast.LENGTH_LONG).show()}
                        if(getMessage20 != "��") {Toast.makeText(this@MainActivity,getMessage20, Toast.LENGTH_LONG).show()}
                        if(getMessage19 != "��") {Toast.makeText(this@MainActivity,getMessage19, Toast.LENGTH_LONG).show()}
                        if(getMessage18 != "��") {Toast.makeText(this@MainActivity,getMessage18, Toast.LENGTH_LONG).show()}
                        if(getMessage17 != "��") {Toast.makeText(this@MainActivity,getMessage17, Toast.LENGTH_LONG).show()}
                        if(getMessage16 != "��") {Toast.makeText(this@MainActivity,getMessage16, Toast.LENGTH_LONG).show()}
                        if(getMessage15 != "��") {Toast.makeText(this@MainActivity,getMessage15, Toast.LENGTH_LONG).show()}
                        if(getMessage14 != "��") {Toast.makeText(this@MainActivity,getMessage14, Toast.LENGTH_LONG).show()}
                        if(getMessage13 != "��") {Toast.makeText(this@MainActivity,getMessage13, Toast.LENGTH_LONG).show()}
                        if(getMessage12 != "��") {Toast.makeText(this@MainActivity,getMessage12, Toast.LENGTH_LONG).show()}
                        if(getMessage11 != "��") {Toast.makeText(this@MainActivity,getMessage11, Toast.LENGTH_LONG).show()}
                        if(getMessage10 != "��") {Toast.makeText(this@MainActivity,getMessage10, Toast.LENGTH_LONG).show()}
                        if(getMessage9 != "��") {Toast.makeText(this@MainActivity,getMessage9, Toast.LENGTH_LONG).show()}
                        if(getMessage8 != "��") {Toast.makeText(this@MainActivity,getMessage8, Toast.LENGTH_LONG).show()}
                        if(getMessage7 != "��") {Toast.makeText(this@MainActivity,getMessage7, Toast.LENGTH_LONG).show()}
                        if(getMessage6 != "��") {Toast.makeText(this@MainActivity,getMessage6, Toast.LENGTH_LONG).show()}
                        if(getMessage5 != "��") {Toast.makeText(this@MainActivity,getMessage5, Toast.LENGTH_LONG).show()}
                        if(getMessage4 != "��") {Toast.makeText(this@MainActivity,getMessage4, Toast.LENGTH_LONG).show()}
                        if(getMessage3 != "��") {Toast.makeText(this@MainActivity,getMessage3, Toast.LENGTH_LONG).show()}
                        if(getMessage2 != "��") {Toast.makeText(this@MainActivity,getMessage2, Toast.LENGTH_LONG).show()}
                        if(getMessage1 != "��") {Toast.makeText(this@MainActivity,getMessage1, Toast.LENGTH_LONG).show()}

                        return@subscribe
                    }

                    if (latestId >= id23) {
                        Log.d("TAG", "22TxGet!!")
                        getTx = 22
                        nowTx += getTx
                        saveTransactionId(id)
                        saveNowTx(nowTx)

                        if(getMessage22 != "��") {Toast.makeText(this@MainActivity,getMessage22, Toast.LENGTH_LONG).show()}
                        if(getMessage21 != "��") {Toast.makeText(this@MainActivity,getMessage21, Toast.LENGTH_LONG).show()}
                        if(getMessage20 != "��") {Toast.makeText(this@MainActivity,getMessage20, Toast.LENGTH_LONG).show()}
                        if(getMessage19 != "��") {Toast.makeText(this@MainActivity,getMessage19, Toast.LENGTH_LONG).show()}
                        if(getMessage18 != "��") {Toast.makeText(this@MainActivity,getMessage18, Toast.LENGTH_LONG).show()}
                        if(getMessage17 != "��") {Toast.makeText(this@MainActivity,getMessage17, Toast.LENGTH_LONG).show()}
                        if(getMessage16 != "��") {Toast.makeText(this@MainActivity,getMessage16, Toast.LENGTH_LONG).show()}
                        if(getMessage15 != "��") {Toast.makeText(this@MainActivity,getMessage15, Toast.LENGTH_LONG).show()}
                        if(getMessage14 != "��") {Toast.makeText(this@MainActivity,getMessage14, Toast.LENGTH_LONG).show()}
                        if(getMessage13 != "��") {Toast.makeText(this@MainActivity,getMessage13, Toast.LENGTH_LONG).show()}
                        if(getMessage12 != "��") {Toast.makeText(this@MainActivity,getMessage12, Toast.LENGTH_LONG).show()}
                        if(getMessage11 != "��") {Toast.makeText(this@MainActivity,getMessage11, Toast.LENGTH_LONG).show()}
                        if(getMessage10 != "��") {Toast.makeText(this@MainActivity,getMessage10, Toast.LENGTH_LONG).show()}
                        if(getMessage9 != "��") {Toast.makeText(this@MainActivity,getMessage9, Toast.LENGTH_LONG).show()}
                        if(getMessage8 != "��") {Toast.makeText(this@MainActivity,getMessage8, Toast.LENGTH_LONG).show()}
                        if(getMessage7 != "��") {Toast.makeText(this@MainActivity,getMessage7, Toast.LENGTH_LONG).show()}
                        if(getMessage6 != "��") {Toast.makeText(this@MainActivity,getMessage6, Toast.LENGTH_LONG).show()}
                        if(getMessage5 != "��") {Toast.makeText(this@MainActivity,getMessage5, Toast.LENGTH_LONG).show()}
                        if(getMessage4 != "��") {Toast.makeText(this@MainActivity,getMessage4, Toast.LENGTH_LONG).show()}
                        if(getMessage3 != "��") {Toast.makeText(this@MainActivity,getMessage3, Toast.LENGTH_LONG).show()}
                        if(getMessage2 != "��") {Toast.makeText(this@MainActivity,getMessage2, Toast.LENGTH_LONG).show()}
                        if(getMessage1 != "��") {Toast.makeText(this@MainActivity,getMessage1, Toast.LENGTH_LONG).show()}

                        return@subscribe
                    }

                    if (latestId >= id24) {
                        Log.d("TAG", "23TxGet!!")
                        getTx = 23
                        nowTx += getTx
                        saveTransactionId(id)
                        saveNowTx(nowTx)

                        if(getMessage23 != "��") {Toast.makeText(this@MainActivity,getMessage23, Toast.LENGTH_LONG).show()}
                        if(getMessage22 != "��") {Toast.makeText(this@MainActivity,getMessage22, Toast.LENGTH_LONG).show()}
                        if(getMessage21 != "��") {Toast.makeText(this@MainActivity,getMessage21, Toast.LENGTH_LONG).show()}
                        if(getMessage20 != "��") {Toast.makeText(this@MainActivity,getMessage20, Toast.LENGTH_LONG).show()}
                        if(getMessage19 != "��") {Toast.makeText(this@MainActivity,getMessage19, Toast.LENGTH_LONG).show()}
                        if(getMessage18 != "��") {Toast.makeText(this@MainActivity,getMessage18, Toast.LENGTH_LONG).show()}
                        if(getMessage17 != "��") {Toast.makeText(this@MainActivity,getMessage17, Toast.LENGTH_LONG).show()}
                        if(getMessage16 != "��") {Toast.makeText(this@MainActivity,getMessage16, Toast.LENGTH_LONG).show()}
                        if(getMessage15 != "��") {Toast.makeText(this@MainActivity,getMessage15, Toast.LENGTH_LONG).show()}
                        if(getMessage14 != "��") {Toast.makeText(this@MainActivity,getMessage14, Toast.LENGTH_LONG).show()}
                        if(getMessage13 != "��") {Toast.makeText(this@MainActivity,getMessage13, Toast.LENGTH_LONG).show()}
                        if(getMessage12 != "��") {Toast.makeText(this@MainActivity,getMessage12, Toast.LENGTH_LONG).show()}
                        if(getMessage11 != "��") {Toast.makeText(this@MainActivity,getMessage11, Toast.LENGTH_LONG).show()}
                        if(getMessage10 != "��") {Toast.makeText(this@MainActivity,getMessage10, Toast.LENGTH_LONG).show()}
                        if(getMessage9 != "��") {Toast.makeText(this@MainActivity,getMessage9, Toast.LENGTH_LONG).show()}
                        if(getMessage8 != "��") {Toast.makeText(this@MainActivity,getMessage8, Toast.LENGTH_LONG).show()}
                        if(getMessage7 != "��") {Toast.makeText(this@MainActivity,getMessage7, Toast.LENGTH_LONG).show()}
                        if(getMessage6 != "��") {Toast.makeText(this@MainActivity,getMessage6, Toast.LENGTH_LONG).show()}
                        if(getMessage5 != "��") {Toast.makeText(this@MainActivity,getMessage5, Toast.LENGTH_LONG).show()}
                        if(getMessage4 != "��") {Toast.makeText(this@MainActivity,getMessage4, Toast.LENGTH_LONG).show()}
                        if(getMessage3 != "��") {Toast.makeText(this@MainActivity,getMessage3, Toast.LENGTH_LONG).show()}
                        if(getMessage2 != "��") {Toast.makeText(this@MainActivity,getMessage2, Toast.LENGTH_LONG).show()}
                        if(getMessage1 != "��") {Toast.makeText(this@MainActivity,getMessage1, Toast.LENGTH_LONG).show()}

                        return@subscribe
                    }

                    if (latestId >= id25) {
                        Log.d("TAG", "24TxGet!!")
                        getTx = 24
                        nowTx += getTx
                        saveTransactionId(id)
                        saveNowTx(nowTx)

                        if(getMessage24 != "��") {Toast.makeText(this@MainActivity,getMessage24, Toast.LENGTH_LONG).show()}
                        if(getMessage23 != "��") {Toast.makeText(this@MainActivity,getMessage23, Toast.LENGTH_LONG).show()}
                        if(getMessage22 != "��") {Toast.makeText(this@MainActivity,getMessage22, Toast.LENGTH_LONG).show()}
                        if(getMessage21 != "��") {Toast.makeText(this@MainActivity,getMessage21, Toast.LENGTH_LONG).show()}
                        if(getMessage20 != "��") {Toast.makeText(this@MainActivity,getMessage20, Toast.LENGTH_LONG).show()}
                        if(getMessage19 != "��") {Toast.makeText(this@MainActivity,getMessage19, Toast.LENGTH_LONG).show()}
                        if(getMessage18 != "��") {Toast.makeText(this@MainActivity,getMessage18, Toast.LENGTH_LONG).show()}
                        if(getMessage17 != "��") {Toast.makeText(this@MainActivity,getMessage17, Toast.LENGTH_LONG).show()}
                        if(getMessage16 != "��") {Toast.makeText(this@MainActivity,getMessage16, Toast.LENGTH_LONG).show()}
                        if(getMessage15 != "��") {Toast.makeText(this@MainActivity,getMessage15, Toast.LENGTH_LONG).show()}
                        if(getMessage14 != "��") {Toast.makeText(this@MainActivity,getMessage14, Toast.LENGTH_LONG).show()}
                        if(getMessage13 != "��") {Toast.makeText(this@MainActivity,getMessage13, Toast.LENGTH_LONG).show()}
                        if(getMessage12 != "��") {Toast.makeText(this@MainActivity,getMessage12, Toast.LENGTH_LONG).show()}
                        if(getMessage11 != "��") {Toast.makeText(this@MainActivity,getMessage11, Toast.LENGTH_LONG).show()}
                        if(getMessage10 != "��") {Toast.makeText(this@MainActivity,getMessage10, Toast.LENGTH_LONG).show()}
                        if(getMessage9 != "��") {Toast.makeText(this@MainActivity,getMessage9, Toast.LENGTH_LONG).show()}
                        if(getMessage8 != "��") {Toast.makeText(this@MainActivity,getMessage8, Toast.LENGTH_LONG).show()}
                        if(getMessage7 != "��") {Toast.makeText(this@MainActivity,getMessage7, Toast.LENGTH_LONG).show()}
                        if(getMessage6 != "��") {Toast.makeText(this@MainActivity,getMessage6, Toast.LENGTH_LONG).show()}
                        if(getMessage5 != "��") {Toast.makeText(this@MainActivity,getMessage5, Toast.LENGTH_LONG).show()}
                        if(getMessage4 != "��") {Toast.makeText(this@MainActivity,getMessage4, Toast.LENGTH_LONG).show()}
                        if(getMessage3 != "��") {Toast.makeText(this@MainActivity,getMessage3, Toast.LENGTH_LONG).show()}
                        if(getMessage2 != "��") {Toast.makeText(this@MainActivity,getMessage2, Toast.LENGTH_LONG).show()}
                        if(getMessage1 != "��") {Toast.makeText(this@MainActivity,getMessage1, Toast.LENGTH_LONG).show()}

                        return@subscribe
                    }

                    if (latestId < id25) {
                        Log.d("TAG", "25TxGet!!")
                        getTx = 25
                        nowTx += getTx
                        saveTransactionId(id)
                        saveNowTx(nowTx)

                        if(getMessage25 != "��") {Toast.makeText(this@MainActivity,getMessage25, Toast.LENGTH_LONG).show()}
                        if(getMessage24 != "��") {Toast.makeText(this@MainActivity,getMessage24, Toast.LENGTH_LONG).show()}
                        if(getMessage23 != "��") {Toast.makeText(this@MainActivity,getMessage23, Toast.LENGTH_LONG).show()}
                        if(getMessage22 != "��") {Toast.makeText(this@MainActivity,getMessage22, Toast.LENGTH_LONG).show()}
                        if(getMessage21 != "��") {Toast.makeText(this@MainActivity,getMessage21, Toast.LENGTH_LONG).show()}
                        if(getMessage20 != "��") {Toast.makeText(this@MainActivity,getMessage20, Toast.LENGTH_LONG).show()}
                        if(getMessage19 != "��") {Toast.makeText(this@MainActivity,getMessage19, Toast.LENGTH_LONG).show()}
                        if(getMessage18 != "��") {Toast.makeText(this@MainActivity,getMessage18, Toast.LENGTH_LONG).show()}
                        if(getMessage17 != "��") {Toast.makeText(this@MainActivity,getMessage17, Toast.LENGTH_LONG).show()}
                        if(getMessage16 != "��") {Toast.makeText(this@MainActivity,getMessage16, Toast.LENGTH_LONG).show()}
                        if(getMessage15 != "��") {Toast.makeText(this@MainActivity,getMessage15, Toast.LENGTH_LONG).show()}
                        if(getMessage14 != "��") {Toast.makeText(this@MainActivity,getMessage14, Toast.LENGTH_LONG).show()}
                        if(getMessage13 != "��") {Toast.makeText(this@MainActivity,getMessage13, Toast.LENGTH_LONG).show()}
                        if(getMessage12 != "��") {Toast.makeText(this@MainActivity,getMessage12, Toast.LENGTH_LONG).show()}
                        if(getMessage11 != "��") {Toast.makeText(this@MainActivity,getMessage11, Toast.LENGTH_LONG).show()}
                        if(getMessage10 != "��") {Toast.makeText(this@MainActivity,getMessage10, Toast.LENGTH_LONG).show()}
                        if(getMessage9 != "��") {Toast.makeText(this@MainActivity,getMessage9, Toast.LENGTH_LONG).show()}
                        if(getMessage8 != "��") {Toast.makeText(this@MainActivity,getMessage8, Toast.LENGTH_LONG).show()}
                        if(getMessage7 != "��") {Toast.makeText(this@MainActivity,getMessage7, Toast.LENGTH_LONG).show()}
                        if(getMessage6 != "��") {Toast.makeText(this@MainActivity,getMessage6, Toast.LENGTH_LONG).show()}
                        if(getMessage5 != "��") {Toast.makeText(this@MainActivity,getMessage5, Toast.LENGTH_LONG).show()}
                        if(getMessage4 != "��") {Toast.makeText(this@MainActivity,getMessage4, Toast.LENGTH_LONG).show()}
                        if(getMessage3 != "��") {Toast.makeText(this@MainActivity,getMessage3, Toast.LENGTH_LONG).show()}
                        if(getMessage2 != "��") {Toast.makeText(this@MainActivity,getMessage2, Toast.LENGTH_LONG).show()}
                        if(getMessage1 != "��") {Toast.makeText(this@MainActivity,getMessage1, Toast.LENGTH_LONG).show()}

                        return@subscribe
                    }

                },
                    {
                    it.printStackTrace()
                })
        }
    }

    private fun saveTransactionId(id: Int) {
        val data = getSharedPreferences(SHAREDPREFERENCES_PACKAGE_NAME, Context.MODE_PRIVATE)
        val editor = data.edit()
        editor.putInt(LATEST_TRANSACTION_ID, id)
        editor.apply()
    }

    private fun getLatestTransactionId(): Int {
        val data = getSharedPreferences(SHAREDPREFERENCES_PACKAGE_NAME, Context.MODE_PRIVATE)
        val getId = data.getInt(LATEST_TRANSACTION_ID, 1)
        return getId
    }

    private fun saveNowTx(nowTx: Int) {
        val data = getSharedPreferences(SHAREDPREFERENCES_PACKAGE_NAME, Context.MODE_PRIVATE)
        val editor = data.edit()
        editor.putInt(LATEST_NOW_TX, nowTx)
        editor.apply()
    }

    private fun getLatestNowTxId(): Int {
        val data = getSharedPreferences(SHAREDPREFERENCES_PACKAGE_NAME, Context.MODE_PRIVATE)
        val getNowTx = data.getInt(LATEST_NOW_TX, 1)
        return getNowTx
    }



    companion object {
        private const val ADDRESS = "NDPOHD4J3EZ3AF4GOKCQT4UU3QAFGDANKP5R4MKU"
        private const val SHAREDPREFERENCES_PACKAGE_NAME = "DataSave"
        private const val LATEST_TRANSACTION_ID = "latestTransactionId"
        private const val LATEST_NOW_TX = "latestNowTx"

    }

    private fun leanBackMode(){
        val decorView = window.decorView
        decorView.systemUiVisibility = (
                View.SYSTEM_UI_FLAG_FULLSCREEN
                        or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                )

        window.decorView.setOnSystemUiVisibilityChangeListener { visibility ->
            if (visibility and View.SYSTEM_UI_FLAG_FULLSCREEN == 0) {
                Log.d("debug","The system bars are visible")
            } else {
                Log.d("debug","The system bars are NOT visible")
            }
        }

    }


}

