package com.fdh.designpattern.chaninOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Request request = new Request();
        request.str = "大家好:)，<script>，欢迎访问 mashibing.com ，大家都是996 ";
        Response response = new Response();
        response.str = "response";

        FilterChain filterChain = new FilterChain();
        filterChain.add(new HtmlFilter()).add(new SensitiveWordFilter());
        filterChain.doFilTer(request,response);
        System.out.println(request);
        System.out.println(response);
    }
}
