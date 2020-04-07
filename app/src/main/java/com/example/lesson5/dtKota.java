package com.example.lesson5;

import java.util.ArrayList;

public class dtKota {
    private static String[] nama = {
            "Depok",
            "Bogor",
            "Bandung",
            "Ciamis",
            "Sukabumi"
    };

    public static ArrayList<Kota> getListData(){
        ArrayList<Kota> list = new ArrayList<>();
        for (int i = 0; i<nama.length; i++){
            Kota kota = new Kota();
            kota.setNama(nama[i]);
            list.add(kota);
        }
        return list;
    }
}
