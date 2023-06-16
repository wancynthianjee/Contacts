
package com.example.contactsapp
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager

private var Any.adapter: ContactsRvAdapter
    get() {
        TODO("Not yet implemented")
    }
    set(set) {}
private var Any.layoutManager: LinearLayoutManager
    get() {
        TODO("Not yet implemented")
    }
    set(set) = Unit


class ContactsRvAdapter(name: List<Any>) {

}

fun Any.setOnClickListener(function: () -> Unit) {


}

class ActivityMainBinding {
    val rvContacts: Any = TODO()
    val flbtnAdd: Any
        get() {
            TODO()
        }
    val root: Any = TODO()

    companion object {
        fun inflate(layoutInflater: LayoutInflater): ActivityMainBinding {


            return TODO("Provide the return value")
        }

}

private fun Any.setOnClickListener(function: () -> Unit) {

}

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setContentView(root: Any) {
        TODO("Not yet implemented")
    }

    override fun onResume() {
        super.onResume()
        displayContacts()
        binding.flbtnAdd.setOnClickListener {
            val intent = Intent(this, AddContact::class.java)
            startActivity(intent)
        }
    }

    fun displayContacts() {
        val name1 = ContactsData(
            "cynthia",
            "0713504579",
            "wanjirucynthiaanjerii@@gmail.com",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQv36bQi4sBqhUsZAXpyPoxylHrIlnvPqIqQ&usqp=CAU"
        )
        val name2 = ContactsData(
            "jeff",
            "0721264170",
            "jeffwanjiru54@gmail.com",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSKH6jiyvll2_mf962tW-pjpsFZs4mib7ZlFQ&usqp=CAU"
        )
        val name3 = ContactsData(
            "judy",
            "0745678923",
            "judymuthoni56@gmail.com",
            " https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDvYYiAt_WjzQ5lueNSWMwHNjp7UV5mjBXOg&usqp=CAU"
        )
        val name4 = ContactsData(
            "ken",
            "017895678",
            "kenorengo78@gmail.com",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS4EO4mBYy5wcJYmUekTrDMFCN9MlR6sP3mJA&usqp=CAU"
        )
        val name5 = ContactsData(
            "lipo",
            "0714567890",
            "oplipo@gmail.com",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ3-sz8N_5WCbp2jABTPlwZqz5XnZ7QtoBbnw&usqp=CAU"
        )
        val name6 = ContactsData(
            "njemp",
            "0145672389",
            "njemp89@gmail.com",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT-17FoYwtUFCOW0aLWHrkIRxJ83Up7UF9XAg&usqp=CAU"
        )
        val name = listOf(name1, name2, name3, name4, name5, name6)
        val contactData = ContactsRvAdapter(name)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        binding.rvContacts.adapter = contactData
    }

    private fun ContactsData(s: String, s1: String, s2: String, s3: String): Any {
        return ("To do ")
    }
}




