package kieunga.com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import kieunga.com.model.SanPham;

public class TestSanPham {

	public static void main(String[] args) {
		ArrayList<SanPham>dsSP=new ArrayList<SanPham>();
		dsSP.add(new SanPham(1,"Pepsi",25));
		dsSP.add(new SanPham(2,"Coca",15));
		dsSP.add(new SanPham(3,"Redbull",20));
		for(SanPham sp:dsSP)
		{
			System.out.println(sp);
		}
		Collections.sort(dsSP);
		System.out.println("Danh sách sản phẩm sau khi Sort:");
		for(SanPham sp:dsSP)
		{
			System.out.println(sp);
		}
	}

}
