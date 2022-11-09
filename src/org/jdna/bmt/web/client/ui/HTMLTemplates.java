package org.jdna.bmt.web.client.ui;

import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;

public interface HTMLTemplates extends SafeHtmlTemplates {
	@Template("<div><b>{0}</b><br>{1} <em>at line {2} and column {3}</em></div>")
	public SafeHtml createConfigError(String name, String msg, int line, int col);

	@Template("<a class=\"MetadataPunchout\" href=\"{1}\" target=\"{2}\">{0}</a>")
	public SafeHtml createMetadataPunchout(String name, String url, String targetId);

	@Template("<a class=\"MetadataPunchout\" href=\"http://www.imdb.com/title/{1}/\" target=\"_imdb\">{0}</a>")
	public SafeHtml createIMDBPunchout(String name, String id);

	@Template("<a class=\"MetadataPunchout\" href=\"http://www.themoviedb.org/movie/{1}\" target=\"_tmdb\">{0}</a>")
	public SafeHtml createTMDBPunchout(String name, String id);

	@Template("<a class=\"MetadataPunchout\" href=\"http://www.themoviedb.org/tv/{1}\" target=\"_tmdb\">{0}</a>")
	public SafeHtml createTMDBTVPunchout(String name, String id);

	@Template("<a class=\"MetadataPunchout\" href=\"http://thetvdb.com/?tab=series&id={1}\" target=\"_tvdb\">{0}</a>")
	public SafeHtml createTVDBPunchout(String name, String id);

	@Template("<a class=\"MetadataPunchout\" style=\"white-space:pre-wrap;\" href=\"{2}\" target=\"{3}\">{0}&nbsp;&nbsp;<br>{1}&nbsp;&nbsp;</a>")
	public SafeHtml createTVDBAttributionPunchout(String name1, String name2, String url, String targetId);

	@Template("<a class=\"MetadataPunchout\" href=\"{1}\" target=\"{2}\"><img src=\"images/tvdb1.png\" alt=\"{0}\"></a>")
	public SafeHtml createTVDBAttributionImagePunchout(String name, String url, String targetId);

}
