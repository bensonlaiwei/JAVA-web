
<%@page import="java.awt.Font"%>
<%@page import="javax.imageio.ImageIO"%>
<%@page import="java.awt.Graphics"%>
<%@page import="java.awt.font.GraphicAttribute"%>
<%@page import="java.awt.image.BufferedImage"%>
<%@ page import="java.awt.Color,java.util.Random"%>
<%@ page pageEncoding="UTF-8"%>
<%@ page contentType="image/jpeg" %>


<%!Color getRandColor(int fc, int bc){
	Random random = new Random();
	
	if(fc>255){
		fc=255;
		
	}
	if(bc > 255){
		bc=255;
	}
		
	int r =fc+random.nextInt(bc-fc);
	int g = fc+random.nextInt(bc-fc);
	int b = fc+random.nextInt(bc-fc);

	return new Color(r,g,b);
	}
%>

<% 
	response.setHeader("Pragma", "No-cache");//無緩存
	response.setHeader("Cache-Control", "No-cache");//無緩存
	response.setHeader("Expires", "0");//無緩存
	
	int width =80;//圖寬
	int height=25;//圖高
	
	BufferedImage image = new BufferedImage(width, height ,BufferedImage.TYPE_INT_RGB);
	Graphics g = image.getGraphics();//取的圖形內容
	Random random = new Random();//亂數
	
	g.setColor(getRandColor(250, 350));//設置背景顏色
	g.setFont(new Font("新細明體",Font.PLAIN,18));//字型設置
	g.fillRect(0, 0, width, height);
	g.setColor(getRandColor(160, 200));
	
	
	for (int i=0; i<155 ; i++){ //屬於干擾線，讓字型不意辨識
		int x=random.nextInt(width);
		int y=random.nextInt(height);
		int x1=random.nextInt(12);
		int y1=random.nextInt(12);
		g.drawLine(x, y, x1, y1);//畫長線
	}
	
	
	StringBuffer sRand = new StringBuffer();//保留產生的字串
	String[] str={
			"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
			"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",
			"1","2","3","4","5","6","7","8","9","0"};
	
	for(int i=0; i<4;i++){
		String rand = str[random.nextInt(str.length)];
		sRand.append(rand);
		g.setColor(new Color(20+random.nextInt(110),20+random.nextInt(110),20+random.nextInt(110)));
		g.drawString(rand, 16*i+6, 19);
		
	}
	
	session.setAttribute("rand", sRand.toString());
	g.dispose();//圖片生效
	ImageIO.write(image,"JPEG",response.getOutputStream());
	out.clear();
	out=pageContext.popBody();
	
	
	
	
	
%>