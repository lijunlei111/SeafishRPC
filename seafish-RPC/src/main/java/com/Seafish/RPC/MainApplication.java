package com.Seafish.RPC;


import com.Seafish.RPC.Server.HttpServer;
import com.Seafish.RPC.Server.Impl.VertxHttpServer;

/**
 * Hello world!
 *
 */
public class MainApplication
{
    public static void main( String[] args )
    {
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
    }
}
