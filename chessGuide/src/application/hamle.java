package application;

import javafx.animation.ScaleTransition;
import javafx.scene.image.Image;
import javafx.scene.shape.Line;
import javafx.util.Duration;

public class hamle {
	public hamle(board[][] tahta,Image[][] imgs,String baslangic,boolean okKontrol,Line line) {
		char tasRenk = baslangic.charAt(0);
		int tasRenkint=0,tasCinsint=0;
		char tasCins = baslangic.charAt(1);
		String tasCinstam=String.valueOf(tasRenk);
		tasCinstam+=String.valueOf(tasCins);
		char kareHarf = baslangic.charAt(2);
		int kareHarfint = 0;
		char kareSayi = baslangic.charAt(3);
		int kareSayiint = Character.getNumericValue(kareSayi);
		kareSayiint--;
		kareSayiint=8-kareSayiint;
		kareSayiint--;
		
		switch (kareHarf) {
		case 'a':
			kareHarfint=0;
			break;
		case 'b':
			kareHarfint=1;
			break;
		case 'c':
			kareHarfint=2;
			break;
		case 'd':
			kareHarfint=3;
			break;
		case 'e':
			kareHarfint=4;
			break;
		case 'f':
			kareHarfint=5;
			break;
		case 'g':
			kareHarfint=6;
			break;
		case 'h':
			kareHarfint=7;
			break;
		default:
			break;
		}
		
		switch (tasRenk) {
		case 'b':
			tasRenkint=2;
			break;
		case 's':
			tasRenkint=1;
			break;
		default:
			tasRenkint=0;
			break;
		}
		
		switch (tasCins) {
		case 'a':
			tasCinsint=0;
			break;
		case 'f':
			tasCinsint=1;
			break;
		case 'k':
			tasCinsint=2;
			break;
		case 'p':
			tasCinsint=3;
			break;
		case 's':
			tasCinsint=4;
			break;
		case 'v':
			tasCinsint=5;
			break;
		default:
			tasCinsint=0;
			break;
		}
		
		try {
			ScaleTransition st =new ScaleTransition(Duration.millis(500),tahta[kareHarfint][kareSayiint].imgv);
			st.setFromX(1.5);
			st.setFromY(1.5);
			st.setToX(1);
			st.setToY(1);
			st.setCycleCount(1);
			st.play();
			if(okKontrol) {
				line.setStartX(tahta[kareHarfint][kareSayiint].loc_x+25); 
				line.setStartY(tahta[kareHarfint][kareSayiint].loc_y+25); 
				line.setEndX(x); 
				line.setEndY(y); 
			}
			if(tahta[kareHarfint][kareSayiint].tasCinsi.equals(tasCinstam))
			{
				tahta[kareHarfint][kareSayiint].imgv.setImage(imgs[0][0]);
				tahta[kareHarfint][kareSayiint].tasCinsi="bg";
				x=tahta[kareHarfint][kareSayiint].loc_x+25;
				y=tahta[kareHarfint][kareSayiint].loc_y+25;
			}
			else {
				tahta[kareHarfint][kareSayiint].imgv.setImage(imgs[tasRenkint][tasCinsint]);
				tahta[kareHarfint][kareSayiint].tasCinsi=tasCinstam;
			}
		} catch (Exception e) {
			
		}
	}
	static int x;
	static int y;
}
