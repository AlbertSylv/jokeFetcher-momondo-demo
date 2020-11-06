/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTOs;

/**
 *
 * @author baske
 */
public class DadDTO {
    private final String joke;
    private final String url;

    public DadDTO(String joke, String url) {
        this.joke = joke;
        this.url = url;
    }

    public String getJoke() {
        return joke;
    }

    public String getUrl() {
        return url;
    }
    
    
    
}
