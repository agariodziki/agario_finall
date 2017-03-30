package agario;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import static java.lang.StrictMath.abs;

/**
 * Created by Karoll0 on 2017-03-23.
 */
public class Gracz  {
    private int wspol_x;
    private int wspol_y;
    private int promien;
    private int id_gracza;
    private boolean isAlive;
    private String name;
    Graphics g;
    public Gracz(int x , int y, int r)
    {
        this.wspol_x = x;
        this.wspol_y = y;
        this.promien = r;
        this.g = g;
    }

    public int getPromien() {
        return promien;
    }

    public void setPromein(int promien) {
        this.promien = promien;
    }

    public int getWspol_y() {
        return wspol_y;
    }

    public void setWspol_y(int wspol_y) {

        if((this.wspol_y+wspol_y)/2>0)
        {
            this.wspol_y = (this.wspol_y+wspol_y)/2;
        }
    }

    public int getWspol_x() {
        return wspol_x;
    }

    public void setWspol_x(int wspol_x) {
        if((this.wspol_x+wspol_x)/2>0)
        {
            int a =this.wspol_x-wspol_x;
            int b =this.wspol_y-wspol_y;
            if(abs(a)>15|| abs(b)>15)
            {
                this.wspol_x = this.wspol_x+(this.wspol_x+wspol_x)/10;
                this.wspol_y = this.wspol_y+(this.wspol_y+wspol_y)/10;
            }
            else{
                this.wspol_x = this.wspol_x+(this.wspol_x+wspol_x)/10;
                this.wspol_y = this.wspol_y+(this.wspol_y+wspol_y)/10;
            }

        }
        System.out.println(this.wspol_x);
        System.out.println(wspol_x);
    }
    public void setWspol_x_y(int wspol_x,int wspol_y) {
        if((this.wspol_x+wspol_x)/2>0)
        {
            int a =this.wspol_x-wspol_x;
            int b =this.wspol_y-wspol_y;
            if(abs(a)>15|| abs(b)>15)
            {
                this.wspol_x =(this.wspol_x+wspol_x)/5;
                this.wspol_y = (this.wspol_y+wspol_y)/5;
            }
            else{
                this.wspol_x =(this.wspol_x+wspol_x)/5;
                this.wspol_y = (this.wspol_y+wspol_y)/5;
            }
        }
        System.out.println(this.wspol_x);
        System.out.println(wspol_x);
    }
    public int getId_gracza() {
        return id_gracza;
    }

    public void setId_gracza(int id_gracza) {
        this.id_gracza = id_gracza;
    }

    public void setName(String name) {
        this.name = name;
    }

}
