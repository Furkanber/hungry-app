package com.kodluyoruz.hungryapp.utils

class Common {

    companion object {

        fun isEmailValid(email: String): Boolean {
            return email.isNotEmpty() && android.util.Patterns.EMAIL_ADDRESS.matcher(email)
                .matches()
        }
    }
}