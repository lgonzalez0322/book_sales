package book_central.entity;



import java.util.Comparator;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class books {

	private String book_id;
	private String title_id;
	private String author_id;
	private String isbn_id;
	public int compareTo(books that) {
		
		return Comparator
				.comparing(books::getAuthor_id)
				.thenComparing(books::getTitle_id)
				.compare(this, that);
	}
}

