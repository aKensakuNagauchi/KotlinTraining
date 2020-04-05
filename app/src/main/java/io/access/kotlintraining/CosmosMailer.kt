package io.access.kotlintraining

class CosmosMailer : Mailer {
    override fun sendMessage(email: String, message: String) {
        println("To: $email\nmessage: $message")
    }
}

class Client(val personalInfo: PersonalInfo?)
class PersonalInfo(val email: String?)
