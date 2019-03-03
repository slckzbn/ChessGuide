package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application  {

	public static void main(String[] args) {
		Application.launch(args);
	}
	static int intsay;
	static int sayac_hamle;
	static boolean okKontrol;
	static TextArea txtAcilis;
	static TextArea txtMatlar;
	ComboBox<String> cmbAcilis;
	ComboBox<String> cmbMatlar;
	Line lineAcilis;
	Line lineMatlar;
	Line lineTemel;
	static hamle tbHamle;
    @Override
    public void start(Stage stage) throws Exception {
    	try {
			stage.setTitle("Chess Guide");

	        // create a tabpane
	        TabPane tabpane = new TabPane();
	        // create Tab
	        Tab tbAcilis = new Tab("Açýlýþ Hamleleri");
	        Tab tbMatlar = new Tab("Matlar");
	        Tab tbTemel = new Tab("Taþ Hareketleri");
	        tbAcilis.setClosable(false);
	        tbMatlar.setClosable(false);
	        tbTemel.setClosable(false);
	        //Database kodlarý
	        String myDriver = "com.mysql.jdbc.Driver";
	        String db = "jdbc:mysql://localhost/chessguide";
	        Class.forName(myDriver);
	        Connection conn = DriverManager.getConnection(db, "root", "");
	        //resimleri dizi þeklinde,sýnýftan yaratma
	        imgsPath img = new imgsPath();
	        Image[][] imgs = new Image[][] {{img.bg=new Image(img.fbg)},
	        	{img.ba=new Image(img.fba),img.bf=new Image(img.fbf),img.bk=new Image(img.fbk),img.bp=new Image(img.fbp),img.bs=new Image(img.fbs),img.bv=new Image(img.fbv)},
	        	{img.sa=new Image(img.fsa),img.sf=new Image(img.fsf),img.sk=new Image(img.fsk),img.sp=new Image(img.fsp),img.ss=new Image(img.fss),img.sv=new Image(img.fsv)}};
	        // create AnchorPane
	        AnchorPane apTemel = new AnchorPane();
	        AnchorPane apAcilis = new AnchorPane();
	        AnchorPane apMatlar = new AnchorPane();
	        //Buton ekleme temel hamleler
	        Button btnKale = new Button("",new ImageView(imgs[1][2]));
	        btnKale.setLayoutX(100);
	        btnKale.setLayoutY(40);
	        Button btnAt = new Button("",new ImageView(imgs[1][0]));
	        btnAt.setLayoutX(200);
	        btnAt.setLayoutY(40);
	        Button btnFil = new Button("",new ImageView(imgs[1][1]));
	        btnFil.setLayoutX(300);
	        btnFil.setLayoutY(40);
	        Button btnSah = new Button("",new ImageView(imgs[1][4]));
	        btnSah.setLayoutX(400);
	        btnSah.setLayoutY(40);
	        Button btnVezir = new Button("",new ImageView(imgs[1][5]));
	        btnVezir.setLayoutX(500);
	        btnVezir.setLayoutY(40);
	        Button btnPiyon = new Button("",new ImageView(imgs[1][3]));
	        btnPiyon.setLayoutX(600);
	        btnPiyon.setLayoutY(40);
	        //ImageView Flama
	        ImageView temelFlama = new ImageView(img.temelFlama = new Image(img.ftemelFlama));
	        temelFlama.setFitHeight(350);
	        temelFlama.setFitWidth(250);
	        temelFlama.setX(535);
	        temelFlama.setY(125);
	        //create Line
	        lineAcilis = new Line();
	        lineMatlar = new Line();
	        lineTemel = new Line();
	        lineAcilis.setStrokeWidth(2.0);
	        lineAcilis.setStyle("-fx-stroke: rgb(255,255,200,0.6);");
	        lineMatlar.setStrokeWidth(2.0);
	        lineMatlar.setStyle("-fx-stroke: rgb(255,255,200,0.6);");
	        lineTemel.setStrokeWidth(0.0);
	        //createlabel
	        Label[] lblTemel=new Label[16];
	        //addlabel
	        labelLocation(lblTemel,apTemel);
	        //TasCiz
	        board[][] tahtaTemel = new board[8][8];
	        TahtaCiz(tahtaTemel,imgs,apTemel);
	        //buttonClickEvent
	        btnKale.setOnAction(e -> {
	        	TemelHizalama(tahtaTemel,imgs,lineTemel);
	        	TemelHamle(conn,tahtaTemel,imgs,"temel","Kale",tbMatlar,tbAcilis,lineTemel);
            });
	        btnAt.setOnAction(e -> {
	        	TemelHizalama(tahtaTemel,imgs,lineTemel);
	        	TemelHamle(conn,tahtaTemel,imgs,"temel","At",tbMatlar,tbAcilis,lineTemel);
            });
	        btnFil.setOnAction(e -> {
	        	TemelHizalama(tahtaTemel,imgs,lineTemel);
	        	TemelHamle(conn,tahtaTemel,imgs,"temel","Fil",tbMatlar,tbAcilis,lineTemel);
            });
	        btnSah.setOnAction(e -> {
	        	TemelHizalama(tahtaTemel,imgs,lineTemel);
	        	TemelHamle(conn,tahtaTemel,imgs,"temel","Sah",tbMatlar,tbAcilis,lineTemel);
            });
	        btnVezir.setOnAction(e -> {
	        	TemelHizalama(tahtaTemel,imgs,lineTemel);
	        	TemelHamle(conn,tahtaTemel,imgs,"temel","Vezir",tbMatlar,tbAcilis,lineTemel);
            });
	        btnPiyon.setOnAction(e -> {
	        	TemelHizalama(tahtaTemel,imgs,lineTemel);
	        	TemelHamle(conn,tahtaTemel,imgs,"temel","Piyon",tbMatlar,tbAcilis,lineTemel);
            });
	        //apTemel eklemeler
	        tbTemel.setContent(apTemel);
	        apTemel.getChildren().addAll(btnKale,btnAt,btnFil,btnSah,btnVezir,btnPiyon,temelFlama,lineTemel);
	        // create combobox
	        cmbAcilis = new ComboBox<>();
	        cmbAcilis.setPromptText("Bir açýlýþ türü seçiniz.");
	        cmbAcilis.setEditable(false);
	        cmbAcilis.setLayoutX(320);
	        cmbAcilis.setLayoutY(50);
	        //create textArea
	        txtAcilis = new TextArea();
	        txtAcilis.setEditable(false);
	        txtAcilis.setLayoutX(550);
	        txtAcilis.setLayoutY(120);
	        txtAcilis.setPrefHeight(400);
	        txtAcilis.setPrefWidth(200);
	        //create Label
	        Label lblAcilisHamle = new Label("Hamleler");
	        lblAcilisHamle.setLayoutX(610);
	        lblAcilisHamle.setLayoutY(95);
	        lblAcilisHamle.setFont(new Font("Arial", 18));
	        Label[] lblAcilis=new Label[16];
	        //addlabel
	        labelLocation(lblAcilis,apAcilis);
	        //cmb add islemleri
	        cmbEkleme(conn,cmbAcilis,"acilis");
	        //board
	        board[][] tahtaAcilis = new board[8][8];
	        //tahta çiz ..
	        TahtaCiz(tahtaAcilis,imgs,apAcilis);
	        //tas hizalama ..
	        TasHizalama(tahtaAcilis,imgs,lineAcilis);
	        tbAcilis.setContent(apAcilis);
	        apAcilis.getChildren().add(lblAcilisHamle);
	        apAcilis.getChildren().add(lineAcilis);
	        apAcilis.getChildren().add(cmbAcilis);
	        apAcilis.getChildren().add(txtAcilis);
	        //cmp degistigi zaman hamleleri cekme
	        cmbAcilis.setOnAction(e -> {
	        	TasHizalama(tahtaAcilis,imgs,lineAcilis);
	        	cmbHamle(conn,tahtaAcilis,imgs,cmbAcilis,"acilis",tbMatlar,tbTemel,txtAcilis,lineAcilis);
	            });
	        // create AnchorPane
	        // create combobox
	        cmbMatlar = new ComboBox<>();
	        cmbMatlar.setPromptText("Bir mat türü seçiniz.");
	        cmbMatlar.setEditable(false);
	        cmbMatlar.setLayoutX(320);
	        cmbMatlar.setLayoutY(50);
	        //create textArea
	        txtMatlar = new TextArea();
	        txtMatlar.setEditable(false);
	        txtMatlar.setLayoutX(550);
	        txtMatlar.setLayoutY(120);
	        txtMatlar.setPrefHeight(400);
	        txtMatlar.setPrefWidth(200);
	        //create Label
	        Label lblMatlarHamle = new Label("Hamleler");
	        lblMatlarHamle.setLayoutX(610);
	        lblMatlarHamle.setLayoutY(95);
	        lblMatlarHamle.setFont(new Font("Arial", 18));
	        Label[] lblMatlar=new Label[16];
	        //addlabel
	        labelLocation(lblMatlar,apMatlar);
	        //cmb add islemleri
	        cmbEkleme(conn,cmbMatlar,"matlar");
	        //board
	        board[][] tahtaMatlar = new board[8][8];
	        //tahta çiz ..
	        TahtaCiz(tahtaMatlar,imgs,apMatlar);
	        //tas hizalama ..
	        TasHizalama(tahtaMatlar,imgs,lineMatlar);
	        tbMatlar.setContent(apMatlar);
	        apMatlar.getChildren().add(lineMatlar);
	        apMatlar.getChildren().add(cmbMatlar);
	        apMatlar.getChildren().add(lblMatlarHamle);
	        apMatlar.getChildren().add(txtMatlar);
	        //cmp degistigi zaman hamleleri cekme
	        cmbMatlar.setOnAction(e -> {
	        	TasHizalama(tahtaMatlar,imgs,lineMatlar);
	        	cmbHamle(conn,tahtaMatlar,imgs,cmbMatlar,"matlar",tbAcilis,tbTemel,txtMatlar,lineMatlar);
	            });
	        //tabpane ekleme
	        tabpane.getTabs().add(tbTemel);
	        tabpane.getTabs().add(tbAcilis);
	        tabpane.getTabs().add(tbMatlar);
	        // create a scene
	        Scene scene= new Scene(tabpane, 800, 600);
	        scene.getStylesheets().add("application.css");
	        stage.setScene(scene);
	        img.ico = new Image(img.fico);
	        stage.getIcons().add(img.ico);
	        stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}

    }
    public static void TahtaCiz(board[][] tahta,Image[][] imgs,AnchorPane apAcilis){
    	int loc_x=120,loc_y=120;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				tahta[j][i] = new board();
				tahta[j][i].imgv = new ImageView();
				tahta[j][i].imgv.setImage(imgs[0][0]);
				tahta[j][i].imgv.setX(loc_x);
				tahta[j][i].imgv.setY(loc_y);
				tahta[j][i].loc_x=loc_x;
				tahta[j][i].loc_y=loc_y;
				loc_x+=50;
				if(j%8==7)
				{
					loc_x=120;
					loc_y+=50;
				}
				tahta[j][i].tasCinsi="";
				apAcilis.getChildren().add(tahta[j][i].imgv);
			}
		}
    }

    public static void TasHizalama(board[][] tahta,Image[][] imgs,Line line) {
    	line.setStartX(0);
		line.setStartY(0);
		line.setEndX(0);
		line.setEndY(0);
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if((j>=0 && j<8) || (i>=0 && i<8)) {
					tahta[j][i].imgv.setImage(imgs[0][0]);
					tahta[j][i].tasCinsi="bg";
				}
				if(j==0 && i==0 || j==7 && i==0) {
					tahta[j][i].imgv.setImage(imgs[1][2]);
					tahta[j][i].tasCinsi="sk";
					}
				if(j==1 && i==0 || j==6 && i==0) {
					tahta[j][i].imgv.setImage(imgs[1][0]);
					tahta[j][i].tasCinsi="sa";
					}
				if(j==2 && i==0 || j==5 && i==0) {
					tahta[j][i].imgv.setImage(imgs[1][1]);
					tahta[j][i].tasCinsi="sf";
					}
				if(j==3 && i==0) {
					tahta[j][i].imgv.setImage(imgs[1][5]);
					tahta[j][i].tasCinsi="sv";
					}
				if(j==4 && i==0) {
					tahta[j][i].imgv.setImage(imgs[1][4]);
					tahta[j][i].tasCinsi="ss";
					}
				if((j>=0 && j<8) && i==1) {
					tahta[j][i].imgv.setImage(imgs[1][3]);
					tahta[j][i].tasCinsi="sp";
					}
				if((j>=0 || j<8) && i==6) {
					tahta[j][i].imgv.setImage(imgs[2][3]);
					tahta[j][i].tasCinsi="bp";
					}
				if(j==0 && i==7 || j==7 && i==7) {
					tahta[j][i].imgv.setImage(imgs[2][2]);
					tahta[j][i].tasCinsi="bk";
					}
				if(j==1 && i==7 || j==6 && i==7) {
					tahta[j][i].imgv.setImage(imgs[2][0]);
					tahta[j][i].tasCinsi="ba";
					}
				if(j==2 && i==7 || j==5 && i==7) {
					tahta[j][i].imgv.setImage(imgs[2][1]);
					tahta[j][i].tasCinsi="bf";
					}
				if(j==3 && i==7) {
					tahta[j][i].imgv.setImage(imgs[2][5]);
					tahta[j][i].tasCinsi="bv";
					}
				if(j==4 && i==7) {
					tahta[j][i].imgv.setImage(imgs[2][4]);
					tahta[j][i].tasCinsi="bs";
					}
			}
		}
	}

    public static void TemelHizalama(board[][] tahta,Image[][] imgs,Line line) {
    	line.setStartX(0);
		line.setStartY(0);
		line.setEndX(0);
		line.setEndY(0);
    	for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if((j>=0 && j<8) || (i>=0 && i<8)) {
					tahta[j][i].imgv.setImage(imgs[0][0]);
					tahta[j][i].tasCinsi="bg";
				}
			}
		}
    }

    public static void TemelHamle(Connection conn,board[][] tahta,Image[][] imgs,String form,String tasCins,Tab tb,Tab tb2,Line line) {
    	try {
        	tb.setDisable(true);
        	tb2.setDisable(true);
        	String[] hamleler = new String[36];
    		sayac_hamle=0;
    	    PreparedStatement sorguHamle =conn.prepareStatement("SELECT Hamle FROM "+form+" WHERE Ad=?");
    	    sorguHamle.setString(1, tasCins);
    	    Statement st = conn.createStatement();
    	    ResultSet rs = sorguHamle.executeQuery();
    	    while (rs.next())
    	    {
    	    	String s_hamle=rs.getString("Hamle");
    	    	for (String retval:s_hamle.split("-")) {
    	    		hamleler[sayac_hamle] = retval.trim();
            		sayac_hamle++;
            	  }
    	    }
    	    st.close();
    	    intsay=0;
    	    okKontrol=false;
            Timeline SecondsWonder = new Timeline(new KeyFrame(Duration.millis(1000), new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                	tbHamle = new hamle(tahta,imgs,hamleler[intsay],okKontrol,line);
                	intsay++;
                	okKontrol=true;
                	if(intsay%2==0)
                	{
                		okKontrol=false;
                	}
                	if(intsay==sayac_hamle)
                	{
                    	tb.setDisable(false);
                    	tb2.setDisable(false);
                	}
                }
            }));
            SecondsWonder.setCycleCount(sayac_hamle);
            SecondsWonder.play();
    	  }
    	  catch (Exception a)
    	  {
    	    System.err.println("Hata ! ");
    	    System.err.println(a.getMessage());
    	  }
    }

    public static void cmbEkleme(Connection conn,ComboBox<String> cmb,String form) {
    	try
        {

          String sorguAd = "SELECT Ad FROM "+form;
          Statement st = conn.createStatement();
          ResultSet rs = st.executeQuery(sorguAd);
          while (rs.next())
          {
        	  cmb.getItems().add(rs.getString("Ad"));
          }
          st.close();
        }

        catch (Exception a)
        {
          System.err.println("Hata ! ");
          System.err.println(a.getMessage());
        }
    }

    public static void cmbHamle(Connection conn,board[][] tahta,Image[][] imgs,ComboBox<String> cmb,String form,Tab tb,Tab tb2,TextArea txt,Line line) {
    	try {
    	cmb.setDisable(true);
    	tb.setDisable(true);
    	tb2.setDisable(true);
    	String[] hamleler = new String[150];
		sayac_hamle=0;
	    PreparedStatement sorguHamle =conn.prepareStatement("SELECT Hamle FROM "+form+" WHERE Ad=?");
	    sorguHamle.setString(1, cmb.getValue());
	    Statement st = conn.createStatement();
	    ResultSet rs = sorguHamle.executeQuery();
	    while (rs.next())
	    {
	    	String s_hamle=rs.getString("Hamle");
	    	for (String retval:s_hamle.split("-")) {
	    		hamleler[sayac_hamle] = retval.trim();
        		sayac_hamle++;
        	  }
	    }
	    st.close();
	    intsay=0;
	    txt.setText("");
	    okKontrol=false;
        Timeline SecondsWonder = new Timeline(new KeyFrame(Duration.millis(1000), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	tbHamle = new hamle(tahta,imgs,hamleler[intsay],okKontrol,line);
            	String temp = txt.getText()+"\n"+hamleler[intsay];
            	intsay++;
            	okKontrol=true;
            	if(intsay%2==0)
            	{
            		txt.setText(temp);
            		okKontrol=false;
            	}
            	if(intsay==sayac_hamle)
            	{
            		cmb.setDisable(false);
                	tb.setDisable(false);
                	tb2.setDisable(false);
            	}
            }
        }));
        SecondsWonder.setCycleCount(sayac_hamle);
        SecondsWonder.play();
	  }
	  catch (Exception a)
	  {
	    System.err.println("Hata ! ");
	    System.err.println(a.getMessage());
	  }
    }

    public static void labelLocation(Label[] lbl,AnchorPane ap) {
    	char karakter = 'A';
    	for (int i = 0; i < 8; i++) {
			lbl[i]=new Label();
			lbl[i].setLayoutX(105);
			lbl[i].setLayoutY(85+(i+1)*50);
			lbl[i].setText(""+(8-i));
			lbl[i].setFont(new Font("Cambria", 16));
			ap.getChildren().add(lbl[i]);
		}
    	for (int i = 8; i < 16; i++) {
    		lbl[i]=new Label();
			lbl[i].setLayoutX(95+(i-7)*50);
			lbl[i].setLayoutY(520);
			lbl[i].setText(""+karakter);
			lbl[i].setFont(new Font("Cambria", 16));
			karakter++;
			ap.getChildren().add(lbl[i]);
		}
    }
}