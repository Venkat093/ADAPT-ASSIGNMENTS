package Assignment5Q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class news
{
	private int newsId;
	private String postByUser;
	private String CommentByUser;
	private String comment;
	public news(int newsId, String postByUser, String commentByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postByUser = postByUser;
		CommentByUser = commentByUser;
		this.comment = comment;
	}
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public String getPostByUser() {
		return postByUser;
	}
	public void setPostByUser(String postByUser) {
		this.postByUser = postByUser;
	}
	public String getCommentByUser() {
		return CommentByUser;
	}
	public void setCommentByUser(String commentByUser) {
		CommentByUser = commentByUser;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String toString()
	{
		return "News [comment=" + comment + ", commentByUser=" + CommentByUser + ", newsId=" + newsId
                      + ", postedByUser=" + postByUser + "]";

	}
}
public class Assignment5Q2 {

public static int maxComments(ArrayList<news> news) {
        int max=0;
        for(news x: news)
        {
            if(max<x.getComment().length())
            max=x.getComment().length();
        }
        return max;
    }

    public static int budgetCount (ArrayList < news > news) {
        int max=0;
        for(news x: news)
        {
            if(x.getComment().contains("budget"))
            max++;
        }
        return max;
    }
    public static String maxCommentsByUser (ArrayList < news > news) {
        int maxi=0;
        String max="";
        for(news x: news)
        {
            if(maxi<x.getCommentByUser().length())
            {
                maxi=x.getCommentByUser().length();
                max=x.getCommentByUser();
            }
        }
        return max;
    }

    public static HashMap<String, Integer> sortMaxCommentsByUser (List < news > news) {
            HashMap<String, Integer> commentsByUserMap= new HashMap<>();
            Collections.sort(news,(o1,o2)->o1.getCommentByUser().length()>o2.getCommentByUser().length()?1:-1);
            for(news x: news)
            commentsByUserMap.put(x.getPostByUser(),x.getCommentByUser().length());
            return commentsByUserMap;
    }

	public static void main(String[] args) {
		 news n1= new news(1, "vnky", "Hello World!", "First News");
	        news n2= new news(1, "sai", "yoooooo sai"," Second News");
	        news n3= new news(1, "mano", "howu  din", "Third News");
	        news n4= new news(1, "Venkat", "wassup", "Fourth News");

	        ArrayList<news> list= new ArrayList<>();
	        list.add(n1);
	        list.add(n2);
	        list.add(n3);
	        list.add(n4);
	        
	        System.out.println(sortMaxCommentsByUser(list));
	        System.out.println(maxComments(list));
	        System.out.println(budgetCount(list));
	        System.out.println(maxCommentsByUser(list));



	}

}
