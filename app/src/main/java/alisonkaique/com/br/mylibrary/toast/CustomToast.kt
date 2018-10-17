package alisonkaique.com.br.mylibrary.toast

import alisonkaique.com.br.mylibrary.R
import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.TextView
import android.widget.Toast

class CustomToast(val context: Context, val inflater: LayoutInflater) {

    fun showToast(text: String) {
        val customToastroot = inflater.inflate(R.layout.custom_toast, null)
        val customtoast = Toast(context)

        val textView = customToastroot.findViewById<TextView>(R.id.tvOne)
        textView.text = text

        customtoast.view = customToastroot
        customtoast.setGravity(Gravity.CENTER_HORIZONTAL or Gravity.BOTTOM,0,0)
        customtoast.duration = Toast.LENGTH_LONG

        customtoast.show()
    }

}