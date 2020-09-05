package com.fdh.designpattern.chaninOfResponsibility;

public class SensitiveWordFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        request.str = request.str.replaceAll("996", "955") + " SensitiveFilter()";
        filterChain.doFilTer(request,response);
        response.str += "--SensitiveFilter()";
    }
}
