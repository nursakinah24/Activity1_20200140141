/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti.umy.Activity1.a;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Asus
 */
@Controller
public class prosesInputan {
    @RequestMapping ("/proses")
    public String getProses(HttpServletRequest data, Model proses)
    {
        String inputBuah = data.getParameter("var_inputbuah");
        String inputHarga = data.getParameter("var_inputharga");
        String inputJumlah = data.getParameter("var_inputjumlah");
        
        Double iHarga = Double.valueOf(inputHarga);
        Double iJumlah = Double.valueOf(inputJumlah);
        Double jumlahBayarAwal = iHarga * iJumlah;
        Double getTotal = null;
        Integer diskon = 0;
        Double getDiskon = 0.0;
        
        
        if (jumlahBayarAwal < 16000)
        {
            getTotal = jumlahBayarAwal - (jumlahBayarAwal * diskon/100);
            getDiskon = jumlahBayarAwal * diskon / 100;
        }
        else if(jumlahBayarAwal < 25000)
        {
            diskon = 10;
            getTotal = jumlahBayarAwal - (jumlahBayarAwal * diskon/100);
            getDiskon = jumlahBayarAwal * diskon / 100;
        }
        else
        {
            diskon = 15;
            getTotal = jumlahBayarAwal - (jumlahBayarAwal * diskon/100);
            getDiskon = jumlahBayarAwal * diskon / 100;
        }
        
        proses.addAttribute("buah", inputBuah);
        proses.addAttribute("harga", inputHarga);
        proses.addAttribute("jumlahKilo", inputJumlah);
        proses.addAttribute("jumlahAwal", jumlahBayarAwal);
        proses.addAttribute("getDisc", getDiskon);
        proses.addAttribute("discount", diskon);
        proses.addAttribute("totalBayar", getTotal);
        
        return "NurSakinah";
    }
    
}
