/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTOs;

import com.google.gson.JsonObject;

/**
 *
 * @author baske
 */
public class ChuckDTO {
    String value;
    String url;

    public ChuckDTO(String value, String url) {
        this.value = value;
        this.url = url;
    }

    public String getValue() {
        return value;
    }

    public String getUrl() {
        return url;
    }
    
    
    
}
