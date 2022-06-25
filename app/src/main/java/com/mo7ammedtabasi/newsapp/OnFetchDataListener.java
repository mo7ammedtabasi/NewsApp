package com.mo7ammedtabasi.newsapp;

import com.mo7ammedtabasi.newsapp.Models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListener<NewsApiResponse> {
    void onFetchData(List<NewsHeadlines> list,String message);
    void onError(String message);
}
