package com.shalu.bookhub.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface BookDao {

    @Insert
    fun insertBook(BookEntity: BookEntity)

    @Delete
    fun deleteBook(BookEntity: BookEntity)

    @Query("SELECT * FROM books")
    fun getAllBooks(): List<BookEntity>

    @Query("SELECT * FROM books WHERE bookId = :bookId")
    fun getBookId(bookId: String): BookEntity
}