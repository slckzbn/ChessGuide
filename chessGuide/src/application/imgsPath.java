package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.scene.image.Image;

public class imgsPath {
	FileInputStream ftemelFlama;
	FileInputStream fico;
	FileInputStream fbg;
	FileInputStream fba;
	FileInputStream fbf;
	FileInputStream fbk;
	FileInputStream fbp;
	FileInputStream fbs;
	FileInputStream fbv;
	FileInputStream fsa;
	FileInputStream fsf;
	FileInputStream fsk;
	FileInputStream fsp;
	FileInputStream fss;
	FileInputStream fsv;
	Image temelFlama;
	Image ico;
	Image bg;
    Image ba;
    Image bf;
    Image bk;
    Image bp;
    Image bs;
    Image bv;
    Image sa;
    Image sf;
    Image sk;
    Image sp;
    Image ss;
    Image sv;
	public imgsPath() {
		try {
			ftemelFlama = new FileInputStream("src/img/temelFlama.png");
			fico = new FileInputStream("src/img/chess_icon.png");
			fbg = new FileInputStream("src/img/bg.png");
			fba = new FileInputStream("src/img/ba.png");
			fbf = new FileInputStream("src/img/bf.png");
			fbk = new FileInputStream("src/img/bk.png");;
			fbp = new FileInputStream("src/img/bp.png");;
			fbs = new FileInputStream("src/img/bs.png");;
			fbv = new FileInputStream("src/img/bv.png");;
			fsa = new FileInputStream("src/img/sa.png");;
			fsf = new FileInputStream("src/img/sf.png");;
			fsk = new FileInputStream("src/img/sk.png");;
			fsp = new FileInputStream("src/img/sp.png");;
			fss = new FileInputStream("src/img/ss.png");;
			fsv = new FileInputStream("src/img/sv.png");;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
