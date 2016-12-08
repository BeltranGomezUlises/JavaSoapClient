/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplesoapclient;

import Utils.WSUtils;
import java.util.LinkedHashMap;

/**
 *
 * @author Ulises Beltrán Gómez --- beltrangomezulises@gmail.com
 */
public class SOAPLogin {

    public static void main(String[] args) {
        
        LinkedHashMap<String, Object> params = new LinkedHashMap();
        params.put("nom_usuario", "alex");
        params.put("des_pass", "1");
        
        String response = WSUtils.consumeService("get_consulta_usuario_s", params);
    }
}
