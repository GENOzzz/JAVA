public class Song { //p242_3
	String title, artist, country;
	int year;
	Song(){
	}
	Song(int year,String country,String artist,String title){
		this.year=year;
		this.country=country;
		this.artist=artist;
		this.title=title;
	}
	void show() {
		System.out.println(this.year+"�� "+this.country+"������ "+this.artist+"�� �θ� "+this.title);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song song=new Song(1978,"������","ABBA","Dancing Queen");
		song.show();
	}

}
