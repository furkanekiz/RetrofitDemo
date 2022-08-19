package com.furkanekiz.retrofitdemo

import retrofit2.Response
import retrofit2.http.*

interface AlbumService {

    //https://jsonplaceholder.typicode.com/albums
    @GET("/albums")
    suspend fun getAlbums(): Response<Albums>

    @GET("/albums")
    suspend fun getSortedAlbums(@Query("userId") userId: Int): Response<Albums>

    @GET("/albums/{id}")
    suspend fun getAlbum(@Path(value = "id") albumId: Int): Response<AlbumsItem>

    @POST("/albums")
    suspend fun uploadAlbum(@Body albumsItem: AlbumsItem): Response<AlbumsItem>
}