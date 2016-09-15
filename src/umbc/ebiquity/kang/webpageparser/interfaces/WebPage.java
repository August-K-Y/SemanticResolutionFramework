package umbc.ebiquity.kang.webpageparser.interfaces;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.jsoup.nodes.Document;

import umbc.ebiquity.kang.instanceconstructor.entityframework.object.EntityPath;
import umbc.ebiquity.kang.webpageparser.CrawlerUrl;
import umbc.ebiquity.kang.webpageparser.WebPathPath;

public interface WebPage {

	String getHostName();

	void setHostName(String hostName);

	void extractLinks(Set<String> visitedPage);

	Map<String, String> getExternalLinks();

	void addDecendant(WebPage webPage);

	void addPredecessor(WebPage top);

	CrawlerUrl getPageURL();

	void load() throws IOException; 

	Document getWebPageDocument();

	List<WebPathPath> listWebTagPathsWithTextContent();

	void addEntityPath(EntityPath termPath);

	Collection<EntityPath> getEntityPaths();

	String getPageURLAsString();

	String getBaseURL();

	void analyzeWebPage();   

//	String getPageURLString();     

}
