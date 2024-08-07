package com.Seafish.provider;


import com.Seafish.RPC.registry.LocalhostRegistry;
import com.Seafish.RPC.service.HttpServer.HttpServer;
import com.Seafish.RPC.service.HttpServer.VertxHttpServer;
import com.Seafish.common.Service.UserService;
import com.Seafish.provider.Service.UserServiceImpl;

/**
 * Hello world!
 *
 */
public class MainApplication
{
    public static void main( String[] args )
    {
        LocalhostRegistry.registry(UserService.class.getName(), UserServiceImpl.class);

        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
    }
}
