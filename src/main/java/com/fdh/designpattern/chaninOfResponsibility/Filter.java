package com.fdh.designpattern.chaninOfResponsibility;

public interface Filter {

    void doFilter(Request request, Response response, FilterChain filterChain);
}
