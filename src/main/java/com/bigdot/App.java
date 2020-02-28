package com.bigdot;

import com.bigdot.spider.spider;

import java.io.IOException;

/**
 * Hello world!
 *
 */

public class App
{
    public static void main( String[] args ) throws IOException {
        String[] checkString = {
            "test",
                "test2"
        };
        spider.main(checkString);
        System.out.println( "Hello World!" );
    }

}
