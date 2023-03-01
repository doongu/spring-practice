package di_01;

public class Greeting {
	private String name;
	private ILog log;
	
	public Greeting() {
		System.out.println("Greeting »ý¼ºµÊ.");
	}
	public void setLog(ILog log) {
		this.log = log;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		log.log("ÀÌ¸§ ¼³Á¤:"+name);
		this.name = name;
	}
	public String getMessage() {
		String msg = "¾È³çÇÏ¼¼¿ä" + name + "´Ô";
		log.log(msg);
		return msg;
	}
}
