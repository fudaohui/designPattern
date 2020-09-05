package com.fdh.designpattern.chaninOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {

    List<Filter> filters = new ArrayList();
    int index = 0;

    public FilterChain add(Filter filter) {
        filters.add(filter);
        return this;
    }

    public void doFilTer(Request request, Response response) {
        if (index == filters.size()) return;
        Filter filter = filters.get(index);
        index++;
        filter.doFilter(request, response, this);
    }
}
