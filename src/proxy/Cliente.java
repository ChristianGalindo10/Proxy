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
public class Cliente {

    public static void main(String[] args) {

        Server srv = new ProxyServer(20, "http://paginadedescarg.com");

        srv.download("/descarga/permitida.avi");

        srv.download("/descarga/prohibida.avi");

    }
}
