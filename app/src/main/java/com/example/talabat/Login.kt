package com.example.talabat

import Models.User
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val user = intent.getSerializableExtra("ExtraUser") as User
        email_Login.setText(user.email);

        login.setOnClickListener{

            val email = email_Login.text.toString().trim();
            val pass = password_login.text.toString().trim();

            if(email.isEmpty()){
                email_Login.error ="Enter user name"
                email_Login.requestFocus();
            }else if(pass.isEmpty() ){
                password_login.error ="enter valid password"
                password_login.requestFocus()
            }else if(!(pass.equals(user.password))){
                password_login.error ="wrong password"
                password_login.requestFocus()
            }else {
              val intent2 = Intent(this , Home::class.java)
                intent2.putExtra("EuserName" ,user.userName );
                startActivity(intent2);
            }
        }
        gotoSignin.setOnClickListener{
             intent = Intent(this , MainActivity::class.java)
            startActivity(intent)
        }

    }


}
