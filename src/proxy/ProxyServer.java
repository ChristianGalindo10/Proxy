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
public class ProxyServer implements Server {

    RealServer srv;

    private int port;

    private String host;

    public ProxyServer(int port, String host) {

        this.port = port;

        this.host = host;

        srv = null;

        System.out.println("Proxy iniciado...");

    }

    @Override
    public void download(String url) {
        if (isRestricted(url)) {

            System.out.println("Actualmente se encuentra en un área que no permite la descarga del fichero.");

        } else {

            if (srv == null) {

                srv = new RealServer(port, host);

            }

            srv.download(url);
            

        }

    }

    public boolean isRestricted(String fichero) {

        return fichero.equals("/descarga/prohibida.avi");

    }

}
