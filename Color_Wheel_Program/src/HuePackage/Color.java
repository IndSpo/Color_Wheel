/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HuePackage;

/**
 *
 * @author India
 */
public class Color {
    private int rgbRed;
    private int rgbGreen;
    private int rgbBlue;
    private boolean isColor;
    
    public Color(int rgbRed, int rgbGreen, int rgbBlue){
        this.rgbRed = rgbRed;
        this.rgbGreen = rgbGreen;
        this.rgbBlue = rgbBlue;
        this.isColor = true;
    }
    
    public int getRgbRed(){
        return rgbRed;
    }
    
    public void setRgbRed(int rgbRed){
        if (rgbRed >= 0 && rgbRed <= 255){
            rgbRed = this.rgbRed;
        }
    }
    public int getRgbGreen(){
        return rgbGreen;
    }
    
    public void setRgbGreen(int rgbGreen){
        if (rgbGreen >= 0 && rgbGreen <= 255){
            rgbGreen = this.rgbGreen;
        }
    }
    public int getRgbBlue(){
        return rgbBlue;
    }
    
    public void setRgbBlue(int rgbBlue){
        if (rgbBlue >= 0 && rgbBlue <= 255){
            rgbBlue = this.rgbBlue;
        
        }
    }
     public boolean isColor(){
         return this.isColor;
     }   


}
    

