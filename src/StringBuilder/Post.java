package StringBuilder;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	Date moment;
	String title;
	String comment;
	int likes;

	List<Comment> coment = new ArrayList<>();
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Comment e = new Comment();

	public Post() {
	}

	public Post(Date moment, String title, String comment, int likes) {

		this.moment = moment;
		this.title = title;
		this.comment = comment;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public String getTitle() {
		return title;
	}

	public String getComment() {
		return comment;
	}

	public int getLikes() {
		return likes;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setComent(String comment) {
		this.comment = comment;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public void addComment(Comment comment) {
		coment.add(comment);
	}

	public void removeComment(Comment comment) {
		coment.remove(comment);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append("Likes - ");
		sb.append(likes + "\n");
		
		sb.append(sdf.format(moment) + "\n");
		sb.append(comment + "\n");
		sb.append("Comentários: \n");
		for (Comment c : coment) {
			
			System.out.println();
			sb.append(c.getText());
		
		}
		return sb.toString();
	}
}
