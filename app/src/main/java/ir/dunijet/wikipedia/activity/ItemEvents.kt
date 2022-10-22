package ir.dunijet.wikipedia.activity

import ir.dunijet.wikipedia.data.ItemPost

interface ItemEvents {
    fun onItemClicked(itmePost: ItemPost)
}