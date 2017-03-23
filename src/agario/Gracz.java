package agario;

/**
 * Created by Karoll0 on 2017-03-23.
 */
public class Gracz {
    private int wspol_x;
    private int wspol_y;
    private int promien;
    private int id_gracza;
    private String name;
    public Gracz(int x , int y, int r)
    {
        this.wspol_x = x;
        this.wspol_y = y;
        this.promien = r;
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
        this.wspol_y = wspol_y;
    }

    public int getWspol_x() {
        return wspol_x;
    }

    public void setWspol_x(int wspol_x) {
        this.wspol_x = wspol_x;
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
