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
public class OurDTO {
    String joke1;
    String ref1;
    String joke2;
    String ref2;

    public OurDTO(ChuckDTO cDTO, DadDTO dDTO) {
        this.joke1 = cDTO.getValue();
        this.ref1 = cDTO.getUrl();
        this.joke2 = dDTO.getJoke();
        this.ref2 = dDTO.getUrl();
        
    }

    public String getJoke1() {
        return joke1;
    }

    public String getRef1() {
        return ref1;
    }

    public String getJoke2() {
        return joke2;
    }

    public String getRef2() {
        return ref2;
    }

    

    
    
    
}
