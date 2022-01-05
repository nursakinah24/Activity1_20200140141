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
        prosesData pro = new prosesData();
        
        String inputBuah = data.getParameter("var_inputbuah");
        String inputHarga = data.getParameter("var_inputharga");
        String inputJumlah = data.getParameter("var_inputjumlah");
        String inputBayar = data.getParameter("var_inputbayar");
        
        Double iHarga = pro.getnPrice(inputHarga);
        Double iJumlah = pro.getnKilo(inputJumlah);
        Double iBayar = pro.getPay(inputBayar);
        Double jumlahBayarAwal = pro.getTotal(iHarga, iJumlah);
        Double totalBayar = pro.getPaid(jumlahBayarAwal);
        String Discount = pro.getDiscount(jumlahBayarAwal, totalBayar);
        Double nDiskon = pro.getnDiscount(jumlahBayarAwal);
        String nKembali = pro.getChange(iBayar, totalBayar);
        
        proses.addAttribute("buah", inputBuah);
        proses.addAttribute("harga", inputHarga);
        proses.addAttribute("jumlahKilo", inputJumlah);
        proses.addAttribute("jumlahAwal", jumlahBayarAwal);
        proses.addAttribute("getDisc", Discount);
        proses.addAttribute("discount", nDiskon);
        proses.addAttribute("totalBayar", totalBayar);
        proses.addAttribute("bayar", inputBayar);
        proses.addAttribute("kembali", nKembali);
        
        return "NurSakinah";
    }
    
}