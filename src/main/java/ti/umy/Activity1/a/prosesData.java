/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti.umy.Activity1.a;

/**
 *
 * @author Asus
 */
public class prosesData {

    public Double getnPrice (String inputHarga)
    {
        Double nPrice = Double.valueOf(inputHarga);
        return nPrice;
    }
    
    public Double getnKilo (String inputJumlah)
    {
        Double nKilo = Double.valueOf(inputJumlah);
        return nKilo;
    }
    
    public Double getPay (String inputBayar)
    {
        Double nPay = Double.valueOf(inputBayar);
        return nPay;
    }

    public Double getTotal (Double nHarga, Double nKilo)
    {
        Double jumlahBayarAwal = nHarga * nKilo;
        return jumlahBayarAwal;
    }
    
    public String getDiscount (Double jumlahBayarAwal, Double totalPaid)
    {
        String discount = "";
        if (jumlahBayarAwal < 16000)
        {
            return discount = "0%";
        }
        else if (jumlahBayarAwal >= 1600 && jumlahBayarAwal < 25000)
        {
            return discount = "10%";
        }
        else if (jumlahBayarAwal >= 25000)
        {
            return discount = "15%";
        }    
        return discount;
    }
    
    public Double getnDiscount (Double jumlahBayarAwal)
    {
        Double nDiscount = null;
        Double diskon = 0.0;
        if (jumlahBayarAwal < 16000)
        {
            nDiscount = jumlahBayarAwal * diskon / 100;
            return nDiscount;
        }
        else if (jumlahBayarAwal >= 1600 && jumlahBayarAwal < 25000)
        {
            diskon = 10.0;
            nDiscount = jumlahBayarAwal * diskon / 100;
            return nDiscount;
        }
        else if (jumlahBayarAwal >= 25000)
        {
            diskon = 15.0;
            nDiscount = jumlahBayarAwal * diskon / 100;
            return nDiscount;
        }    
        return nDiscount;
    }
    
    public Double getPaid (Double jumlahBayarAwal)
    {
        Double totalPaid = null;
        if (jumlahBayarAwal < 16000)
        {
            totalPaid = jumlahBayarAwal - (jumlahBayarAwal * 0/100);
            return totalPaid;
        }
        else if(jumlahBayarAwal >= 16000 && jumlahBayarAwal < 25000)
        {
            totalPaid = jumlahBayarAwal - (jumlahBayarAwal * 10/100);
            return totalPaid;
        }
        else if (jumlahBayarAwal >= 25000)
        {
            totalPaid = jumlahBayarAwal - (jumlahBayarAwal * 15/100);
            return totalPaid;
        }
        return totalPaid;
    }
        
    public String getChange (Double nPay, Double totalPaid)
    {
        String Kembalian = "";
        Double nChange = 0.0;
        if (nPay == totalPaid)
        {
            return Kembalian = "Uang anda pas. Terima Kasih.";
        }
        else if (nPay > totalPaid)
        {
            nChange = nPay - totalPaid;
            return Kembalian = "Uang Kembalian anda Rp." + nChange;
        }
        else if (nPay < totalPaid)
        {
            nChange = totalPaid - nPay;
            return Kembalian = "Uang anda kurang Rp." +nChange;
        }
        return Kembalian;
    }
}