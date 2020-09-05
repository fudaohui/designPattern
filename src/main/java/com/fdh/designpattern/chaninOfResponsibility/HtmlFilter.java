package com.fdh.designpattern.chaninOfResponsibility;

public class HtmlFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        request.str = request.str.replaceAll("<", "[").replaceAll(">", "]") + "HTMLFilter()";
        filterChain.doFilTer(request, response);
        response.str += "--HTMLFilter()";
    }
}
