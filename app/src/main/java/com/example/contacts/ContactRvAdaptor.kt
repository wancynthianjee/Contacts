package com.example.contactsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contacts.ContactsData
import com.squareup.picasso.Picasso
import com.squareup.picasso.RequestCreator
import jp.wasabeef.picasso.transformations.CropCircleTransformation

internal var Any.text: String
    get() = Unit.toString()
     set(set) {}
private val Any.tag: Unit
    get() {
        TODO("Not yet implemented")
    }
private val ContactNameListBinding.tvphonenumber: Any
    get() {
        TODO("Not yet implemented")
    }

class ContactAdapter(private val contactsData: List<ContactsData>) : RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding = ContactNameListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val currentContact = contactsData[position]
        val binding = holder.binding
        binding.tvname.text = currentContact.displayName
        binding.tvemail.text = currentContact.emailAddress
        binding.tvimage.text=currentContact.avator
        currentContact.avator.also { binding.tvimage.tag  }
        binding.tvphonenumber.text = currentContact.phoneNumber
        Picasso.get()
            .load(currentContact.avator)
            .resize(80, 80)
            .centerInside()
            .transform(CropCircleTransformation())
            .into(binding.tvimage)
    }

    override fun getItemCount(): Int {
        return contactsData.size
    }

    class ContactViewHolder(val binding: ContactNameListBinding) : RecyclerView.ViewHolder(binding.root)
}

private fun RequestCreator.into(tvimage: Any) {


}

class ContactNameListBinding(val root: View) {

    val tvemail: Any = TODO()
    val tvname: Any
        get() {
            TODO()
        }

    val tvimage: Any
        get() {
            TODO()
        }

    companion object {
        fun inflate(from: LayoutInflater?, parent: ViewGroup, b: Boolean): ContactNameListBinding {
            TODO("Not yet implemented")
        }
    }
}
