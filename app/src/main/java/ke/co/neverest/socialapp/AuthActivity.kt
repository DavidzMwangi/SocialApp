package ke.co.neverest.socialapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class AuthActivity : AppCompatActivity() {
    lateinit var googleBtn: AppCompatButton
    lateinit var facebookBtn: AppCompatButton
    lateinit var linkedInBtn: AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)


        googleBtn=findViewById(R.id.google_btn)
        facebookBtn=findViewById(R.id.facebook_btn)
        linkedInBtn=findViewById(R.id.linked_in_btn)


        googleBtn.setOnClickListener{


            Toast.makeText(applicationContext,"Google",Toast.LENGTH_SHORT).show()

        }
    }
}
