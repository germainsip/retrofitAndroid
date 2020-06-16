package com.germain.retrofitandroid;

import java.util.List;

import retrofit2.Call;

public interface ApiService {

    Call<List<Post>> getPosts();
}
