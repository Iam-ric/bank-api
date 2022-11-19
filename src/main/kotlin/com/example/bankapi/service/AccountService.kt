package com.example.bankapi.service

import com.example.bankapi.model.Account
import java.util.*

interface AccountService {

    fun create(account: Account): Account

    fun getAll(): List<Account>

    fun getById(id: Long): Optional<Account>

    fun update(id: Long, account: Account): Optional<Account>

    fun delete(id: Long)
}