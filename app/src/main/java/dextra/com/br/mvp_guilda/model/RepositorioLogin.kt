package dextra.com.br.mvp_guilda.model

import dextra.com.br.mvp_guilda.domain.entity.User

class RepositorioLogin {

    val login = "teste"
    val password = "1234"

     fun doValidateUser(user: User):Boolean {
         return (user.login == login && user.password == password )
     }
}