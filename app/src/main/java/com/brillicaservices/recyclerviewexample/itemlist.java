package com.brillicaservices.recyclerviewexample;

/**
 * Created by user on 6/10/2018.
 */

public class itemlist {
    private String heading;
    private String description;

    public itemlist(String heading, String description) {
        this.heading = heading;
        this.description = description;
    }

    public String getHeading() {
        return heading;
    }

    public String getDescription() {
        return description;
    }
}
