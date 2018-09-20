package com.deepoon.hystrix;

public interface RemoteService {
    Response call(Request request);
}
