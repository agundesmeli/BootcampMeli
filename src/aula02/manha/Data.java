package aula02.manha;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Data {

    private GregorianCalendar gc;
    private Date data;
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    public Data(Date data){
        this.gc = new GregorianCalendar();
        this.gc.setTime(data);
        this.data = data;
    }

    public Data(String data){
        try {
            this.gc = new GregorianCalendar();
            this.gc.setTime(formatter.parse(data));
            this.data = formatter.parse(data);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void adicionarDia() {
        gc.add(Calendar.DAY_OF_MONTH, 1);
        data = gc.getTime();
    }


    public void verificarData() {
        String hoje = formatter.format(new Date());
        if (formatter.format(this.data).equals(hoje)) {
            System.out.println("A data está correta");
        } else {
            System.out.println("A data não está correta");
        }
    }

    @Override
    public String toString() {
        return formatter.format(data);
    }

}
