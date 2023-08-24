package com.example.yo.fragments

interface MyDbInterface {
    fun addLabel(label: Label)
    fun getAllLabel():ArrayList<Label>
    fun editLabel(label: Label)
    fun deleteLabel(label: Label)
}