/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food.management.system;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

class MyObjectOutputStream extends ObjectOutputStream{
    public MyObjectOutputStream() throws IOException{
        super();
    }
    public MyObjectOutputStream(OutputStream o) throws IOException{
        super(o);
}
    public void writeStreamHeader(){}
}
