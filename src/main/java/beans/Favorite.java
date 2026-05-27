package beans;

import java.io.Serializable;

public class Favorite implements Serializable {
	private String name;
	private String URL;

	public String getName() {
		return name;
	}

	public String getURL() {
		return URL;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setURL(String url) {
		URL = url;
	}

}
