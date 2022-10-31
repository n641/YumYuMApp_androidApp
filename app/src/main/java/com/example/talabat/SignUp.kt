package com.example.talabat

import Models.User
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        signup.setOnClickListener {

            val userName1 = userName.text.toString().trim();
            val email1 = email.text.toString().trim();
            val password1 = password.text.toString();
            val com_pass1 = com_pass.text.toString();
            val address1 = address.text.toString().trim();
            val mobileNumber1 = mobileNumber.text.toString();
            val birthDate1 = birthDate.text.toString().trim();

            println("userName1" + userName1)
            if (userName1.isEmpty()) {
                userName.error = "Enter user name"
                userName.requestFocus();
            } else if (email1.isEmpty()) {
                email.error = "enter email"
                email.requestFocus()
            } else if (password1.isEmpty()) {
                password.error = "enter password"
                password.requestFocus()
            }
            else if (com_pass1.isEmpty() || !(com_pass1.equals(password1))) {
                com_pass.error = "the passwords don't match"
                com_pass.requestFocus()
            } else if (address1.isEmpty()) {
                address.error = "enter password"
                address.requestFocus()
            } else if (mobileNumber1.isEmpty()) {
                mobileNumber.error = "enter password"
                mobileNumber.requestFocus()
            } else if (birthDate1.isEmpty()) {
                birthDate.error = "enter password"
                birthDate.requestFocus()
            }
            else {
                // valdation success
                val intent = Intent(this , Login::class.java)
                val user = User(userName1 , email1 , password1 ,address1 , mobileNumber1 , birthDate1)
                intent.putExtra("ExtraUser" ,user )
                startActivity(intent);

//                val replyIntent = Intent()
//                replyIntent.putExtra("ExtraUser", user);
//                setResult(RESULT_OK, replyIntent);
//                finish();

            }

        }


    }
}