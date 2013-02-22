package dcll.truc.mysimplexml;

import java.io.IOException;

import nu.xom.*;



public class MyMojo
{
	  public static void main(String[] args) throws ParsingException, IOException {
	        Builder builder = new Builder();
	        Document doc = builder.build("NezFile.xml");
	        /*Element root = doc.getRootElement();
	        Element utc = new Element("utc");
	        Attribute att = new Attribute("offset", "-08:00");
	        utc.addAttribute(att);
	        root.insertChild(0, "\n ");
	        root.insertChild(1, utc);
	        root.removeChild(4);
	        root.removeChild(4);*/
	        System.out.println(doc.toXML());
	  }
}
