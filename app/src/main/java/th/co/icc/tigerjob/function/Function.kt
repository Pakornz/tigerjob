package th.co.icc.tigerjob.function

import android.app.Activity
import android.content.Context
import android.content.DialogInterface
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.os.CountDownTimer
import android.support.v7.app.AlertDialog
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import sweetalert.SweetAlertDialog
import th.co.icc.tigerjob.R
import th.co.icc.tigerjob.api.CallbackListener
import th.co.icc.tigerjob.database.RealmDb
import th.co.icc.tigerjob.font.Fonts

import java.text.Format
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

class Function {
    fun isInternetConnected(context: Context): Boolean {
        val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        val activeNetwork = cm.activeNetworkInfo

        return activeNetwork != null && activeNetwork.isConnectedOrConnecting
    }

    fun showErrorDialog(activity: Context, title: String, content: String, callbackListener: CallbackListener?) {
        val dialog = SweetAlertDialog(activity, SweetAlertDialog.ERROR_TYPE)
        dialog.titleText = title
        dialog.contentText = content

        if (callbackListener != null) {
            dialog.setOnDismissListener { callbackListener.callback(null) }
        }
        dialog.show()
    }

    fun showWarningDialog(activity: Context, title: String, content: String, callbackListener: CallbackListener?) {
        val dialog = SweetAlertDialog(activity, SweetAlertDialog.WARNING_TYPE)
        dialog.titleText = title
        dialog.contentText = content
        dialog.confirmText = activity.getString(R.string.ok_txt)
        dialog.setConfirmClickListener { sweetAlertDialog -> sweetAlertDialog.dismissWithAnimation() }

        if (callbackListener != null) {
            dialog.setOnDismissListener { callbackListener.callback(null) }
        }
        dialog.show()

    }


    fun showSuccessDialog(
        activity: Context,
        title: String,
        content: String,
        callbackListener: CallbackListener?,
        autoHide: Boolean
    ) {
        val dialog = SweetAlertDialog(activity, SweetAlertDialog.SUCCESS_TYPE)
        dialog.titleText = title
        dialog.contentText = content
        dialog.confirmText = activity.getString(R.string.ok_txt)

        dialog.setOnDismissListener {
            callbackListener?.callback(null)
        }

        dialog.setConfirmClickListener { sweetAlertDialog -> sweetAlertDialog.dismissWithAnimation() }

        if (autoHide) {
            object : CountDownTimer(2000, 2000) {

                override fun onTick(millisUntilFinished: Long) {

                }

                override fun onFinish() {
                    dialog.dismissWithAnimation()
                }
            }.start()
        }


        dialog.show()
    }


    fun setTimeOut(onTimeOut: CallbackListener?, countDownTimeOutSecond: Long): CountDownTimer {

        val timeOut = object : CountDownTimer(countDownTimeOutSecond, countDownTimeOutSecond) {
            override fun onTick(millisUntilFinished: Long) {

            }

            override fun onFinish() {
                onTimeOut?.callback(null)
            }
        }
        timeOut.start()
        return timeOut
    }

    fun replaceNull(data: String?, replaceStr: String): String {
        return data ?: replaceStr
    }

    fun getCurrentDate(format: String): String {
        val formatter = SimpleDateFormat(format, Locale("en", "EN"))
        return formatter.format(Date()).toString()

    }

    fun getDate(format: String, date: Date): String {
        val formatter = SimpleDateFormat(format, Locale("en", "EN"))
        return formatter.format(date).toString()

    }

    fun StringToDate(dataStr: String, format: String, locale: Locale): Date? {
        val formatter = SimpleDateFormat(format, locale)
        var date: Date? = null

        try {
            date = formatter.parse(dataStr)
        } catch (e: Exception) {
            Log.e("ERROR", e.message)
        }

        return date
    }


    fun showInputDialog(
        activity: Activity,
        title: String,
        content: String?,
        inputType: Int,
        callbackListener: CallbackListener
    ) {
        val fonts = Fonts(activity)
        val builder = AlertDialog.Builder(activity)
        val inflater = activity.layoutInflater
        val dialogView = inflater.inflate(R.layout.input_dialog, null)
        fonts.overrideFonts(activity, dialogView, fonts.DEFAULT_THAI_FONTS)
        builder.setView(dialogView)

        val input_edit_text = dialogView.findViewById(R.id.input_edit_text) as EditText
        val ok_button = dialogView.findViewById(R.id.ok_button) as Button
        val cancel_button = dialogView.findViewById(R.id.cancel_button) as Button

        input_edit_text.inputType = inputType

        input_edit_text.setText(content ?: "")

        val titleTextView = dialogView.findViewById(R.id.title) as TextView
        titleTextView.text = title

        val dialog = builder.create()
        dialog.window!!.attributes.windowAnimations = R.style.DialogAnimation
        dialog.show()

        ok_button.setOnClickListener {
            dialog.dismiss()
            callbackListener.callback(input_edit_text.text.toString())
        }
        cancel_button.setOnClickListener { dialog.dismiss() }
    }


//    fun isExitAPI(activity: Activity): Boolean {
//
//        val realmDatabase = RealmDb()
//
//        val isExist = realmDatabase.getWebAPI(GET_API_KEY_SKYFROG_SCAN_TO_ASSIGN) != null && realmDatabase.getWebAPI(
//            GET_API_KEY_ICC_GET_BILL_INFO
//        ) != null
//
//        realmDatabase.close()
//        return isExist
//    }


    fun getFirstDateOfMonth(date: Date): Date {
        val cal = Calendar.getInstance()
        cal.time = date
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH))
        return cal.time
    }

    fun getLastDateOfMonth(date: Date): Date {
        val cal = Calendar.getInstance()
        cal.time = date
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH))
        return cal.time
    }


}
