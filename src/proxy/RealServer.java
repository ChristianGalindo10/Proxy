/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author estudiantes
 */
public class RealServer implements Server {

    private int port;

    private String host;

    public RealServer(int port, String host) {

        this.port = port;

        this.host = host;

        System.out.println("Servidor iniciado...");

    }

    @Override
    public void download(String url) {
        System.out.println("Descargando " + host + ":" + port + "/" + url);
    }

}
