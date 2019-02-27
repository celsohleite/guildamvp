package dextra.com.br.mvp_guilda.ui.login.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import dextra.com.br.mvp_guilda.R
import dextra.com.br.mvp_guilda.domain.entity.User
import dextra.com.br.mvp_guilda.ui.login.presenter.LoginPresenter
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), LoginContract.View{

    private lateinit var presenter: LoginPresenter

    private lateinit var user: User

     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

         presenter = LoginPresenter(this)

        val btnLogin = findViewById<Button>(R.id.btn_login)

        btnLogin.setOnClickListener {
            user = User(
                login =  edt_user.text.toString(),
                password = edt_password.text.toString()
            )

            presenter.doValidateUser(user)
        }
    }

    override fun showMessage(message: String) {
        Toast.makeText(this@LoginActivity, message, Toast.LENGTH_SHORT).show()
    }
}
