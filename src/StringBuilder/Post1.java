package StringBuilder;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Post1 {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Comment c1 = new Comment("Tudo tranquilo!! \n");
		Comment c2 = new Comment("Aplicação efetuada com sucesso!");
		Post pt = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand", "Facebook", 100);

		pt.addComment(c1);
		pt.addComment(c2);

		System.out.println(pt);
		
		
		Comment c3 =new Comment("AEEEEEEEEEEEEEEEEEEEEEEE \n");
		Comment c4 = new Comment("DEU CERTO!!!");
		Post pt2 = new Post(sdf.parse("25/12/2000 09:45:02"),"Segundo comentário", "Instagram", 200);
		
		pt2.addComment(c3);
		pt2.addComment(c4);
		
		System.out.println(pt2);
		
		
	}

}
