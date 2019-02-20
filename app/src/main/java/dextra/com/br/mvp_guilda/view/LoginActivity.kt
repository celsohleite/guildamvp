package dextra.com.br.mvp_guilda.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import dextra.com.br.mvp_guilda.R
import dextra.com.br.mvp_guilda.presenter.LoginContract

class LoginActivity : AppCompatActivity(), LoginContract.Presenter{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    override fun doValidateUser() {

    }

}
