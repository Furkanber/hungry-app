package com.kodluyoruz.hungryapp.utils

import com.kodluyoruz.hungryapp.data.entity.Menu

interface IMealOnClick {
    fun onClick(menu: Menu)
}