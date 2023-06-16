package com.example.contactsapp
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

private var Any.error: String
    get() {
        TODO("Not yet implemented")
    }
    set(set) {}


class AddContact : AppCompatActivity() {
    lateinit var binding:ActivityAddContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityAddContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setContentView(root: Any) {
        TODO("Not yet implemented")
    }

    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.btnAdd.setOnClickListener {
            validateAddContact()
        }
    }
    fun validateAddContact() {
        val name = binding.etFirstName.text.toString()
        val name2 = binding.etLAstNAme.text.toString()
        val Phonenumber = binding.etPhonenumber.text.toString()
        val email = binding.etEmail.text.toString()
        var error = false
        if (name.isEmpty()) {
            binding.tilFirstName.error= "First Namerequired"
//            Toast.makeText(this, "Please enter phone number", Toast.LENGTH_SHORT).show();
            error = true
        }
        if (name.isEmpty()) {
            binding.tilLastName.error= "Last Namerequired"
//            Toast.makeText(this, "Please enter first name", Toast.LENGTH_SHORT).show();
            error = true
        }
        if (name2.isEmpty()) {
            binding.tilEmail.error = "Password required"
            Toast.makeText(this, "Please enter last name", Toast.LENGTH_SHORT).show();
            error = true
        }
        if (email.isEmpty()) {
            binding.tilPhonenumber.error= "Phone Number required"
            Toast.makeText(this, "Please enter email", Toast.LENGTH_SHORT).show();
            error = true
        }
        if (!error) {
            val intent = Intent(this, AddContact::class.java)
            startActivity(intent)
        }
        Toast.makeText(this, "Contact added successfully", Toast.LENGTH_SHORT).show();
        finish();
    }
}

class ActivityAddContactBinding {
    val etFirstName: Any
        get() {
            TODO()
        }
    val etLAstNAme: Any
        get() {
            TODO()
        }
    val etPhonenumber: Any
        get() {
            TODO()
        }
    val etEmail: Any
        get() {
            TODO()
        }
    val btnAdd: Any
        get() {
            TODO()
        }
    val tilFirstName: Any
        get() {
            TODO()
        }
    val tilLastName: Any
        get() {
            TODO()
        }

    val tilEmail: Any
        get() {
            TODO()
        }
    val root: Any
        get() {
            TODO()
        }

    val tilPhonenumber: Any = TODO()


    companion object {
        fun inflate(layoutInflater: LayoutInflater): ActivityAddContactBinding {
            TODO("Not yet implemented")
        }
    }

}





